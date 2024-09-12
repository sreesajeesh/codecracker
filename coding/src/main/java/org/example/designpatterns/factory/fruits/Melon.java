package org.example.designpatterns.factory.fruits;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Melon implements Fruit{

    private final String type;
    private final int weight;
    private final String color;

    @Override
    public String toString() {
        return type + "(" + weight + "g, " + color + ")";
    }
}
