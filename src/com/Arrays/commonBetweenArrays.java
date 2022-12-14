package com.Arrays;
//write a function to find common elements between two arrays
import java.util.Arrays;



public class commonBetweenArrays {
    public static void main(String[] args) {
        int[] arr1 = {604003, 5432, 789, 3445, 4, 1, 34, 5, 444, 56, 7446, 78, 567};
        int[] arr2 = {58338, 785, 90, 678, 85, 467, 41, 4};
        System.out.println("array1: " + Arrays.toString(arr1));
        System.out.println("array2: " + Arrays.toString(arr2));
        commonElements(arr1, arr2);

    }

    public static void commonElements(int[] arr1, int[] arr2) {
        System.out.println("Common values in both arrays");
        for (int i:arr1) {
            for (int j:arr2) {
              if(i==j)
              {
                  System.out.print(i+" ");
              }
            }
        }
    }
}
