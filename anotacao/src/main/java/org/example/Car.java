package org.example;

public class Car extends Observable {
    private int speed;

    public Car() {
        super("carro");
    }

    public void accelerate() {
        this.speed += 10;
        notifyObservers();
    }

    public int getSpeed() {
        return this.speed;
    }
}
