// 6. Write a program to create your own exception...
package com.ExceptionHandling;
class ourOwnException extends Exception{
    ourOwnException(String message)
    {
        System.out.println(message);
    }
}

public class ownException {
    static void examMarks(int score) throws ourOwnException
    {
        if(score < 40)
        {
            throw new ourOwnException("Unable to pass");
        }
        else {
            System.out.println("Pass");
        }
    }

    public static void main(String[] args)
    {
        try {
            examMarks(39);
        }
        catch(Exception a)
        {
            a.getStackTrace();
        }

    }
}
