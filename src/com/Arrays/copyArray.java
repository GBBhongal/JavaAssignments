package com.Arrays;
// write a method to copy array to another
public class copyArray {

    public static void main(String[] args)
    {
       int[] arr={2,7,8,6,4,15,9,102,708} ;
       cpy(arr);
    }

    public static void cpy(int[] arr) {
        int[] arr1=new int[arr.length];
        arr1=arr;
        System.out.println("new copied array: ");
        for (int i:
             arr1) {
            System.out.print(i+" ");

        }
    }
}
