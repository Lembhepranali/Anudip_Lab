package com.AnudipLab;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        // Declare variables
        int i, len, key;
        int[] arr; // array to store input values
        Scanner input = new Scanner(System.in);

        // Get the length of the array from the user
        System.out.println("Enter the array length: ");
        len = input.nextInt();

        // Create an array of the specified length
        arr = new int[len];

        // Get the array elements from the user
        System.out.println("Enter " + len + " elements");
        for (i = 0; i < len; i++)
        {
            arr[i] = input.nextInt();
        }

        // Get the search key from the user
        System.out.println("Enter the search key value: ");
        key = input.nextInt();

        // Initialize a flag to track if the key is found
        boolean found = false;

        // Iterate through the array to search for the key
        for (i = 0; i < len; i++)
        {
            // Check if the current element is equal to the key
            if (arr[i] == key)
            {
                // If the key is found, print the location and set the flag to true
                System.out.println(key + " is present at location " + (i + 1));
                found = true;
                break; // exit the loop since the key is found
            }
        }

        // If the key is not found, print a message
        if (!found)
        {
            System.out.println(key + " does not exist.");
        }
    }
}