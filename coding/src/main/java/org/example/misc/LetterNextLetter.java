package org.example.misc;

import java.util.Arrays;

public class LetterNextLetter {

    public static void main(String[] args) {

        System.out.println(nextLetter(67108876));
        System.out.println(nextLetter(11));
    }

    public static String nextLetter(int N){
        int k = N;
        char value = 'a';
        StringBuilder str = new StringBuilder();
        int i = 0;
        while (k >= 1){
            if(k%2 != 0){
                if((char)(value + i) <= 'z')
                    str.append((char) (value + i));
                else
                    str.append('z');
                k = k -1;
            }else {
                while(k%2 == 0){
                    k = k/2;
                    i++;
                }
            }
        }
        if((char)(value + i) > 'z')
            str.append('z');
        return str.reverse().toString();
    }

}



