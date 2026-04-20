package com.amigoscode._4_datastructures._6_sets;

// Exercise: HashSet Operations
// Learn how to use HashSet - an unordered collection that contains no duplicate elements.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExercises {

    public static void main(String[] args) {

        // TODO: 1 - Create a HashSet of Strings called 'fruits'
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Date");
        fruits.add("Banana");


        // TODO: 2 - Add elements: "Apple", "Banana", "Banana", "Apple", "Date", "Banana"
        //           Print the set after adding all elements
        //           Observe that duplicates are automatically ignored

        fruits.forEach(System.out::println);
        // TODO: 3 - Check if "Cherry" exists in the set using contains()
        //           Print the result
        System.out.println(fruits.contains("Cherry"));

        // TODO: 4 - Remove "Date" from the set
        //           Print the set after removal
        fruits.remove("Date");
        fruits.forEach(System.out::println);

        // TODO: 5 - Get and print the size of the set
        System.out.println(fruits.size());

        // TODO: 6 - Iterate over the set using a for-each loop and print each element
        //           Note: the order may not match insertion order (HashSet is unordered)
        fruits.forEach(System.out::println);


        // --- Removing Duplicates from a List ---
        System.out.println("\n--- Removing Duplicates ---");
        List<String> listWithDuplicates = new ArrayList<>(
                Arrays.asList("Java", "Python", "Java", "C++", "Python", "Go", "Java")
        );
        System.out.println("Original list: " + listWithDuplicates);

        // TODO: 7 - Use a HashSet to remove duplicates from 'listWithDuplicates'
        //           Create a new HashSet from the list, then create a new ArrayList from the set
        //           Print the deduplicated list
        Set<String> noDuplicates = new HashSet<>();
        noDuplicates.addAll(listWithDuplicates);
        List<String> listNohDuplicates = new ArrayList<>();
        listNohDuplicates.addAll(noDuplicates);
        System.out.println(listNohDuplicates);
    }
}
