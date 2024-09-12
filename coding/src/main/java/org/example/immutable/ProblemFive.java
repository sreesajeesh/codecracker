package org.example.immutable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProblemFive {

    public static void main(String[] args) {
        final ImmutableMelon melon1 = new ImmutableMelon("Crenshaw", 2000);
        final ImmutableMelon melon2 = new ImmutableMelon("Gac", 1200);
        List<ImmutableMelon> list = Collections.unmodifiableList(Arrays.asList(melon1, melon2));
        ImmutableMelon melon = list.getFirst();
        //Cannot call set method
    }
}
