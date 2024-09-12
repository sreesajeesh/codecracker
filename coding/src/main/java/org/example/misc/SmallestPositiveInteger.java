package org.example.misc;

import java.util.Arrays;

public class SmallestPositiveInteger {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 0, -1, -2};
        System.out.println(smallestInteger(arr));
    }

    public static int smallestInteger(int[] A){
        Arrays.sort(A);
        if(A[0] >= 2)
            return 1;
        for (int i = 0; i < A.length - 1; i++) {
            if(A[i] < 0 && A[i+1] >= 2)
                return 1;
            if(A[i] > 0 && A[i + 1] - A[i] > 1){
                return A[i] + 1;
            }
        }
        if(A[A.length -1] > 0)
            return A[A.length -1] + 1;
        return 1;
    }
}
