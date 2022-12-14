package com.Loops;
//write a program to print largest number among three given numbers
public class Largest {
    public static void main(String[] args)
    {
        int a=10;
        int b=20;
        int c=30;
        if (a>b && a>c)
        {
            System.out.println("largest: "+a);
        } else if (b>c&& b>a) {
            System.out.println("largest: "+b);
        }
       else if(c>a&&c>b)
        {
            System.out.println("largest: "+c);
        }
       else {
            System.out.println("Values are Equal");
        }
    }
}
