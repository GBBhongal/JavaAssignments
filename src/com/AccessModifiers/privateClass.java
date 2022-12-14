/**
 * Create a class with PRIVATE fields,methods and a main method.Print the fields in main method.Call the private method in main method.
 * Create a subclass and try to access the private fields and methods from subclass.
 */

package com.AccessModifiers;

public class privateClass {
    private float radius=14f;
   private final float PI=(float)Math.PI;

   private void circleArea()
    {
        System.out.println("Area of circle is: "+ PI*radius*radius +" sq.Cm");
    }

    public static void main(String[] args)
    {
    privateClass p=new privateClass();
    p.circleArea();
    // NOTE:-> Private members can't be inherited from parent class to child class.
    }
}
