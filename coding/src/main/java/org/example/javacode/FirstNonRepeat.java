package org.example.javacode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeat {

    public static void main(String[] args) {
        System.out.println(firstNonRepeatCharacter("sajeeshkumar"));
        System.out.println(Character.MIN_VALUE);
    }

    public static Character firstNonRepeatCharacter(String str){
        return str.chars()
                .mapToObj(a->(char)a)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting() ))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse(Character.MIN_VALUE);
    }
}
