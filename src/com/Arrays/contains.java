package com.Arrays;
//write a method to verify if the array contains two elements(12,23)
import java.util.Scanner;

public class contains {
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
        containsValues(arr);
    }

    public static void containsValues(int[] arr) {
        boolean tw=false;
        boolean t=false;
        for(int i:arr)
        {
         if(i==12)
         {
             System.out.println("Array contains 12");
             tw=true;
         } else if (i==23) {
             System.out.println("array contains 23");
             t=true;
         }
         if (tw==true && t==true)
         {
             break;
         }
        }
    }
}
