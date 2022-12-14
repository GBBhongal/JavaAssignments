/**
 * 1. Print all the fields/instance members of the current class using this and without using object
 * 3. Call the constructor of the current class using this()
 * 4. Call the argument constructor of the current class using this()
 */

package com.ThisAndSuper;

public class callUsingThisKeyword {
    float a;
    float b;
    callUsingThisKeyword()
    {
        this(12,24);        //Calling argument constructor of class using this()

    }
    callUsingThisKeyword(float a,float b)
    {
        this.a=a;
        this.b=b;
        System.out.println("Average of the numbers given: "+ ((a+b)/2));
    }


    public static void main(String[] args)
    {
       callUsingThisKeyword c=new callUsingThisKeyword();
       callUsingThisKeyword c1=new callUsingThisKeyword(15f,30f);

    }
}
