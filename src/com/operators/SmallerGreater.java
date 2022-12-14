package com.operators;

import java.util.Scanner;

//print the smaller and larger number
public class SmallerGreater {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A and B");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b)
        {
            System.out.println("larger is:"+a);
            System.out.println("Smaller is:"+b);
        }
        else if(a<b)
        {
            System.out.println("Smaller is:"+a);
            System.out.println("Greater is:"+b);
        }
        else
        {
            System.out.println("BOTH ARE EQUAL");
        }


    }
}
