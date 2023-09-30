package org.example;

public class NewtonMethod {

    public static double sqrt(double number, double tolerance, int maxIterations) {
        double estimate = number;
        int iterations = 0;

        while (Math.abs(estimate * estimate - number) > tolerance && iterations < maxIterations) {
            estimate = (estimate + number / estimate) / 2.0;
            iterations++;
        }

        return estimate;
    }
}
