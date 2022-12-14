package com.Arrays;
//write a method to remove a specific element from array
import java.util.Scanner;

public class removeElement {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] arr={67,78,89,456,3556,57,4,6,44,678};
        System.out.println("enter index: ");
        int index=sc.nextInt();

        removeEle(arr,index);
    }

    public static void removeEle(int[] arr, int index) {
        int[] arr1=new int[arr.length-1];
        for (int i = 0; i < arr1.length; i++) {
            if(i==index)
            {
                continue;
            }
            arr1[i]=arr[i];

        }
        for (int i = 0; i <arr1.length ; i++) {
            System.out.print(arr1[i]+" ");
        }
    }
}
