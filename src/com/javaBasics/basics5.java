package com.javaBasics;

/**
 * define the local and global variables with same name and print the values
 * understand the scope of the variables
 */
public class basics5 {
    int i=688;
    public void var()
    {
        i=344;
        System.out.println("local scope:" +i);
    }
    public static void main(String[] args)
    {
        basics5 ob=new basics5();
        System.out.println("value of i:"+ ob.i);
        ob.var();
    }
}
