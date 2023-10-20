package org.example;


import org.objectweb.asm.ClassReader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.FileInputStream;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;
import java.io.IOException;
public class ClassSearcher {

    private final String className;
    private final File directory;
    private final boolean useParallel;

    private int classFilesChecked = 0;
    public ClassSearcher(String className, File directory, boolean useParallel) {
        this.className = className;
        this.directory = directory;
        this.useParallel = useParallel;
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Uso: fc <nome da classe> <dir> [-p]");
            return;
        }

        String className = args[0];
        File directory = new File(args[1]);
        boolean useParallel = args.length == 3 && args[2].equals("-p");

        ClassSearcher searcher = new ClassSearcher(className, directory, useParallel);
        searcher.search();
    }

    private List<File> getRelevantFiles(File directory) {
        List<File> relevantFiles = new ArrayList<>();
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    relevantFiles.addAll(getRelevantFiles(file));
                } else if (isRelevantFile(file)) {
                    relevantFiles.add(file);
                }
            }
        }
        return relevantFiles;
    }

    private boolean isRelevantFile(File file) {
        String name = file.getName();
        return name.endsWith(".class") || name.endsWith(".jar") || name.endsWith(".war");
    }


    public void search() {
        System.out.println("Buscando pela classe " + className + "...");
        long startTime = System.currentTimeMillis();

        List<File> relevantFiles = getRelevantFiles(directory);

        // Usar stream() ou parallelStream() com base na opção fornecida
        Stream<File> fileStream = useParallel ? relevantFiles.parallelStream() : relevantFiles.stream();

        List<String> foundLocations = fileStream
                .filter(this::containsClass)
                .map(File::getAbsolutePath)
                .collect(Collectors.toList());

        // Imprimir os resultados
        if (foundLocations.isEmpty()) {
            System.out.println("Classe não encontrada.");
        } else {
            System.out.println("Classe encontrada nos seguintes locais:");
            foundLocations.forEach(System.out::println);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("\nTempo gasto para realizar a busca: " + (endTime - startTime) + "ms");
        System.out.println("Número de arquivos .class consultados: " + classFilesChecked);
    }

    private boolean containsClass(File file) {
        if (file.getName().endsWith(".class")) {
            classFilesChecked++;
            return classFileContainsClass(file, className);
        } else if (file.getName().endsWith(".jar") || file.getName().endsWith(".war")) {
            return jarContainsClass(file);
        }
        return false;
    }

    private boolean classFileContainsClass(File classFile, String fullClassName) {
        try (FileInputStream fis = new FileInputStream(classFile)) {
            ClassReader reader = new ClassReader(fis);
            ClassChecker checker = new ClassChecker(fullClassName);
            reader.accept(checker, 0);
            return checker.classFound();
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo .class: " + classFile.getAbsolutePath());
        }
        return false;
    }


    private boolean jarContainsClass(File jarFile) {
        try (JarInputStream jarStream = new JarInputStream(new FileInputStream(jarFile))) {
            JarEntry entry;
            while ((entry = jarStream.getNextJarEntry()) != null) {
                if (entry.getName().endsWith(".class")) {
                    classFilesChecked++;
                    if (entry.getName().equals(className + ".class")) {
                        return true;
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo JAR/WAR: " + jarFile.getAbsolutePath());
        }
        return false;
    }
}
