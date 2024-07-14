package com.AnudipLab;

import java.util.LinkedHashSet;
import java.util.Iterator;
public class LinkHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> favoriteFruits = new LinkedHashSet<String>();
        LinkedHashSet<String> favoriteVegetables = new LinkedHashSet<String>();

        // Adding fruits to the set
        favoriteFruits.add("Apple");
        favoriteFruits.add("Banana");
        favoriteFruits.add("Orange");
        favoriteFruits.add("Grapes");

        // Adding vegetables to the set
        favoriteVegetables.add("Tomato");
        favoriteVegetables.add("Broccoli");
        favoriteVegetables.add("Spinach");
        favoriteVegetables.add("Cabbage");

        // Displaying the initial sets
        System.out.println("Favorite Fruits: " + favoriteFruits);
        System.out.println("Favorite Vegetables: " + favoriteVegetables);


        // Removing an element from favoriteVegetables set
        favoriteVegetables.remove("Broccoli");
        System.out.println("Favorite Vegetables after removing Broccoli: " + favoriteVegetables);

        // Removing an element from favoriteFruits set
        favoriteFruits.remove("Orange");
        System.out.println("Favorite Fruits after removing Orange: " + favoriteFruits);

        // Checking if the set contains the fruit or the vegetable
        System.out.println("Does the favorite fruits set contain 'Banana'? " + favoriteFruits.contains("Banana"));
        System.out.println("Does the favorite vegetables set contain 'Potato'? " + favoriteVegetables.contains("Tomato"));

        // Using iterator to iterate over favoriteFruits set
        System.out.println("Iterating over favoriteFruits set:");
        Iterator<String> fruitIterator = favoriteFruits.iterator();
        while (fruitIterator.hasNext())
        {
            String fruit = fruitIterator.next();
            System.out.println(fruit);
        }

    }
}



