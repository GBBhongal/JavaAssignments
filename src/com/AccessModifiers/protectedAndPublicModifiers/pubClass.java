/**
 * Create a class with PUBLIC fields and methods
 * Access the public methods and fields from any class in the same package or different package.
 *
 */
// Accessing public method from non subclass of different package
package com.AccessModifiers.protectedAndPublicModifiers;

import com.assignment1.AccessModifiers.publicMembers;

public class pubClass {
    public static void main(String[] args)
    {
        publicMembers p=new publicMembers();
        p.show();
    }
}
