package org.example.javacode;

public class SubStringAvailability {

    public static void main(String[] args) {

        System.out.println(checkSubString("sajeesh", "sak"));

    }

    public static boolean checkSubString(String str, String sub){
        return str.contains(sub);
    }
}
