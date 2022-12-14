package com.Arrays;
//write a program to insert an element at specific position
import java.util.Arrays;
import java.util.Scanner;

public class insertEle {
    public static void main(String[] args)
    {
        int[] arr={2,7,8,6,4,15,9,102,708};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter index: ");
        int index=sc.nextInt();
        System.out.println("enter value you wanna insert: ");
        int element=sc.nextInt();




        System.out.println("array before inserting: "+ Arrays.toString(arr
        ));
        insertEle(arr,index,element);
        System.out.println("array after inserting: "+ Arrays.toString(arr));
    }

    public static void insertEle(int[] arr,int index,int element) {
        for (int i = arr.length; i <=index ; i--) {
            arr[i]=arr[i-1];
        }
        arr[index]=element;

    }
}
