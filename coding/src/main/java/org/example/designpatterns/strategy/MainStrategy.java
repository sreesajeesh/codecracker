package org.example.designpatterns.strategy;

public class MainStrategy {

    public static void main(String[] args) {
        String s = "Hello World 2024";
        System.out.println(Remover.remove(s, t -> t.replaceAll("\\d", "")));
        System.out.println(Remover.remove(s, t-> t.replaceAll("\\s", "")));
    }
}
