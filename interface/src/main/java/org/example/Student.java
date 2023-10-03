package org.example;

import java.util.List;

public class Student implements Comparable<Student> {
    String firstName;
    String lastName;
    int age;
    List<Integer> grades;

    public Student(String firstName, String lastName, int age, List<Integer> grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.grades = grades;
    }

    double getAverageGrade() {
        return grades.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    @Override
    public int compareTo(Student o) {
        return this.firstName.compareTo(o.firstName);
    }


}