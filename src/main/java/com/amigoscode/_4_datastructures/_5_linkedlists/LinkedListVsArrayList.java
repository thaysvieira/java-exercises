package com.amigoscode._4_datastructures._5_linkedlists;

// Exercise: LinkedList vs ArrayList Performance Comparison
// Understand when to use LinkedList vs ArrayList by measuring operation times.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListVsArrayList {

    public static void main(String[] args) {

        // TODO: 1 - Create both an ArrayList<Integer> and a LinkedList<Integer>
        //           Fill each with 10000 elements (0 to 9999) using a for loop
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int a = 0; a < 1000; a++) {
            arrayList.add(a);
        }
        for (int a = 0; a < 1000; a++) {
            linkedList.add(a);
        }


        // TODO: 2 - Measure time to add an element at the beginning (index 0) for both lists
        //           Use System.nanoTime() before and after the operation
        //           Perform the add(0, value) operation 1000 times for each list
        //           Print the time taken for each in milliseconds
        //           (divide nanoseconds by 1_000_000 to get milliseconds)
        System.out.println("arraylist");
        System.out.println(System.nanoTime());
        arrayList.add(0,34);
        System.out.println(System.nanoTime());
        System.out.println("linkedlist");
        System.out.println(System.nanoTime());
        linkedList.add(0,34);
        System.out.println(System.nanoTime());



        // TODO: 3 - Measure time to add an element at the end for both lists
        //           Perform the add(value) operation 1000 times for each list
        //           Print the time taken for each
        System.out.println("arraylist");
        System.out.println(System.nanoTime());
        arrayList.add(999,55);
        System.out.println(System.nanoTime());
        System.out.println("linkedlist");
        System.out.println(System.nanoTime());
        linkedList.add(999,394);
        System.out.println(System.nanoTime());

        // TODO: 4 - Measure time to get an element at the middle index for both lists
        //           Perform get(list.size() / 2) operation 1000 times for each list
        //           Print the time taken for each
        System.out.println("arraylist");
        System.out.println(System.nanoTime());
        arrayList.add(arrayList.size()/2,355);
        System.out.println(System.nanoTime());
        System.out.println("linkedlist");
        System.out.println(System.nanoTime());
        linkedList.add(linkedList.size()/2,3094);
        System.out.println(System.nanoTime());

        // TODO: 5 - Print a summary explaining the differences
        //           Use System.out.println() to explain:
        //           - Why LinkedList is faster for insertions at the beginning
        //           - Why ArrayList is faster for random access (get by index)
        //           - When you would choose one over the other
        System.out.println("LinkedList is faster for insertions at the beginning because it only needs to update references (pointers) between nodes, without shifting elements.");

        System.out.println("ArrayList is faster for random access (get by index) because it stores elements in a contiguous array, allowing direct access using an index (O(1)).");

        System.out.println("Use LinkedList when you have frequent insertions/removals, especially at the beginning or middle.");

        System.out.println("Use ArrayList when you need fast access to elements by index and when insertions/removals are mostly at the end.");
    }
}
