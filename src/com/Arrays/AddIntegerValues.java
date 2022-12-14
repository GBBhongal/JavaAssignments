package com.Arrays;
// write a function to add integer values of an array
public class AddIntegerValues {
    public static void main(String[] args)
    {
        int sum=0;
        int[] arr={50,60,70,80,100};
        System.out.println("sum is:");
        for (int i:arr) {
          sum+=i;
            System.out.println(sum);
        }
    }
}
