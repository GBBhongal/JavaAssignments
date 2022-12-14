package com.Constructor;
//Question 1:->
/* Write a class with a default constructor,one argument constructor and two argument constructors.
 Instantiate the class to call all the constructors of that class from main class. */
class Const {
    Const()
    {
        System.out.println("This is no argument Constructor...");
    }
    Const(float num)
    {
        System.out.println("this is the one argument constructor... ");
        System.out.println("Area of square having side of "+ num +" cm is :"+ num*num + " sq.Cm");
    }
    Const(String name, float marks)
    {
        System.out.println("this is the two arguments constructor... ");
        System.out.println("hi "+ name +" your marks are "+ marks);
    }
        }



       public class const1 {
    public static void main(String[] args)
    {
     Const c=new Const();
     Const c1=new Const(4.9f);
     Const c2=new Const("Kunal",89.45f);
    }
}


