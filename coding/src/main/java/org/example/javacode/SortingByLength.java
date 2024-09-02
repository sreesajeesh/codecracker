package org.example.javacode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingByLength {

    public static void main(String[] args) {
        List<String> strList = Arrays.asList("sajeesh", "kumar", "anusree", "ashmitha", "rajesh");
        System.out.println(sortByLength(strList));
    }

    public static List<String> sortByLength(List<String> strList){
        return strList.stream().sorted(Comparator.comparingInt(String::length).reversed())
                .collect(Collectors.toList());
    }
}
