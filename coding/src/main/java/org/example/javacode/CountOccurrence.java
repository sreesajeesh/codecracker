package org.example.javacode;

public class CountOccurrence {

    public static void main(String[] args) {
        System.out.println(countOccurrence("aabbbccccddddd", 'd'));
    }

    public static long countOccurrence(String str, char c){
        return str.chars().filter(a -> a == c)
                .count();
    }
}
