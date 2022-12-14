package com.operators;
//proram for Logical AND OR and NOT operators
public class LogicalOrNotAnd {
    public static void main(String[] args) {
        int a = 89;
        int b = 76;
        int t=100;
        System.out.println(a>b && a>t);
        System.out.println(a>b && a<t);
        System.out.println(a<b && a>t);


        System.out.println(a>b || a>t);
        System.out.println(a>b || a<t);
        System.out.println(a<b || a>t);
    }



}
