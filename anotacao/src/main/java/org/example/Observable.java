package org.example;

import java.util.ArrayList;
import java.util.List;


public abstract class Observable {
    private List<ObserverInterface> observers = new ArrayList<>();
    private final String identifier;

    public Observable(String identifier) {
        this.identifier = identifier;
    }

    public void addObserver(ObserverInterface observer) {
        observers.add(observer);
    }

    protected void notifyObservers() {
        for (ObserverInterface observer : observers) {
            observer.update();
        }
    }
}

