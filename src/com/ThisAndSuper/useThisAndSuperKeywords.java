/**
 * 6. Use this and super keywords in methods not in constructors...
 */
package com.ThisAndSuper;

class useThisAndSuper{
    void m1()
    {
        System.out.println("Inside the method 1");
    }
}
public class useThisAndSuperKeywords extends useThisAndSuper{
    void m2()
    {
        super.m1();
    }

public static void main(String[] args)
{
    useThisAndSuperKeywords u=new useThisAndSuperKeywords();
    u.m2();
}
}
