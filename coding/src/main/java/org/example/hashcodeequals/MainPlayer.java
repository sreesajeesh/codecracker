package org.example.hashcodeequals;

import java.lang.reflect.Field;

public class MainPlayer {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Player p1 = new Player(1, "Dhoni");
        Player p2 = new Player(1, "Dhoni");
        Player p3 = p1;

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        System.out.println(p1 == p3);
        System.out.println(p1.equals(p3));

        PlayerDuplicate pd1 = new PlayerDuplicate(1, "Dhoni");
        PlayerDuplicate pd2 = new PlayerDuplicate(1, "Dhoni");

        System.out.println(pd1 == pd2);
        System.out.println(pd1.equals(pd2));
        System.out.println(pd1.hashCode());
        System.out.println(pd2.hashCode());

        PlayerWithHashCode ph1 = new PlayerWithHashCode(1, "Dhoni");
        PlayerWithHashCode ph2 = new PlayerWithHashCode(1, "Dhoni");

        System.out.println("Hash Code should be same");
        System.out.println(ph1.hashCode());
        System.out.println(ph1.hashCode());

        String str = new String("book");
        System.out.println(str.intern());

        String user = "guest";
        System.out.println("user is of type: " + user);
        Class<String> type = String.class;
        Field field = type.getDeclaredField("value");
        field.setAccessible(true);
        // In Java 8 the below will work fine. In Java 11 this will not work.
        char[] chars = (char[]) field.get(user);
        chars[0] = 'a';
        chars[1] = 'd';
        chars[2] = 'm';
        chars[3] = 'i';
        chars[4] = 'n';

        System.out.println("user is of type: " + user);

    }
}
