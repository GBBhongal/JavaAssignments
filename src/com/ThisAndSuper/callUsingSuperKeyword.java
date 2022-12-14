/**
 * 2. Print the fields/instance members of the parent class using super
 * 5. Call the constructor of the parent class using super()
 */

package com.ThisAndSuper;

class callUsingSuper{
int rollNo=3;
String name="Vicky";
int dateOfBirth=15/6/1998;
int heightInCm=169;
float weight=61.2f;
callUsingSuper()
{
    System.out.println("RollNo  Name  heightInCm  WeightInKg");
    System.out.println("  "+rollNo+"    "+name+"     "+heightInCm+"       "+weight);
}
}
public class callUsingSuperKeyword extends callUsingSuper{
    callUsingSuperKeyword()
    {
        super();
    }

    public static void main(String[] args)
    {
        callUsingSuperKeyword s=new callUsingSuperKeyword();

    }
}
