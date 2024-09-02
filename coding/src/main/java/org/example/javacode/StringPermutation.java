package org.example.javacode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class StringPermutation {

    public static void main(String[] args) {
        System.out.println(getPermutationSet("", "ABCD"));
    }

    public static Set<String> getPermutationSet2(String prefix, String str, Set<String> permutation){
        int n = str.length();
        if(n == 0)
            permutation.add(prefix);
        else {
            IntStream.range(0, n)
                    .parallel()
                    .forEach(i-> permutation.addAll(getPermutationSet2(prefix + str.charAt(i), str.substring(i+1, n) + str.substring(0,i), permutation)));
        }
        return permutation;
    }

    public static void getPermutation(String prefix, String str){
        int n = str.length();
        if(n == 0){
            System.out.println(prefix + "");
        } else {
            IntStream.range(0,n)
                    .parallel()
                    .forEach(i -> getPermutation(prefix + str.charAt(i), str.substring(i + 1, n) + str.substring(0, i) ));
        }
    }

    public static Set<String> getPermutationSet(String prefix, String str){
        Set<String> permutationSet = new HashSet<>();
        int n = str.length();
        if(n == 0)
            permutationSet.add(prefix);
        else {
            IntStream.range(0, n)
                    .parallel()
                    .forEach(i-> permutationSet.addAll(getPermutationSet(prefix + str.charAt(i), str.substring(i+1, n) + str.substring(0,i))));
        }
        return permutationSet;
    }
}
