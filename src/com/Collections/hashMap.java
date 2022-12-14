/**
 * 2. CREATE A HASHMAP WITH AT LEAST 10 KEY VALUE PAIRS OF THE STUDENT ID AND NAME
 * Insert a key value mapping into the map
 * Fetch the value of a key
 * Create a clone/copy of hashmap
 * Check if the given key is in the hashmap
 * Check if the given value is in the hashmap
 * Check if the map is empty
 * Print the size of the map to the console
 * Print all the keys of the map to the console
 * Remove a specific Key-Value Pair
 * Copy all the elements of the map to the another map
 */
package com.Collections;

import java.util.HashMap;

public class hashMap {
    public static void main(String a[])
    {
        HashMap<Integer,String> student=new HashMap<Integer,String>();

        // Inserting a key value mapping into the map
        student.put(1,"Virat");
        student.put(2,"Rohit");
        student.put(3,"KL Rahul");
        student.put(4,"SKY");
        student.put(5,"DineshK");
        student.put(6,"Ravindra");
        student.put(7,"Yuzi");
        student.put(8,"Bhuvi");
        student.put(9,"MohammadShami");
        student.put(10,"Arshdeep");
        // Fetch the value of a key
        System.out.println("Fetching the value of a key "+student.get(3));
        // Create a clone/copy of hashmap
        System.out.println("making clone of the HashMap "+student.clone());
        // Check if the given key is in the hashmap
        System.out.println("Does HashMap contains key "+student.containsKey(7));
        // Check if the given value is in the hashmap
        System.out.println("Does HashMap contains  value "+student.containsValue("Yuzi"));
        //  Check if the map is empty
        System.out.println("is HashMap empty "+student.isEmpty());
        //  Print the size of the map to the console
        System.out.println("Size of HashMAP "+student.size());
        //  Print all the keys of the map to the console
        System.out.println("Printing all the keys "+student.keySet());
        //  Remove a specific Key-Value Pair
        student.remove(9,"Arshdeep");
        System.out.println("After removing a key value pair "+student);
        //  Copy all the elements of the map to the another map
        HashMap<Integer,String> student2=new HashMap<Integer,String>();
        student2.putAll(student);
        System.out.println("new hashmap "+student);


    }
}
