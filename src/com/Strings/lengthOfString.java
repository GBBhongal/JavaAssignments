package com.Strings;

import java.util.Scanner;

public class lengthOfString {
    public static void main(String[] args)
    {
        String name=new String();
        System.out.println("enter string ");
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();
        System.out.println("Length of the given string "+ name.length());
    }
}
