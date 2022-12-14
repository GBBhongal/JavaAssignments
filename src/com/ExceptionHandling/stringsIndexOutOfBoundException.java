/**
 * Write a program to generate StringIndexOutOfBounds Exception...
 */
package com.ExceptionHandling;

public class stringsIndexOutOfBoundException {
     public static void main(String[] args)
     {
         try {
             String str = "AvengersEndgame";
             System.out.println(str.charAt(15));
         }
         catch (StringIndexOutOfBoundsException e)
         {
             System.out.println("StringIndexOutOfBoundsException Triggered!!!");
             e.printStackTrace();
         }
     }
}
