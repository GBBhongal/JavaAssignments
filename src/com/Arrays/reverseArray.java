package com.Arrays;
//write a program to reverse an array
import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr={604003,5432,789,3445,4,1,34,5,444,56,7446,78};
        System.out.println("before reverse:"+ Arrays.toString(arr));
        reverse(arr);
        System.out.println("before reverse:"+ Arrays.toString(arr));
    }

    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
    }
}
