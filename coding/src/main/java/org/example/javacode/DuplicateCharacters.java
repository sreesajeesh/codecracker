package org.example.javacode;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacters {

    public static void main(String[] args) {
        System.out.println(getDuplicates("sajeesh"));
    }

    public static Set<Character> getDuplicates(String str){
        List<Character> charList = str.chars().mapToObj(a->(char)a).toList();
        return charList
                .stream()
                .filter(e-> Collections.frequency(charList, e) > 1)
                .collect(Collectors.toSet());
    }

    public static Set<Character> getDuplicates2(String str){
        return str.chars()
                .mapToObj(a->(char)a)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());



    }
}
