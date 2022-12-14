package com.Interfaces;
/**
 * 9-> Create a private or protected interface and print the values as above scenario.
 * 10-> Create an interface with private,public and  protected fields.
 * 11-> Create an interface with static final variable...
 */
interface interfaceSix{
    public final int r=12;
    static final String name="AKASH";
   default void details()
   {
       System.out.println("rollNo: "+r+" name: "+name);
   }
}
public class privateProtectedPublic implements interfaceSix{
    public static void main(String[] args) {
        privateProtectedPublic p = new privateProtectedPublic();
        p.details();
    }
}
//note:-> WE CAN'T PROVIDE IMPLEMENTATION TO PRIVATE MEMBERS OF INTERFACE.
