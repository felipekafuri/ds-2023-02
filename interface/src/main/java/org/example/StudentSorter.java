package org.example;


import java.util.Comparator;
import java.util.List;

public class StudentSorter {

    static void printStudents(String criteria, List<Student> students) {
        System.out.println("\nOrdenado por " + criteria + ": ");
        for (Student student : students) {
            System.out.println(student.firstName + " " + student.lastName + " - Idade: "
                    + student.age + " - Média: " + student.getAverageGrade());
        }
    }

    public static void sortAndPrintStudents(List<Student> students) {
        // Ordenar por nome
        students.sort(Comparator.comparing(s -> s.firstName));
        printStudents("Nome", students);

        // Ordenar por sobrenome
        students.sort(Comparator.comparing(s -> s.lastName));
        printStudents("Sobrenome", students);

        // Ordenar por idade
        students.sort(Comparator.comparingInt(s -> s.age));
        printStudents("Idade", students);

        // Ordenar por média de notas
        students.sort(Comparator.comparingDouble(s -> s.getAverageGrade()));
        printStudents("Média de Notas", students);

        // Ordenar por nome de forma decrescente
        students.sort(Comparator.comparing((Student s) -> s.firstName).reversed());
        printStudents("Nome (decrescente)", students);
    }
}









