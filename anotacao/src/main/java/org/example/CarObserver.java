package org.example;

@Observer(observado = "carro")
public class CarObserver implements ObserverInterface {
    @Override
    public void update() {
        System.out.println("Carro foi atualizado!");
    }
}

