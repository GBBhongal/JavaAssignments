package com.Arrays;
// Write a function to calculate the average value of an array of integers
public class arrAvg {
    public static int averageArr(int[] ar)
    {
        int sum=0;
        for (int i: ar) {
            sum+=i;
        }
        sum=sum/(ar.length);
        return sum;
    }
    public static void main(String[] args)
    {
        int[] arr={40,50,60,70,80,90,100};
        int ans=averageArr(arr);
        System.out.println("average of the array is: "+ ans);
    }
}
