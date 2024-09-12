package org.example.lists;

import org.example.immutable.MutableMelon;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class ReplaceMelons {

    public static void main(String[] args) {
        List<MutableMelon> melons1 = new ArrayList<>();
        melons1.add(new MutableMelon("Apollo", 3000));
        melons1.add( new MutableMelon("Jade Dew", 3500));
        melons1.add( new MutableMelon("Cantaloupe", 1500));
        melons1.add( new MutableMelon("Apollo", 3000));
        melons1.add( new MutableMelon("Jade Dew", 3500));
        melons1.add( new MutableMelon("Cantaloupe", 1500));
        System.out.println(melons1);
        UnaryOperator<MutableMelon> operator = t-> (t.getWeight() < 3000) ? new MutableMelon(t.getName(), 3000) : t;
        melons1.replaceAll(operator);
        System.out.println(melons1);
    }
}
