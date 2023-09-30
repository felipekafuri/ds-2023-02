package org.example;
import org.example.NewtonMethod;
public class Main {
    public static void main(String[] args) {

        double result = NewtonMethod.sqrt(16, 0.0001, 100);
        System.out.println(result);

    }
}