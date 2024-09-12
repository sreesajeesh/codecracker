package org.example.javacode;

import java.util.Arrays;

public class MinMaxAverage {

    public static void main(String[] args) {

    }

    public static void MinMaxAverageFromArray(int[] arr){
        System.out.println(Arrays.stream(arr).min());
        System.out.println(Arrays.stream(arr).max());
        System.out.println(Arrays.stream(arr).average());
    }
}
