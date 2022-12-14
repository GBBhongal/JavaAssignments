package com.Strings;

import java.util.Scanner;

public class comparingStrings {
    public static void main(String[] args) {
        String name = new String();
        String name1 = new String();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter string1 ");
        name = sc.nextLine();
        System.out.println("enter string2");
        name1 =sc.nextLine();
        System.out.println(name.equals(name1));
    }
}
