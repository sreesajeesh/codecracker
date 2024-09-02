package org.example.kindle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromList {

    public static void main(String[] args) {

    }

    public static <E extends Comparable<E>>List<E> removeDuplicates(List<E> list){
        Set<E> set = new LinkedHashSet<>(list);
        ArrayList<E> arrayList = new ArrayList<>(set);
        Collections.sort(arrayList);
        return arrayList;
    }
}
