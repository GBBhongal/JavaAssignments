package com.Arrays;
//write a program to find missing number of sorted array of 1 to 100
public class missingNumber {
    public static void main(String[] args)
    {
        int[] arr=new int[100];
        System.out.println("ENTER ARRAY ELEMENTS: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i+1;
        }
        arr[10]=90;
      int ans= missingNum(arr);
        if (ans==-1)
        {
            System.out.println("nothing is missing in the array");
        }
        else {
            System.out.println(ans + " is missing in array");
        }
    }

    public static int missingNum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
           if(arr[i]!=i+1)
           {
               return i+1;
           }
        }
        return -1;
    }
}
