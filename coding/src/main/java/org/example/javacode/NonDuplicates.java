package org.example.javacode;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonDuplicates {

    public static void main(String[] args) {
        System.out.println(removeDuplicates("sajeeshkumar"));
    }

    public static String removeDuplicates(String str){
        return str.chars()
                .mapToObj(a->(char)a)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(b -> b.getValue() == 1)
                .map(Map.Entry::getKey)
                .toList()
                .stream().map(Object::toString)
                .collect(Collectors.joining());
        /*
        StringBuilder builder = new StringBuilder();
        for(Character ch : strlist){
            builder.append(ch);
        }
        return builder.toString();
        */

    }
}
