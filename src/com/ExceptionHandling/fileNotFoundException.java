// 11. Write a program  to generate FileNotFound Exception
package com.ExceptionHandling;

import java.io.*;


public class fileNotFoundException {
    public static void main(String[] args)
    {
        try
        {BufferedReader br=new BufferedReader(new FileReader(new File("C:\\Users\\Dummy\\Location")));

        }
        catch (FileNotFoundException e)
        {
            System.out.println("FileNotFound Exception triggered");
            e.printStackTrace();
        }
    }
}
