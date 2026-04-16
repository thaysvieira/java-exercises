package com.amigoscode._5_generics._6_wildcards;

import java.util.Arrays;
import java.util.List;

/**
 * Exercise: Unbounded Wildcards (?)
 *
 * The unbounded wildcard <?> represents an unknown type.
 * A List<?> can refer to a list of any type, but you cannot add elements
 * to it (except null) because the compiler does not know the actual type.
 *
 * Complete the TODOs below.
 */
public class UnboundedWildcard {

    // TODO: 1 - Create a static method: void printList(List<?> list)
    //  It should iterate through the list and print each element.
    //  Note: elements come out as Object since the type is unknown.
    static void printList(List<?> list){
        for (Object element: list){
            System.out.println(element);
        }
    }

    // TODO: 2 - Create a static method: int getSize(List<?> list)
    //  It should return the size of any list, regardless of its type.
    static int getSize(List<?> list){
        return list.size();
    }

    public static void main(String[] args) {

        // TODO: 3 - Create three lists:
        //  (a) List<String> with values "Hello", "World"
        //  (b) List<Integer> with values 1, 2, 3
        //  (c) List<Double> with values 1.1, 2.2, 3.3
        //  Call printList() and getSize() with each of them.
        List<String> strings = List.of("Hello", "World");
        printList(strings);
        System.out.println(getSize(strings));
        List<Integer> integers = List.of(1, 2, 3);
        printList(integers);
        System.out.println(getSize(integers));
        List<Double> doubles = List.of(1.1, 2.2, 3.3);
        printList(doubles);
        System.out.println(getSize(doubles));
        // TODO: 4 - Demonstrate that you CANNOT add elements to a List<?>.
        //  Uncomment the code below, observe the compile error, then comment
        //  it back out. Add a comment explaining why adding is not allowed.
        //
        // List<?> unknownList = Arrays.asList("a", "b", "c");
        // unknownList.add("d");       // Why does this not compile?
        // unknownList.add(1);         // Why does this not compile either?
        //Because we need to define the wrapper class inside the diamonds.

        // TODO: 5 - Demonstrate what you CAN do with List<?>:
        //  (a) Get the size
        //  (b) Check if it is empty
        //  (c) Read elements as Object
        //  (d) Remove elements (by index or using clear())
        //  Write code showing at least two of these operations on a List<?>.
        List<?> unknownList = Arrays.asList("a", "b", "c");
        System.out.println(unknownList.size());
        System.out.println(unknownList.isEmpty());
        printList(unknownList);
        printList(unknownList);

    }
}
