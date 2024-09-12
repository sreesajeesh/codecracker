package org.example.designpatterns.template;

public class MainTemplate {

    public static void main(String[] args) {
        Pizza p = new Pizza();
        new PizzaTemplateMaker()
                .make(p,(Pizza s) -> System.out.println("Add bits of tomatoes and onions"));
        new PizzaTemplateMaker()
                .make(p, (Pizza s) -> System.out.println("Add cheese and butter"));
    }
}
