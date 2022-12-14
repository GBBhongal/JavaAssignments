package com.Strings;

import java.util.Scanner;

public class equalsIgnore {
    public static void main(String[] args)
    {
        String name = new String();
        String name1 = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string1 ");
        name = sc.next();
        System.out.println("enter string2");
        name1 =sc.next();
        System.out.println(name.equalsIgnoreCase(name1));
        System.out.println(name.startsWith("G"));
        System.out.println(name.endsWith("Z"));
        System.out.println(name.compareToIgnoreCase(name1));
    }
}
