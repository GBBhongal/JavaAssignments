/**
 * 4. Write a program with multiple catch blocks
 * 5. Write a program to throw Exception with your own message
 */
package com.ExceptionHandling;

public class multipleCatchBlocks {
    public static void main(String[] args)
    {
        try {
            int[] arr={4,0,6,7,8,9,10};
            int sum=arr[2]+arr[9];
        }
        catch (ArrayIndexOutOfBoundsException a)
        {
            // Throwing exception with message...
            System.out.println("ArrayIndexOutOfBounds exception occurred");
            a.printStackTrace();
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
