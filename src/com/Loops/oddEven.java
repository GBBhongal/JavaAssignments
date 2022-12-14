package com.Loops;
//write a program to print odd and even numbers
public class oddEven {
    public static void main(String[] args)
    {
        System.out.println("Even");
        for (int i = 0; i <=20; i+=2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Odd");
        for (int i = 1; i <=20; i+=2) {
            System.out.print(+ i + " ");
        }
    }
}
