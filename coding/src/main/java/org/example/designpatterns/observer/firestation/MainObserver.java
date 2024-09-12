package org.example.designpatterns.observer.firestation;

public class MainObserver {

    public static void main(String[] args) {
        FireStation fireStation = new FireStation();

        fireStation.registerFireStation((String address) -> {
            if (address.contains("Brookhaven")) {
                System.out.println("Brookhaven fire station will go to this fire");
            }
        });

        fireStation.registerFireStation((String address) -> {
            if (address.contains("Vinings")) {
                System.out.println("Vinings fire station will go to this fire");
            }
        });

        fireStation.registerFireStation((String address) -> {
            if (address.contains("Decatur")) {
                System.out.println("Decatur fire station will go to this fire");
            }
        });

        fireStation.notifyFireStation("Fire alert: WestHaven At Vinings 5901 Suffex Green Ln Atlanta");
    }


}
