package org.example.designpatterns.factory.fruits;

public class MainFactory {

    public static void main(String[] args) {
        Gac gac = (Gac) MelonFactory.newInstance(Gac.class);
        Melon melon = (Melon) MelonFactory.newInstance("Gac", 1000, "Green");

        System.out.println(gac.toString());
        System.out.println(melon);
    }
}
