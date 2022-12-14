package com.Loops;
// Write a program to find a number is armstrong number or not
import java.util.Scanner;
/*
*
* */
public class Armstrong {
     public static void main(String[] args)
     {
         System.out.println("enter number ");
         Scanner sc=new Scanner(System.in);
         int num=sc.nextInt();
         checkArmstrong(num);

     }

    public static void checkArmstrong(int num) {
        int rem;
        int res=0;
        int temp=num;
        while(temp!=0)
        {
        rem=temp%10;
        res+=rem*rem*rem;
        temp=temp/10;

    }
        if (num==res)
        {
            System.out.println("it is an armstrong number");
        }
        else {
            System.out.println("it is not an armstrong number");
        }
    }
}
