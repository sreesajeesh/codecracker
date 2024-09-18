package org.example.misc;

import java.util.Arrays;

public class MissingElement {

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,5,1};
        System.out.println(missingElement(arr));
    }

    public static int missingElement(int[] A){
        //Arrays.sort(A);
        int size = A.length;
        long value = ((long) (size + 1) * (size  + 2))/2;
        long sum = 0;
        for (int k : A){
            sum = sum + k;
        }
        return (int)(value -sum);
    }
}

/*
An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.

Your goal is to find that missing element.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A, returns the value of the missing element.

For example, given array A such that:

  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5
the function should return 4, as it is the missing element.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..100,000];
the elements of A are all distinct;
each element of array A is an integer within the range [1..(N + 1)].
Copyright 2009–2024 by Codility Limited. All Rights Reserved. Unauthorized copying,
 */
