package org.example.javacode;

public class ReverseLetterWords {

    public static void main(String[] args) {
        System.out.println(reverseWordsOnly("sajeesh kumar sreenivasan"));
        System.out.println(reverseString("sajeesh kumar sreenivasan"));
    }

    public static String reverseWordsOnly(String str){
        String[] splitStr = str.split(" ");
        StringBuilder strBuilder = new StringBuilder();
        for(String word : splitStr){
            strBuilder.append(new StringBuilder(word).reverse()).append(" ");
        }
        return strBuilder.toString();
    }

    public static String reverseString(String str){
        return new StringBuilder(str).reverse().toString();
    }
}
