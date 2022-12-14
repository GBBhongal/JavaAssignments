package com.Loops;
// Write a program to find number is palindrome or not
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args)
    {
        System.out.println("Enter Number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        checkPalindrome(num);
    }

    private static void checkPalindrome(int num) {
        int temp=num;
        int res=0;
        while(temp>0)
        {
           int rem=temp%10;
            res=(res*10)+rem;
            temp=temp/10;
        }
        if (res==num)
        {
            System.out.println("palindrome number");
        }
        else {
            System.out.println("not a palindrome number");
        }
    }
}
