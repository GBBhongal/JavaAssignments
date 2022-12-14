/**
 * Create a class with default fields and methods.Access these fields and methods from any other class in the same package.
 */

package com.AccessModifiers;

    class defaultClass {
   String name="Karan";
   int age=22;


    void details()
    {
        System.out.println("Name: "+ name +" age: "+age);
    }

}
class defaultMembers
{
    public static void main(String[] a)
    {
        defaultClass def=new defaultClass();
        def.details();
    }
}
