package org.example.designpatterns.observer.flipkart;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Observer{

    private String name;

    public Person(String name, Subject subject){
        this.name = name;
        subject.register(this);
    }

    @Override
    public void update(String availability) {
        System.out.println("Hello " + name + "Product is now " + availability + " in flipkart");
    }
}
