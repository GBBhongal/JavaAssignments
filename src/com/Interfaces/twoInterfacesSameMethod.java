package com.Interfaces;
/**
 * Create two interfaces with same (same sign) in both the interfaces.
 * Implement these two interfaces in one class.Call the method...
 */
interface interfaceNo1{
        void sameMethod();
        }
interface interfaceNo2{
    void sameMethod();
}
public class twoInterfacesSameMethod implements interfaceNo1 , interfaceNo2{
    @Override
    public void sameMethod()
    {
        System.out.println("this is the same method for both the interfaces");
    }
    public static void main(String[] args)
    {
        twoInterfacesSameMethod c=new twoInterfacesSameMethod();
        c.sameMethod();
    }
}
