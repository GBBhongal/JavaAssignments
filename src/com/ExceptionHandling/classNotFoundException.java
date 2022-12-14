// 10. Write a program to generate ClassNotFoundException...
package com.ExceptionHandling;

public class classNotFoundException {
    public static void main(String[] args)
    {
        try{
            Class.forName("com.assignment1.ExceptionHandling.finallyBlocks");
            ClassLoader.getSystemClassLoader().loadClass("com.assignment1.ExceptionHandling.finallyBlocks");
        }
        catch (ClassNotFoundException cl)
        {
             cl.printStackTrace();      //cl.printStackTrace() will print line number and class name where the exception has occurred.
        }
    }

}
