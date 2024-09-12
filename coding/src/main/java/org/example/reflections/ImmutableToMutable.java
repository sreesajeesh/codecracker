package org.example.reflections;

import java.lang.reflect.Field;

public class ImmutableToMutable {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String str = "Hello";
        System.out.println("Original String: " + str);

        // Get the value field from the String class (the char array)
        Field valueField = String.class.getDeclaredField("value");

        // Make the field accessible since it's private
        valueField.setAccessible(true);

        // Get the internal char[] value of the string
        char[] value = (char[]) valueField.get(str);

        // Modify the internal char[] value
        value[0] = 'Y';

        System.out.println("Modified String: " + str);  // Now outputs "Yello"
    }
}
