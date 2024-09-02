package org.example.kindle;

import java.util.function.Function;

public class EvenNumberSum implements Function<Integer, Integer> {
    @Override
    public Integer apply(Integer integer) {
        int sum = 0;
        int num = 2;
        while (num <= integer){
            sum = sum + num;
            num = num + 2;
        }
        return sum;
    }

    public static void main(String[] args) {
        EvenNumberSum evenNumberSum = new EvenNumberSum();
        System.out.println(evenNumberSum.apply(5));
    }
}
