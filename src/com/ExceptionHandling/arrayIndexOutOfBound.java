// 9. Write a program to generate Array Index Out of bound exception
package com.ExceptionHandling;

public class arrayIndexOutOfBound {
    public static void main(String[] args)
    {
        try {
            int[] arr = {4, 0, 6, 7, 8, 9, 10};
            int sum = arr[2] + arr[9];
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
