package com.Constructor;
/*
Call constructors (both default and argument) of super class from a child class.
 */
class child extends Const {
   child()
    {
    super();
}
    child(float length)
    {
        super(length);
    }
}
public class callSuperConstFromChild
{
    public static void main(String[] args)
    {
        child c=new child();
        child c1=new child(14.56f);

    }
}
