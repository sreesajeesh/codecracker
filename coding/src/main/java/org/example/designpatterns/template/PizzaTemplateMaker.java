package org.example.designpatterns.template;

import org.example.designpatterns.template.Pizza;

import java.util.function.Consumer;

public class PizzaTemplateMaker {

    public void make(Pizza pizza, Consumer<Pizza> addTopIngredients){
        makeDough(pizza);
        addTopIngredients.accept(pizza);
        bake(pizza);
    }

    private void makeDough(Pizza p){
        System.out.println("Making Dough ...");
    }

    private void bake(Pizza p){
        System.out.println("Baking the pizza ... ");
    }

}
