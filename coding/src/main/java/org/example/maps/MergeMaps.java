package org.example.maps;

import org.example.immutable.MutableMelon;

import java.util.HashMap;
import java.util.Map;

public class MergeMaps {

    public static void main(String[] args) {

        Map<Integer, MutableMelon> melons1 = new HashMap<>();
        Map<Integer, MutableMelon> melons2 = new HashMap<>();
        melons1.put(1, new MutableMelon("Apollo", 3000));
        melons1.put(2, new MutableMelon("Jade Dew", 3500));
        melons1.put(3, new MutableMelon("Cantaloupe", 1500));
        melons2.put(3, new MutableMelon("Apollo", 3000));
        melons2.put(4, new MutableMelon("Jade Dew", 3500));
        melons2.put(5, new MutableMelon("Cantaloupe", 1500));
        System.out.println(mergeMaps(melons1, melons2));

    }

    public static <K,V> Map<K,V> mergeMaps(Map<K,V> map1, Map<K,V> map2){
        Map<K,V> map = new HashMap<>(map1);
        map2.forEach((key,value) -> map.merge(key, value, (v1, v2) -> v2));
        return map;
    }
}
