package org.example.javacode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctCharacters {

    public static void main(String[] args) {

        System.out.println(distinctCharacters("sajeeshkumar"));

    }

    public static String distinctCharacters(String str){
        return Arrays.stream(str.split(""))
                .distinct()
                .collect(Collectors.joining());
    }
}
