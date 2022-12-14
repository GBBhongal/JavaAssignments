/**
 * Create a class with PUBLIC fields and methods
 * Access the public methods and fields from any class in the same package or different package.
 *
 */
package com.AccessModifiers;

public class publicMembers {
    public static void show()
    {
        publicClass pb = new publicClass();
        pb.student();
    }
    public static void main(String[] args) {
          show();
    }
}
    class publicClass{
    public int rollNo=4;
    public String name="Logan";
    public float marks=84.56f;

    public void student()
    {
        System.out.println("RollNo.: "+rollNo+" Name: "+name+" Marks: "+ marks);
    }
}
