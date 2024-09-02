package org.example.javacode;

import java.util.stream.Collectors;

public class CharacterRemoval {

    public static void main(String[] args) {

        System.out.println(removeCharacter("sajeesh", 'e'));

    }

    public static String removeCharacter(String str, char c){
        return str.chars()
                .filter(a -> a != c)
                .mapToObj(e -> String.valueOf((char) e))
                .collect(Collectors.joining());
    }
}
