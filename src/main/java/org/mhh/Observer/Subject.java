package org.mhh.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Observer> observers = new ArrayList<Observer>();

    void addObserver(Observer observer) {
        observers.add(observer);
    }
    void detachObserver(Observer observer) {
        observers.remove(observer);
    }
    void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
