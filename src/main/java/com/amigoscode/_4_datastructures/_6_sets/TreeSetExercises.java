package com.amigoscode._4_datastructures._6_sets;

// Exercise: TreeSet Operations
// Learn how to use TreeSet - a sorted set implementation backed by a TreeMap.

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TreeSetExercises {

    public static void main(String[] args) {

        // TODO: 1 - Create a TreeSet of Integers called 'numbers'
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(60);
        numbers.add(15);
        numbers.add(45);

        // TODO: 2 - Add these elements: 50, 20, 40, 10, 30, 60, 15, 45
        //           Print the set and observe that elements are automatically sorted
        System.out.println(numbers);
        int lower = 0;
        int max = 0;

        // TODO: 3 - Get and print the first (lowest) element using first()
        //           Get and print the last (highest) element using last()
        for (Integer number : numbers) {
            lower = number;
            break;
        }
        System.out.println("lower number: " + lower);
        for (Integer number : numbers) {
            if (number > lower) {
                max = number;
            }
        }
        System.out.println("Max number: " + max);
        // TODO: 4 - Get a subset of elements from 20 (inclusive) to 45 (exclusive) using subSet()
        //           Print the subset
        Set<Integer> subSet = new TreeSet<>();
        for (Integer number : numbers) {
            if (number == 50) break;
            if (number >= 20) {
                subSet.add(number);
            }
        }
        System.out.println(subSet);
        // TODO: 5 - Get and print the headSet (elements less than 30)
        //           Get and print the tailSet (elements greater than or equal to 30)
        System.out.println("Get and print the headSet (elements less than 30)");
        Set<Integer> headSet = new TreeSet<>();

        for (Integer number : numbers) {
            if (number == 40) break;
            if (number <= 30) {
                headSet.add(number);
            }
        }
        System.out.println(headSet);
        System.out.println("Get and print the tailSet (elements less than 30)");
        Set<Integer> tailSet = new TreeSet<>();

        for (Integer number : numbers) {
            if (number >= 30) {
                tailSet.add(number);
            }
        }
        System.out.println(tailSet);
        // TODO: 6 - Iterate over the TreeSet using a for-each loop
        //           Print each element and observe the natural ascending order
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}

