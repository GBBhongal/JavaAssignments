package com.Loops;
//print gender (Male/Female) program according to given M/F using Switch
import java.util.Scanner;

public class maleFemale {
    public static void main(String[] args)
    {
        System.out.println("Enter your gender");
        Scanner sc=new Scanner(System.in);
        char ch;
        ch = sc.next().charAt(0);
        switch (ch)
        {
            case 'm':
                System.out.println("Male");
                break;
            case 'f':
                System.out.println("Female");
                break;
            case 'M':
                System.out.println("Male");
                break;
            case 'F':
                System.out.println("Female");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
