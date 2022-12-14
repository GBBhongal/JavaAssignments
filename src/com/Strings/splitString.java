package com.Strings;

public class splitString {
    public static void main(String[] args)
    {
        String s="878 612 34 5 67";
        String[] str = s.split(" ",5);
        System.out.println("given string: "+s);
        for (String i:str) {
            System.out.print(i);
        }
    }
}
