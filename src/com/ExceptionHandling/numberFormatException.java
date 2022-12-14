/**
 * 16. Write a program to generate NumberFormatException...
 */
package com.ExceptionHandling;

public class numberFormatException
{
    public static void toNumber(String s)
    {
        int n=Integer.parseInt(s);
        System.out.println(n);
    }
    public static void main(String[] args)
    {
     try
     {
         toNumber("X");
     }
     catch (NumberFormatException e)
     {
         System.out.println("NumberFormatException Triggered!!!");
         e.printStackTrace();
     }
    }
}
