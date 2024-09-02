package org.example.javacode;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostOccurredCharacter {

    public static void main(String[] args) {

        System.out.println(mostOccurredCharacters1("sajeesh"));

    }

    public static Character mostOccurred(String str){
        return str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Comparator.comparingLong(Map.Entry::getValue))
                .stream().findFirst()
                .map(Map.Entry::getKey)
                .get();
    }

    public static List<Character> mostOccurredCharacters(String str){
        return str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Comparator.comparingLong(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .stream().toList();
    }

    public static List<Character> mostOccurredCharacters1(String str){
        Map<Character, Long> charMap = str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c, Collectors.counting()));
        long max = Collections.max(charMap.values());
        return charMap.entrySet()
                .stream()
                .filter(e -> e.getValue() == max)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

    }
}
