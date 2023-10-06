package org.example;

import java.util.function.Function;

public class NewtonMethod implements Function<Double, Double> {

    private final double tolerance;
    private final int maxIterations;

    public NewtonMethod(double tolerance, int maxIterations) {
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    @Override
    public Double apply(Double number) {
        return sqrt(number, tolerance, maxIterations);
    }

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