package org.example.search;

import java.util.stream.IntStream;

public class FirstIndex {

    public static void main(String[] args) {
        int[] arr = new int[]{2,7,4,8,1,3,8,4,7,2};
        System.out.println(firstIndex(arr, 7));
    }

    public static int firstIndex(int[] arr, int value){
        return IntStream.range(0, arr.length)
                .filter(i -> arr[i] == value)
                .findFirst()
                .orElse(-1);
    }
}
