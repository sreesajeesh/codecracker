package org.example.javacode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubStringCount {

    public static void main(String[] args) {

        System.out.println(getCount("111", "11"));

    }

    public static int getCount(String str, String sub){
        int count = 0;
        while(str.contains(sub)){
            str = str.replaceFirst(sub,"");
            count++;
        }
        return count;
    }

    public static int getCount1(String str, String sub){
        Pattern pattern = Pattern.compile(Pattern.quote(sub));
        Matcher matcher = pattern.matcher(str);
        int position = 0;
        int count = 0;
        while(matcher.find(position)){
            position = matcher.start() + 1;
            count++;
        }
        return count;
    }
}
