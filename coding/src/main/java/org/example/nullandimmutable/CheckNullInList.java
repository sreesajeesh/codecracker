package org.example.nullandimmutable;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CheckNullInList {

    public static void main(String[] args) {
        List<String> strList = Arrays.asList("abc", null, "123", null, "klm");
        System.out.println(strList);
        System.out.println(checkNull(strList));
    }

    public static List<String> checkNull(List<String> str){
        return str.stream()
                .filter(e -> !Objects.isNull(e))
                .collect(Collectors.toList());
    }
}
