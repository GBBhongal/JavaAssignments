package com.Arrays;
// write a program to calculate the difference between largest and smallest value of an array
import java.util.*;

public class Diff {
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
        difference(arr);
    }

    public static void difference(int[] arr) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i:arr) {
            if (i>max)
            {
                max=i;
            } else if (i < min) {
                min=i;
            }
        }
        System.out.println("Given Array: " + Arrays.toString(arr));
        System.out.println("Difference between maximum element and minimum element of array:"+ (max-min));
    }
}
