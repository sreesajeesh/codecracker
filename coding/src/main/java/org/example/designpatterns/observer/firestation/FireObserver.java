package org.example.designpatterns.observer.firestation;
@FunctionalInterface
public interface FireObserver {

    void fire(String address);
}
