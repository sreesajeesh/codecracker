package org.example.fobonacci;

import java.util.ArrayList;
import java.util.List;

public class FibonacciList {

    public static void main(String[] args) {
        printFibonacci(12).forEach(System.out::println);

    }

    public static List<Integer> printFibonacci(int n){
        List<Integer> fiboList = new ArrayList<>();
        fiboList.add(0);
        fiboList.add(1);
        for (int i = 2; i <= n; i++) {
            fiboList.add(fiboList.get(i - 1) + fiboList.get(i - 2));
        }
        return fiboList;
    }
}
