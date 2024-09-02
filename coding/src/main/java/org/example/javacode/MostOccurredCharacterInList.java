package org.example.javacode;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostOccurredCharacterInList {

    public static void main(String[] args) {

    }

    public static Character getMostOccurred(List<String> strList){

        return strList.stream()
                .flatMapToInt(String::chars)
                .mapToObj(a->(char)a)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Comparator.comparingLong(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .stream().findFirst().get();

    }

    public static List<Character> getMostOccurred1(List<String> strList){

        Map<Character, Long> charMap =  strList.stream()
                .flatMapToInt(String::chars)
                .mapToObj(a->(char)a)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        Long max = Collections.max(charMap.values());
        return charMap.entrySet()
                .stream()
                .filter(e -> Objects.equals(e.getValue(), max))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

    }
}
