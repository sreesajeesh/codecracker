package org.example.javacode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class VowelsAndConsonant {

    private static final Set<Character> vowels = new HashSet<>(Arrays.asList('a','e', 'i','o', 'u'));

    public static void main(String[] args) {

    }

    public static List<Long> countVowelConsonant(String str){
        long vowelCount = 0;
        long consonantCount = 0;
        str = str.toLowerCase();
        vowelCount = str.chars().filter(c-> vowels.contains((char)c)).count();
        consonantCount = str.chars()
                .filter(c -> !vowels.contains((char)c))
                .filter(ch -> (ch >= 'a' && ch <= 'z'))
                .count();
        return Arrays.asList(vowelCount, consonantCount);
    }
}
