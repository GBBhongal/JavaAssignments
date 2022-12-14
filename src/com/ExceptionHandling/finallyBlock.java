// 7. write a program with finally block
package com.ExceptionHandling;

public class finallyBlock {
    public static void main(String[] args)
    {
        try
        {
         int result=5765/0;

        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        finally{
            System.out.println("This Will definitely print");
        }
    }
}
