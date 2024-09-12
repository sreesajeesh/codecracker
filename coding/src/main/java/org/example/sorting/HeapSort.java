package org.example.sorting;

public class HeapSort {

    public static void main(String[] args) {

    }

    public static void sort(int[] arr){
        int n = arr.length;
        while (n > 1){
            swap(arr, 0, n);
            n--;
            heapify(arr, n,0);
        }

    }

    private static void buildHeap(int[] arr, int n){
        for (int i = arr.length/2; i >= 0 ; i--) {
            heapify(arr, n, i);
        }
    }

    private static void heapify(int[] arr, int n, int i){
        int left = i * 2 + 1;
        int right = i * 2 + 2;

        int greater;
        if(left < n && arr[left] > arr[i]){
            greater = left;
        } else {
            greater = i;
        }

        if(right < n && arr[right] > arr[greater]){
            greater = right;
        }

        if(greater != i){
            swap(arr, i, greater);
            heapify(arr, n, greater);
        }
    }

    private static void swap(int[]arr, int i, int greater){
        int temp = arr[i];
        arr[i] = arr[greater];
        arr[greater] = temp;
    }
}
