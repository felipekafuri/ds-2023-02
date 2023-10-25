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
        Observer annotation = observer.getClass().getAnnotation(Observer.class);
        if (annotation != null && annotation.observado().equals(this.identifier)) {
            observers.add(observer);
        } else {
            throw new IllegalArgumentException("Observer não compatível com este Observable.");
        }
    }

    protected void notifyObservers() {
        for (ObserverInterface observer : observers) {
            observer.update();
        }
    }
}
