package com.Arrays;
// write a program to find the index of an array element
import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        int[] arr = {455, 67, 356, 76, 457, 378, 342, 2357, 6789};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter element");
        int key = sc.nextInt();
        int ans = searchElement(arr, key);
        System.out.println("found at index: " + ans);
    }

    public static int searchElement(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
