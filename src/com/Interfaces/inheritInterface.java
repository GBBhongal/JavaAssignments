package com.Interfaces;

/**
 * CREATE AN INTERFACE AND INEHRIT IT FROM THE OTHER INTERFACE...
 */
interface interfaceFour{
    void methodOne();
}
interface interfaceFive extends interfaceFour{
    void methodTwo();
}
public class inheritInterface implements interfaceFour,interfaceFive{
    public void methodOne()
    {
        System.out.println("Method one");
    }
    public void methodTwo()
    {
        System.out.println("Method Two");
    }
    public static void main(String[] args)
    {
        inheritInterface i=new inheritInterface();
        i.methodOne();
        i.methodTwo();
    }
}
