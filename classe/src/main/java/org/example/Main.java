package org.example;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Uso: fc <nome da classe> <dir> [-p]");
            return;
        }

        String className = args[0];
        File directory = new File(args[1]);

        // Verificar se o diretório existe
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("O diretório fornecido não existe ou não é um diretório válido.");
            return;
        }

        boolean useParallel = args.length == 3 && args[2].equals("-p");

        ClassSearcher searcher = new ClassSearcher(className, directory, useParallel);
        searcher.search();
    }
}