package com.Strings;

public class extractString {
    public static void main(String[] args) {
        String name = new String("Java is a most popular programming language ");
        System.out.println("given String: "+ name);
        String name1=name.substring(6,16);
        System.out.println("Substring of given String: "+ name1);
    }
}
