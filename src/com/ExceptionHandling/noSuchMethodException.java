// 13. Write a program to generate NoSuchMethodException...
package com.ExceptionHandling;

import java.lang.reflect.Method;

public class noSuchMethodException {

    public static void add(int a,int b)
    {
        System.out.println("Multiplication of given numbers: " + (a*b));
    }
    public static void main(String[] args)
    {
        try{
            Class c=Class.forName("finallyBlock");
            Method m=c.getDeclaredMethod("addition",int.class,int.class);
        }
        catch (NoSuchMethodException | ClassNotFoundException e)
        {
            e.printStackTrace();

        }
    }
}
