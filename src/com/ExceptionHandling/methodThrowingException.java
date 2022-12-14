/**
 * 3. Write a method which throws exception,Call the method in main class without try block
 */
package com.ExceptionHandling;

public class methodThrowingException {


    public static void main(String[] str)
    {
        method();
    }

    public static void method() {
        throw new RuntimeException("Method Throwing Runtime Exception");
    }
}
