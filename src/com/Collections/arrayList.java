/**
 * 1. CREATE AN ARRAYLIST OF TYPE STRING WITH 10 STRING ELEMENTS.ADD 10 STRING ELEMENTS TO ARRAYLIST AND PERFORM BELOW OPERATION
 * Add an element to the ArrayList
 * Iterate through the ArrayList by using Iterator object
 * Add an element at specific index
 * Remove an element from ArrayList,Remove at an index
 * update the element at specific index
 * Check the element is present at particular index
 * Get an element at particular index
 * Find out the size of the arrayList
 * Check the given element is present in the ArrayList
 * Remove all elements of the ArrayList
 *
 */
package com.Collections;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args)
    {
        ArrayList<String> arr=new ArrayList<String>();
        // Adding an element to the ArrayList
        arr.add("Alexander");
        arr.add("Alexa");
        arr.add("Aman");
        arr.add("Ankit");
        arr.add("Ben");
        arr.add("Christopher");
        arr.add("Henry");
        arr.add("Abraham");
        arr.add("Benjamin");
        arr.add("Glenn");
       // Adding an element at specific index
        arr.add(1,"Roger");
       // Iterating through the ArrayList by using Iterator object
        for (String s : arr) {
            System.out.println(s);
        }
        // Remove an element from ArrayList,Remove at an index
        System.out.println(arr.remove(1));
        // update the element at specific index
        System.out.println(arr.set(1,"Kane"));
        // Get an element at particular index
        System.out.println(arr.get(4));
        //  Check the given element is present in the ArrayList
        System.out.println(arr.contains("Maxwell"));
        // Find out the size of the arrayList
        System.out.println(arr.size());
        // Remove all elements of the ArrayList
        System.out.println(arr.removeAll(arr));
    }
}
