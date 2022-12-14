/**
 * Create a class with Protected fields and methods.Access these fields and methods from any other class in the same package.
 * Also access the protected fields and methods from any class in different package.
 */
// Note:-> We can not access the protected fields and methods from any class in different package until and unless it is declared as the child of the class..
package com.AccessModifiers;

   public  class protectedMembers {
      protected String name="Karan";
      protected int age=22;


      protected void details()
        {
            System.out.println("Name: "+ name +" age: "+age);
        }
        public static void main(String[] a)
        {
          // protectedClass p=new protectedClass();
           protectedClass.show();
        }

    }
   class protectedClass
    {
        public static void show() {
            protectedMembers ptd = new protectedMembers();
            ptd.details();
        }
    }

