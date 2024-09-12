package org.example.immutable;

import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@NoArgsConstructor
public class ProblemThree {

    private static final List<MutableMelon> list;
    static {
        final MutableMelon melon1 = new MutableMelon("Crenshaw", 2000);
        final MutableMelon melon2 = new MutableMelon("Gac", 1200);
        list = Collections.unmodifiableList(Arrays.asList(melon1, melon2));
    }

    public static void main(String[] args) {
        System.out.println(list);
        //UnsupportedOperationException
        //list.add(new MutableMelon("WaterMelon", 1000));
        //Weight can be modified even there is static definition
        MutableMelon melon1 = list.getFirst();
        MutableMelon melon2 = list.get(1);
        melon2.setWeight(0);
        melon1.setWeight(0);
        System.out.println(list);
    }


}
