package org.example.immutable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProblemOne {

    public static void main(String[] args) {
        final MutableMelon melon1 = new MutableMelon("Crenshaw", 2000);
        final MutableMelon melon2 = new MutableMelon("Gac", 1200);

        final List<MutableMelon> list = List.of(melon1, melon2);

        System.out.println(list);



        //weights can be modified by set method
        melon1.setWeight(0);
        melon2.setWeight(0);
        System.out.println(list);
    }
}
