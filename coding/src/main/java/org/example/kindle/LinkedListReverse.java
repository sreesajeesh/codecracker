package org.example.kindle;

import java.util.LinkedList;
import java.util.List;

public class LinkedListReverse {

    public static void main(String[] args) {

        List<Integer> integerList = new LinkedList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        System.out.println(integerList);
        System.out.println(reverse(integerList));

    }

    public static List<Integer> reverse(List<Integer> integerList){
        List<Integer> reversed = new LinkedList<>();
        for (int i = integerList.size() -1; i >= 0; i--) {
            reversed.add(integerList.get(i));
        }
        return reversed;
    }
}
