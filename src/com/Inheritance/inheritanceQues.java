package com.Inheritance;

/**
 * A,B and C are classes
 * A is super class.B is subclass of A.C is a subclass of B.
 * Create three methods in each class.2 methods are specific to each class and third method(override method) should be in
  all three classes.A,B and C.
 * Create a class with main method.Create an object for each A,B and C in main method and call every method of each class
   using object/instance.
 * Call an overridden method with super class reference to B and C class's object.
 * Runtime Polymorphism with data members/Instance variables,Repeat the above process only for data members.
 */
class A {
    long bonus=0;
    public void method2(long salary) {
        System.out.println(" Earning " + salary + " INR");
    }

    public void method1(String name) {
        System.out.println("Name:" + name);
    }

    public void method3() {
        System.out.println(" Extra income " + bonus + " INR");
    }
}
        class B extends A {
            long bonus=3000;
            public void classBMethod2(long salary) {
                System.out.println(" Earning " + salary + " INR");
            }

            public void classBMethod1(String name) {
                System.out.println("Name:" + name);
            }

            public void method3() {
                System.out.println(" Extra income after 1 year of service " + bonus + " INR");
            }
        }
class C extends B{
    long bonus=6000;
    public void classCMethod2(long salary) {
        System.out.println(" Earning " + salary + " INR");
    }

    public void classCMethod1(String name) {
        System.out.println("Name:" + name);
    }
    @Override
    public void method3() {
        System.out.println(" Extra income after 2 years of service " + bonus + " INR");
    }
}
public class inheritanceQues {
    public static void main(String[] args)
    {
A obj1=new A();
B obj2=new B();
C obj3=new C();
obj1.method1("Rahul");
        obj1.method2(45000);
        obj1.method3();
        obj2.classBMethod1("Raman");
        obj2.classBMethod2(60000);
        obj2.method3();
        obj3.classCMethod1("Raghav");
        obj3.classCMethod2(90000);
        obj3.method3();

        // calling the overridden method with super class reference.
        A obj;
        obj=new B();
        obj.method3();
        obj=new C();
        obj.method3();

    }
}
