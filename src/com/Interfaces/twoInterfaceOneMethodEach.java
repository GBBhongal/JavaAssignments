/**
 * Create two interfaces with one method each,implement these two interfaces in one class
 */
package com.Interfaces;
    interface interface1{
        void method1();
    }

    interface interface2{
        void method2();
    }
     class twoInterfaceOneMethodEach implements interface1 , interface2{
       @Override
        public void method1()
        {
            System.out.println("this is method one");
        }
        @Override
        public void method2()
        {
            System.out.println("this is method two");
        }
        public static void main(String[] args)
        {
            twoInterfaceOneMethodEach c=new twoInterfaceOneMethodEach();
            c.method1();
            c.method2();
        }
    }
