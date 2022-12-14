// Create an interface with two methods but implement only one in class.Call the method implemented.
package com.Interfaces;
// note:-> We can not implement only one method in class
interface twoMethod{
    void method1();
    void method2();
}
class twoMethodClass implements twoMethod{
    public void method1()
    {
        System.out.println("Inside the method 1");
    }
    public void method2()
    {
        System.out.println("Inside the method 2");
    }
}

class twoMethodInterface {
    public static void main(String[] args)
    {
        twoMethodClass one=new twoMethodClass();
        one.method1();
        one.method2();
    }
}
