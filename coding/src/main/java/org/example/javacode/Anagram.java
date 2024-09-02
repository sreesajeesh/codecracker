package org.example.javacode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Anagram {

    public static void main(String[] args) {
        System.out.println(checkAnagram("abcdef", "fedcaa"));
    }

    public static boolean checkAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        return Arrays.equals(s1.chars().sorted().toArray(), s2.chars().sorted().toArray());
    }
}
