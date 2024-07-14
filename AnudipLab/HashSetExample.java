package com.AnudipLab;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> favoriteFruits = new HashSet<>();
        Set<String> favoriteVegetables = new HashSet<>();

        // Adding fruits to the set
        favoriteFruits.add("Apple");
        favoriteFruits.add("Litchi");
        favoriteFruits.add("Orange");
        favoriteFruits.add("Mango");

        // Adding vegetables to the set
        favoriteVegetables.add("Carrot");
        favoriteVegetables.add("Broccoli");
        favoriteVegetables.add("Spinach");
        favoriteVegetables.add("LadyFinger");

        // Displaying the initial sets
        System.out.println("Favorite Fruits: " + favoriteFruits);
        System.out.println("Favorite Vegetables: " + favoriteVegetables);


        // Removing an element from favoriteVegetables set
        favoriteVegetables.remove("Broccoli");
        System.out.println("Favorite Vegetables after removing Broccoli: " + favoriteVegetables);

        // Removing an element from  set favoriteFruits set
        favoriteVegetables.remove("Apple");
        System.out.println("Favorite Fruits after removing Apple: " + favoriteFruits);

        // Checking if the set contains the fruit or the vegetable
        System.out.println("Does the favorite fruits set contain 'Banana'? " + favoriteFruits.contains("Banana"));
        System.out.println("Does the favorite vegetables set contain 'Potato'? " + favoriteVegetables.contains("Potato"));

        // Using iterator to iterate over favoriteFruits set
        System.out.println("Iterating over favoriteFruits set:");
        Iterator<String> fruitIterator = favoriteFruits.iterator();
        while (fruitIterator.hasNext()) {
            String fruit = fruitIterator.next();
            System.out.println(fruit);
        }

    }
}



