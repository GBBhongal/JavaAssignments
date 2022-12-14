package com.Loops;
// Write a program to find number is prime or not
import java.util.Scanner;

public class primeOrNot {
    public static void main(String[] args)
    {
        System.out.println("Enter Number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean ans=false;
        for (int i = 2; i <= num/2; i++) {
            if (num==2)
            {
                System.out.println("prime number");
                break;
            }
            if (num==1)
            {
                System.out.println("neither a composite nor a prime number");
                break;
            }
          if (num%i==0)
          {
              ans=true;
              System.out.println("Not a prime number");
              break;
          }
        }
        if(ans==false)
        {
            System.out.println("It is a prime number");
        }
        }
    }