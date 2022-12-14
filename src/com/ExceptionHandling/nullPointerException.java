/**
 * 15. Write a program to generate NullPointerException...
 */
package com.ExceptionHandling;

public class nullPointerException {
    public static void str(String name)
    {
        System.out.println(name.toLowerCase());
    }
    public static void main(String[] a)
    {
        String name= null;
        try{
            str(name);
        }
        catch (NullPointerException e)
        {
            System.out.println("NullPointerException Triggered!!!");
            e.printStackTrace();

        }
    }
}
