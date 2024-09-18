package org.example.misc;

import java.util.Arrays;

public class OddOccurrenceInArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1,1,3,7,3,9,9};
        System.out.println(oddOccurrence(arr));
    }

    public static int oddOccurrence(int[] A){
        Arrays.sort(A);
        for (int i = 0; i < A.length -1; i= i+2) {
            if(A[i] != A[i+1])
                return A[i];
        }
        return A[A.length - 1];
    }
}
