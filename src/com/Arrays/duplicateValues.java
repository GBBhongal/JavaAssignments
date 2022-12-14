package com.Arrays;
// write a function to find duplicate elements in an array
import java.util.Arrays;

public class duplicateValues {
    public static void main(String[] args) {
        int[] arr={604003,5432,789,3445,4,1,34,5,444,56,7446,78,567,4,1};
        System.out.println("Given Array: " + Arrays.toString(arr));
        findDuplicate(arr);

    }

    public static void findDuplicate(int[] arr) {
        System.out.println("duplicate values in the array: ");
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j])
                {
                    System.out.print(arr[i]+" ");
                    break;
                }
            }
        }
    }
}
