package org.example;

import java.util.Comparator;

public class StudentLastNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.lastName.compareTo(o2.lastName);
    }
}