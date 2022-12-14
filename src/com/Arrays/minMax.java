package com.Arrays;
//write a program to find minimum and maximum element in an array
public class minMax {
    public static void main(String[] args)
    {
        int[] arr={604003,5432,789,3445,4,1,34,5,444,56,7446,78};
        int min= Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int i:arr) {
            if(i>max)
            {max=i;}
            else if (i<min) {
                min=i;
            }
        }
        System.out.println("maximum element in array: "+max);
        System.out.println("minimum element in array: "+min);
    }
}
