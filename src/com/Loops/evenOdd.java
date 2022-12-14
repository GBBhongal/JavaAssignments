package com.Loops;
// Write a program to check whether number is EVEN  or ODD using SWITCH
import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args)
    {
        System.out.println("Enter Number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int ans=num%2;

        switch (ans)
        {
            case 0:
                System.out.println(num+" is an even number");
                break;
            case 1:
                System.out.println(num+" is an odd number");
                break;
            default:
                System.out.println("invalid number");
        }
    }
}
