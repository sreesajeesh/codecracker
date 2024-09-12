package org.example.fobonacci;

import java.util.HashMap;
import java.util.Map;

public class FibonacciSeries {

    public static void main(String[] args) {
        Map<Integer, Integer> fiboMap = new HashMap<>();
        fiboMap.put(0,0);
        fiboMap.put(1,1);
        printFibonacci(fiboMap, 12);
        fiboMap.forEach((k,v) -> System.out.println(k + " = " + v));
    }

    public static Integer printFibonacci(Map<Integer, Integer> fibMap, int n){
        if(n <= 1){
            return fibMap.get(n);
        } else {
            fibMap.put(n, printFibonacci(fibMap, n-1) + printFibonacci(fibMap, n - 2));
            return fibMap.get(n);
        }
    }

}
