package org.example;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        ObserverInterface consoleObserver = () ->
                System.out.println("O carro foi atualizado! Velocidade atual: " + car.getSpeed() + " km/h");

        ObserverInterface logObserver = () -> {
            System.out.println("[LOG] O carro mudou sua velocidade para " + car.getSpeed() + " km/h");
        };

        car.addObserver(consoleObserver);
        car.addObserver(logObserver);

        car.accelerate();
    }
}
