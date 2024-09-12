package org.example.sorting;

import java.util.Arrays;
/*
The time complexity cases are as follows:
    best case O(n + k),
    average case O(n + k),
    worst case O(n + k)
    The space complexity case is as follows: worst case O(k)
    k is the number of possible values in the range.
    n is the number of elements to be sorted.
*/
public class CountingSort {

    public static void main(String[] args) {
        int[] arr = new int[]{5,5,3,3,4};
        System.out.println(Arrays.toString(arr));
        sort(arr);
    }

    public static void sort(int[] arr){
        int min = arr[0];
        int max = arr[0];

        for(int value : arr){
            min = Math.min(value, min);
            max = Math.max(value, max);
        }

        System.out.println(min);
        System.out.println(max);

        int[] count = new int[max - min + 1];
        for(int value : arr){
            count[value -min]++;
        }

        System.out.println(Arrays.toString(count));

        int sortIndex = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0){
                arr[sortIndex++] = i + min;
                count[i]--;
            }
        }
    }
}


