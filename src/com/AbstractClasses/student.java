/**
 * 1. Create a class with abstract and non-abstract methods...
 * 2. Create a subclass for an abstract class.Create an object in the child class for the
 * abstract and non-abstract class
 * 3.Create an instance for the child class in the child class and call abstract methods.
 * 4. Create an instance for the child class in the child class and call non-abstract methods...
 */
package com.AbstractClasses;
    abstract class human{
      abstract void method1();
        void method2()
        {
            System.out.println("Inside the method2");
        }
    }
    class std extends human {
        public void method1() {
            System.out.println("Inside the abstract method1");
        }
    }
    public class student{
    public static void main(String[] args)
    {
        human h=new std();
        h.method2();
        std s =new std();
        s.method1();
        s.method2();

    }
}
