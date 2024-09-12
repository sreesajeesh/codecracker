package org.example.javacode.aggregration;

import java.util.List;

public class MinMaxAverageAggregation {

    public static void main(String[] args) {
        List<Employee> employeeList = Employee.getEmployees();
        getAggregation(employeeList);
    }

    public static void getAggregation(List<Employee> employeeList){

        //Find Average age
        System.out.println(employeeList
                .stream()
                .map(Employee::getAge)
                .mapToInt(a -> a)
                .average()
                .orElse(-1));

        //Find max salary
        System.out.println(employeeList
                .stream()
                .map(Employee::getSalary)
                .mapToInt(a -> a)
                .max()
                .orElse(-1));
    }
}
