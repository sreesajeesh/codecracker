package org.example.designpatterns.observer.flipkart;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class Product implements Subject{
    private List<Observer> observers = new ArrayList<>();

    private String              productName;
    private String              productType;
    private String              productPrice;
    private String              availability;

    public Product(String productName, String productType, String productPrice, String availability){
        this.productName = productName;
        this.productPrice = productPrice;
        this.productType = productType;
        this.availability = availability;
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    public void setAvailability( String availability )
    {
        this.availability = availability;
        System.out.println("Availability changed from Not available to Available");
        notifyObserver();
    }

    @Override
    public void notifyObserver() {
        System.out.println("Product Name " +
                this.productName + " Product Type " +
                this.productType + " Product Price " +
                this.productPrice + "is available now So notifying all users");
        System.out.println();
        for(Observer observer : observers){
            observer.update(this.availability);
        }
    }
}
