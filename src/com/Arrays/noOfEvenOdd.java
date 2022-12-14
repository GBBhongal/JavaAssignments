package com.Arrays;
//Write a program to find numbers of even and odd numbers in an array
import java.util.Scanner;

public class noOfEvenOdd {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of an array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("ENTER ARRAY ELEMENTS: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        evenOdd(arr);
    }

    public static void evenOdd(int[] arr) {
        int even=0;
        int odd=0;
        for (int i:arr) {
            if ((i&1)==1)
            {
                odd++;
            } else if ((i&1)==0) {
                even++;

            }

        }
        System.out.println("total even numbers in array: "+ even);
        System.out.println("total odd numbers in array: "+ odd);
    }

}
