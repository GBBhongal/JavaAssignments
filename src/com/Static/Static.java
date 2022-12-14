package com.Static;

public class Static {
    static int svar1=4;  //STATIC VARIABLES
    static int svar2=5;
    int ivar1=6;    //instance variables
    int ivar2=7;
    static void sMethod1()      //static method1 printing instance variables
    {
       Static obj=new Static();
        System.out.println("Instance Variables: "+ obj.ivar1 + ", "+obj.ivar2);

    }
    void instanceMethod1() //instance method printing static variables
    {
        System.out.println("Static variables: "+ svar1 + svar2);
    }
    static void sMethod2()  //static method calling instance method1
    {
        Static obj = new Static();
        obj.instanceMethod1();
    }
    void instanceMethod2()      //instance method calling static method1
    {
        sMethod1();
    }
    public static void main(String[] args)
    {
        Static s= new Static();
        System.out.println("Static variables: "+ svar1 + ", " + s.ivar2);
        sMethod1();
        sMethod2();
        s.instanceMethod1();
        s.instanceMethod2();
    }
}
