package com.AnudipLab;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapCopy {
    public static void main(String[] args) {
        // Creating a TreeMap to store mappings
        TreeMap<String, Integer> sourceMap = new TreeMap<String, Integer>();

        // Adding key-value pairs to the source map
        sourceMap.put("Rahul", 45);
        sourceMap.put("Piyali", 289);
        sourceMap.put("Snehal", 123);
        sourceMap.put("Poonam", 53);
        sourceMap.put("Ram", 78);

        // Creating another TreeMap to copy mappings from the source map
        TreeMap<String, Integer> targetMap = new TreeMap<String, Integer>();

        // Copying all mappings from sourceMap to targetMap
        targetMap.putAll(sourceMap);

        // Displaying the targetMap
        System.out.println("Target Map: " + targetMap);

        //Getting values from the tree map
        int value = sourceMap.get("Rahul");
        System.out.println("Value:" +value);

        //Removing elements from the treemap
        sourceMap.remove("Ram");

        //Iterating over the elements of the treemap
        for (String key : sourceMap.keySet())
        {
            System.out.println("Key: " + key + ", value: " + sourceMap.get(key));
        }

        // Copying all mappings from sourceMap to targetMap
        targetMap.putAll(sourceMap);


        // Checking if the map is empty
        if (targetMap.isEmpty())
        {
            System.out.println("Target map is empty.");
        } else
        {
            System.out.println("Target map is not empty.");
        }
    }
}