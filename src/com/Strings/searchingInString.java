package com.Strings;

import java.util.Scanner;

public class searchingInString {
    public static void main(String[] args) {
        String name = new String("Java is a most popular programming language");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter character you wanna search");
        char ch = sc.next().charAt(0);
        System.out.println("Found at Index: "+ name.indexOf(ch));
    }
}
