package org.example.javacode;

import java.util.Arrays;
import java.util.List;

public class FindLongestCommonPrefix {

    public static void main(String[] args) {
        List<String > strList = Arrays.asList("abcd", "abcg", "abcefg", "dbckkefg");
        System.out.println(findCommonPrefix(strList));
    }

    public static String findCommonPrefix(List<String> strList){
        if(strList.size() == 1)
            return strList.getFirst();

        for (int prefixLength = 0; prefixLength < strList.getFirst().length(); prefixLength++) {
            char ch = strList.getFirst().charAt(prefixLength);
            for(String str : strList){
                if(prefixLength >= str.length() || str.charAt(prefixLength) != ch){
                    System.out.println(prefixLength);
                    return strList.getFirst().substring(0, prefixLength);
                }
            }
        }
        return strList.getFirst();
    }
}
