package com.Constructor;

import java.util.Scanner;

/**
 * Question 3:->
 * Apply public private protected and default access modifiers to the constructor...
 * Question 4:->
 *  -> Constructors do not have any return type not even void...
 *Question 5:->
 * Try to call the constructor multiple times with the same object...
 * */

public class publicPrivateProtectedKeywords {
  public publicPrivateProtectedKeywords()
   {
       System.out.println("Student Details:");
   }
    private publicPrivateProtectedKeywords(float marks)
    {
       // System.out.println("private constructor");
        System.out.println("  marks: "+marks);
    }
    protected publicPrivateProtectedKeywords(int rollNo,String name)
    {
        //System.out.println("protected constructor");
        System.out.print("rollNo: "+rollNo+" Name: "+name);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many times you wanna call Constructors: ");
        int n=sc.nextInt();

        for (int i = 0; i < n; i++) {


            publicPrivateProtectedKeywords p0 = new publicPrivateProtectedKeywords();
            publicPrivateProtectedKeywords p1 = new publicPrivateProtectedKeywords(14, "Logan");
            publicPrivateProtectedKeywords p2 = new publicPrivateProtectedKeywords(74.567f);
        }
    }
}
