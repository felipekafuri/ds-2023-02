package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Exemplo de Lista de Estudantes usando ArrayList para permitir mutabilidade
        List<Student> students = new ArrayList<>(
                Arrays.asList(
                        new Student("Felipe", "Kafuri", 22, List.of(90, 80, 85)),
                        new Student("Carlos", "Armando", 20, List.of(70, 80, 75))
                )
        );

        StudentSorter.sortAndPrintStudents(students);
    }
}
