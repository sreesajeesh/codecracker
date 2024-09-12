package org.example.sorting;

import org.example.javacode.aggregration.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toMap;

public class SortMap {

    public static void main(String[] args) {
        List<Employee> employeeList = Employee.getEmployees();
        Map<Integer, Employee> employeeMap = new HashMap<>();
        Integer i = 0;


        //System.out.println(sortByKeyTreeMap(employeeList));

        List<String> strList = Arrays.asList("abc", "def","ghi", "jkl");
        Map<Integer, String> strMap = new HashMap<>();
        //int i = 0;
        for(String str : strList){
            strMap.put(i++, str);
        }
        Map<Integer, String> stringMap = IntStream.range(0, strList.size())
                .boxed()
                .collect(Collectors.toMap(Function.identity(), strList::get));
        System.out.println(stringMap);
    }

    public static <K,V>TreeMap<K, V> sortByKeyTreeMap(Map<K,V> map){
        return new TreeMap<>(map);
    }

    public static <K,V>Map<K,V> sortByKeyStream(Map<K,V> map, Comparator<? super K> c){
        return map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(c))
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2)->v1, LinkedHashMap::new));
    }

    public static <K,V>Map<K,V> sortByValueStream(Map<K,V> map, Comparator<? super V> c){
        return map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(c))
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2)->v1, LinkedHashMap::new));
    }
}
