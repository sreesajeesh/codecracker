package org.example.javacode;

public class OnlyDigitString {

    public static void main(String[] args) {

    }

    public static boolean onlyDigit(String s){
        for (int i = 0; i < s.length(); i++) {
            if(!Character.isDigit(s.charAt(i)))
                return false;
        }
        return true;
    }

    public static boolean onlyDigitMatch(String s){
        return s.chars().allMatch(Character::isDigit);
    }
}
