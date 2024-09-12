package org.example.javacode.aggregration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private int id;
    private String name;
    private int age;
    private int salary;

    public static List<Employee> getEmployees(){
        return Arrays.asList(
                new Employee(1, "abc", 54, 3600000),
                new Employee(2, "cde", 45, 4500000),
                new Employee(3, "fgh", 33, 2400000),
                new Employee(4, "ijk", 27, 2100000)
        );
    }
}
