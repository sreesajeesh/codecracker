package org.example.functionstyle;

/*
A high-order function is a term that's used to characterize a function
that returns a function or takes a function as a parameter.
Based on this statement,
testing a high-order function in the context of lambdas should cover two main cases:
    Testing a method that takes a lambda as a parameter
    Testing a method that returns a functional interface


 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class TestHighOrder {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ann a 15", "Mir el 28", "D oru 33");
        List<String> result = replace(names, (String s) -> s.replaceAll("\\s", ""));
        System.out.println(result);
        Function<String, String> f1 = String::toUpperCase;
        Function<String, String> f2 = (String s)-> s.concat("DONE");
        Function<String, String> f = reduceStrings(f1, f2);
        System.out.println(f.apply("test"));
    }

    public static List<String> replace(List<String> list, Replacer<String> r){
        List<String> result = new ArrayList<>();
        for (String str:list){
            result.add(r.replace(str));
        }
        return result;
    }

    @SafeVarargs
    public static Function<String, String> reduceStrings(Function<String,String> ...functions){
        return Stream.of(functions)
                .reduce(Function.identity(), Function::andThen);
    }
}
