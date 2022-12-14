package com.Interfaces;

/**
 * CREATE A PUBLIC INTERFACE WITH FIELDS AND METHODS,FIELDS SHOULD HAVE ASSIGNED.
 * IMPLEMENT THIS INTERFACE TO SOME CLASS AND PRINT VALUES OF INTERFACE FIELDS AND
 * CALL THE INTERFACE METHODS...
 */
interface pubInterface{
    String name="Christopher";
 void sample();
}
public class publicInterface implements pubInterface{
  @Override public void sample()
    {
        System.out.println("Inside the Sample");
    }
 public static void main(String[] args)
 {
     publicInterface p=new publicInterface();
     p.sample();
     System.out.println("name: "+name);
 }
}
