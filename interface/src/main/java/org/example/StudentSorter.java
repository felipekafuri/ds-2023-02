package org.example;


import java.util.Collections;
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
        // Ordenar por nome (usando Comparable)
        Collections.sort(students);
        printStudents("Nome", students);

        // Ordenar por sobrenome (usando Comparator)
        Collections.sort(students, new StudentLastNameComparator());
        printStudents("Sobrenome", students);

        // Ordenar por idade
        Collections.sort(students, new StudentAgeComparator());
        printStudents("Idade", students);

        // Ordenar por média de notas
        Collections.sort(students, new StudentAverageGradeComparator());
        printStudents("Média de Notas", students);
    }
}









