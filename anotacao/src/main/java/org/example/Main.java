package org.example;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        CarObserver carObserver = new CarObserver();

        car.addObserver(carObserver);
        car.accelerate();
    }
}