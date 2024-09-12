package org.example.immutable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProblemTwo {

    public static void main(String[] args) {

        final List<MutableMelon> list = Collections.unmodifiableList(
                Arrays.asList(new MutableMelon("Crenshaw", 2000),
                        new MutableMelon("Gac", 1200)));
        System.out.println(list);
        //weight of melon can be modified by get and set method
        MutableMelon melon1 = list.getFirst();
        MutableMelon melon2 = list.get(1);

        melon2.setWeight(0);
        melon1.setWeight(0);
        System.out.println(list);

    }
}
