package com.Interfaces;

/**
 * Create an interface with default method and implement it in a class.
 * Do not provide implementation to the default method and call the method...
 */

interface interfaceOne{
    default void show()
    {
        System.out.println("method Body");
    }
}

public class defaultMethodInterface implements interfaceOne{


    public static void main(String[] args)
    {
     defaultMethodInterface if1=new defaultMethodInterface();
     if1.show();
    }

}
