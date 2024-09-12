package org.example.designpatterns.observer.firestation;

public interface FireStationRegister {

    void registerFireStation(FireObserver fo);
    void notifyFireStation(String address);
}
