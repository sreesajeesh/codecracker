package org.example.kindle;

public class LeapYearValidation {

    public static void main(String[] args) {

    }

    public static Boolean checkLeapYear(int year){
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
