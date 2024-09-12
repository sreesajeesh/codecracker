package org.example.javacode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        reverseArray(arr);
    }

    public static void reverseArray(int[] arr){
        int[] arrk = IntStream.rangeClosed(1, arr.length)
                .map(i -> arr[arr.length -i])
                .toArray();
        System.out.println(Arrays.toString(arrk));
    }
}
