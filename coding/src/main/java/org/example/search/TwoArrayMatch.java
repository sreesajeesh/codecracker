package org.example.search;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TwoArrayMatch {

    public static void main(String[] args) {

    }

    public static boolean matchArrays(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length)
            return false;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1, arr2));
        return IntStream.range(0, arr1.length)
                .allMatch(i -> arr1[i] == arr2[i]);

    }

    public static int mismatchArray(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length)
            return -1;

        System.out.println(Arrays.mismatch(arr1, arr2));
        return IntStream.range(0, arr1.length)
                .filter(i -> arr1[i] != arr2[i])
                .findFirst()
                .orElse(-1);

    }
}
