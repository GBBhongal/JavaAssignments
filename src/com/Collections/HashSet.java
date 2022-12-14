package com.Collections;

import java.util.Iterator;

public class HashSet {
    public static void main(String[] args)
    {
        java.util.HashSet<String> hs=new java.util.HashSet<String>();
        //      Adding elements to HashSet by using the add()
        hs.add("Alex");
        hs.add("Jos");
        hs.add("AdilRashid");
        hs.add("BenStokes");
        hs.add("Salts");
        hs.add("Allister");
        hs.add("Jimmy");
        hs.add("StuartBroad");
        hs.add("MarkWood");
        hs.add("SamCurran");
        // Iterating through the HashSet by using the Iterator object
        Iterator<String> i=hs.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next() + " ");
        }
        //  Creating Clone of the HashSet
        System.out.println("Clone of the HashSet "+hs.clone());
        // Removing a specific element from HashSet
        hs.remove("Alex");
        System.out.println("After Removing element Alex "+hs);
        //  Checking if the HashSet is empty
        System.out.println("IS Set empty "+hs.isEmpty());
        // Finding the size of the HashSet
        System.out.println("Size of the set "+hs.size());
        // checking if the element is present in HashSet
        System.out.println("IS element Allister present in set "+hs.contains("Allister"));
        // Removing all the elements of the set
        System.out.println("After removing all the elements of the set "+hs);

    }
}
