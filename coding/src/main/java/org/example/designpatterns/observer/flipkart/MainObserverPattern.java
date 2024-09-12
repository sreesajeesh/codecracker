package org.example.designpatterns.observer.flipkart;

import java.util.List;

public class MainObserverPattern {

    public static void main(String[] args) {
        Product lenovaI7 = new Product("Lenova I7", "Laptop", "100000 Rs","Not Available");
        Person david = new Person("David", lenovaI7);
        Person peter = new Person("Peter", lenovaI7);

        List<Observer> subscribers = lenovaI7.getObservers();
        for(Observer observer : subscribers){
            Person person = (Person) observer;
            System.out.println("This person " + person.getName() + " has subscribed");
        }
        System.out.println();
        System.out.println("Lenova I7 current state " + lenovaI7.getAvailability());
        System.out.println();
        lenovaI7.setAvailability("Available");
    }
}
