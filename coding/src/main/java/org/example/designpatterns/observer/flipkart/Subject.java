package org.example.designpatterns.observer.flipkart;

public interface Subject {

    public void register(Observer observer);
    public void remove(Observer observer);
    public void notifyObserver();
}
