package org.example.maps;

import org.example.immutable.MutableMelon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionMaps {

    public static void main(String[] args) {
        List<MutableMelon> melons1 = new ArrayList<>();
        melons1.add(new MutableMelon("Apollo", 3000));
        melons1.add( new MutableMelon("Jade Dew", 3500));
        melons1.add( new MutableMelon("Cantaloupe", 1500));
        melons1.add( new MutableMelon("Apollo", 3000));
        melons1.add( new MutableMelon("Jade Dew", 3500));
        melons1.add( new MutableMelon("Cantaloupe", 1500));

        Map<Boolean, List<MutableMelon>> separatedMelons = melons1
                .stream()
                .collect(Collectors.partitioningBy((MutableMelon t)->t.getWeight()>= 3000));

        Map<Integer, MutableMelon> melons2 = new HashMap<>();
        melons2.put(1, new MutableMelon("Apollo", 3000));
        melons2.put(2, new MutableMelon("Jade Dew", 3500));
        melons2.put(3, new MutableMelon("Cantaloupe", 1500));
        melons2.put(6, new MutableMelon("Apollo", 3000));
        melons2.put(4, new MutableMelon("Jade Dew", 3500));
        melons2.put(5, new MutableMelon("Cantaloupe", 1500));
        Map<Boolean, List<MutableMelon>> separateMap =
                melons2.values()
                        .stream()
                        .collect(Collectors.partitioningBy((MutableMelon t) -> t.getWeight() >= 3000));
    }
}
