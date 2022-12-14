package com.Arrays;
// Write a method to find second largest element of an array
import java.util.Arrays;

public class secondLargestInArray {
    public static void main(String[] args) {
        int[] arr1 = {604003, 5432, 789, 3445, 4, 1, 34, 5, 444, 56, 7446, 78, 567};
        System.out.println("before reverse:" + Arrays.toString(arr1));
      int ans=  secondLargest(arr1);
        System.out.println(ans);

    }

    public static int secondLargest(int[] arr1) {
        for (int i = 0; i < arr1.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
             if (arr1[j]<arr1[j-1])
             {
                 int temp=arr1[j];
                 arr1[j]=arr1[j-1];
                 arr1[j-1]=temp;
             }
            }
        }
        for (int i = arr1.length-2; i >0 ; i++) {
            if (arr1[i] < arr1[i + 1]) {
                return arr1[i];
            }
        }
        return -1;
    }
}
