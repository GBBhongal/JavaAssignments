// 8. Write a program to generate Arithmetic Exception
package com.ExceptionHandling;

import com.assignment1.operators.Arithmetic;

public class generateArithmeticException {
    public static void main(String[] args)
    {
        try {
            int c = 15;
            int d = 0;
            int result = c / d;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        }
}
