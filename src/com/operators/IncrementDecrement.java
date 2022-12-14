package com.operators;
//write a program for increment and decrement operators
public class IncrementDecrement {
static void PInc(int a,int b)
{
    int ans=b+(++a);
    System.out.println("PreIncrement a,b :"+ a + "," +ans);

}
    static void PDec(int a,int b)
    {
        int ans=b+(--a);
        System.out.println("PreDecrement a,b :"+ a + "," +ans);

    }
    static void PostInc(int a,int b)
    {
        int ans=b+(a++);
        System.out.println("PostIncrement a,b :"+ a + "," +ans);

    }
    static void PostDec(int a,int b)
    {
        int ans=b+(a--);
        System.out.println("PostDecrement a,b :"+ a + "," + ans);

    }

    public static void main(String[] args)
    {
        int a=25;
        int b=30;
        PInc(a,b);
        PDec(a,b);
        PostInc(a,b);
        PostDec(a,b);

    }
}
