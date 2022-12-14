package com.operators;

import java.util.Scanner;
/**
 * write a program to find two numbers are equal or not
 * program to equal and not equal operator
 */
public class EqualNotEqual {
    public static void main(String[] args)
    {
Scanner sc=new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER");
int a=sc.nextInt();
        System.out.println("ENTER SECOND NUMBER");
        int b=sc.nextInt();
        if (a==b) {
            System.out.println("Numbers are equal");
        }
        else{
            System.out.println("Numbers are not equal");
        }
            }
}
