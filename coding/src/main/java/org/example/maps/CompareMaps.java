package org.example.maps;

import org.example.immutable.MutableMelon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompareMaps {

    public static void main(String[] args) {
        Map<Integer, MutableMelon> melon1Map = new HashMap<>();
        Map<Integer, MutableMelon> melon2Map = new HashMap<>();
        melon1Map.put(1, new MutableMelon("Crenshaw", 2000));
        melon1Map.put(2, new MutableMelon("Gac", 1200));
        melon2Map.put(1, new MutableMelon("Crenshaw", 2000));
        melon2Map.put(2, new MutableMelon("Gac", 1200));
        System.out.println(melon1Map.equals(melon2Map));

        MutableMelon[] melon1Array = {new MutableMelon("Crenshaw", 2000),
                new MutableMelon("Gac", 1200)};
        MutableMelon[] melon2Array = {new MutableMelon("Crenshaw", 2000),
                new MutableMelon("Gac", 1200)};

        Map<Integer, MutableMelon[]> melonArray1Map = new HashMap<>();
        melonArray1Map.put(1, melon1Array);
        Map<Integer, MutableMelon[]> melonArray2Map = new HashMap<>();
        melonArray1Map.put(1, melon1Array);
        melonArray2Map.put(1, melon2Array);
        //The array in Map will always return false
        System.out.println(melonArray1Map.equals(melonArray2Map));
        //By calling utility function given below right state is return.
        System.out.println(equalsWithArrays(melonArray1Map, melonArray2Map));

        List<MutableMelon> melonList1 = Arrays.asList(new MutableMelon("Crenshaw", 2000),
                new MutableMelon("Gac", 1200));
        List<MutableMelon> melonList2 = Arrays.asList(new MutableMelon("Crenshaw", 2000),
                new MutableMelon("Gac", 1200));
        Map<Integer, List<MutableMelon>> melonList1Map = new HashMap<>();
        melonList1Map.put(1, melonList1);
        Map<Integer, List<MutableMelon>> melonList2Map = new HashMap<>();
        melonList2Map.put(1, melonList2);
        System.out.println(melonList1Map.equals(melonList2Map));
     }

    /*public static boolean equalsWithArrays(
            Map<Integer, MutableMelon[]> first, Map<Integer, MutableMelon[]> second) {
        System.out.println(first.size());
        System.out.println(second.size());
        if (first.size() != second.size()) {
            return false;
        }
        return first.entrySet().stream()
                .allMatch(e -> Arrays.equals(e.getValue(),
                        second.get(e.getKey())));

    }*/

    public static <A, B> boolean equalsWithArrays(
            Map<A, B[]> first, Map<A, B[]> second) {
        if (first.size() != second.size()) {
            return false;
        }
        return first.entrySet().stream()
                .allMatch(e -> Arrays.equals(e.getValue(),
                        second.get(e.getKey())));
    }
}
