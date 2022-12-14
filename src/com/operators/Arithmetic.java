package com.operators;

import java.util.Scanner;

//write a function to perform arithmetic operations
public class Arithmetic {
    static void Addition(int a, int b)
    {
        System.out.println("Addition:"+ (a+b));
    }
   static void Multiply(int a, int b)
    {
        System.out.println("Multiplication:"+ a*b);
    }
    static void Sub(int a, int b)
    {
        a=a-b;
        System.out.println("Difference:"+a);
    }
static void Div(int a, int b)
{
    System.out.println("Divison:"+ a/b);
}
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter values of a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        Addition(a,b);
        Sub(a,b);
        Multiply(a,b);
        Div(a,b);


    }
}
