/**
 * 1. Write a program to generate Arithmetic Exception without exception handling
 * 2. Handle the arithmetic exception using try catch block
 */

package com.ExceptionHandling;

public class generateException {
    public static void main(String[] args)
    {
        // 2-> Handle the arithmetic exception using try catch block
        try
        {
            int c=15;
            int d=0;
            int result=c/d;
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        // 1->  generate Arithmetic Exception without exception handling
        int a=13;
        int b=0;
        System.out.println(a/b);
    }
}
