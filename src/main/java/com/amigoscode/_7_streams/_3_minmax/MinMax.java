package com.amigoscode._7_streams._3_minmax;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Exercise: Min and Max
 *
 * Learn how to find minimum and maximum elements in a stream
 * using min(), max(), and reduce(). These operations return Optional
 * since the stream might be empty.
 */
public class MinMax {

    record Person(String name, int age) {}

    public static void main(String[] args) {
        List<Integer> numbers = List.of(45, 12, 89, 3, 67, 34, 91, 23, 56);
        List<String> words = List.of("Java", "Streams", "Hi", "Programming", "API", "Go");
        List<Person> people = List.of(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35),
                new Person("Diana", 22),
                new Person("Eve", 28)
        );
        List<Integer> emptyList = List.of();

        // TODO: 1 - Find the minimum value in 'numbers' using stream min()
        //           Use Comparator.naturalOrder() or Integer::compareTo
        //           Print the result
        Integer min = numbers.stream().min(Comparator.naturalOrder()).get();
        System.out.println(min);

        // TODO: 2 - Find the maximum value in 'numbers' using stream max()
        //           Print the result
        Integer max = numbers.stream().max(Comparator.naturalOrder()).get();
        System.out.println(max);

        // TODO: 3 - Find the shortest string in 'words' by comparing string length
        //           Use Comparator.comparingInt(String::length)
        //           Print the result
        String shortestString = words.stream().min(Comparator.comparingInt(String::length)).get();
        System.out.println(shortestString);

        // TODO: 4 - Find the youngest person from 'people'
        //           Use Comparator.comparingInt(Person::age)
        //           Print the person's name and age
        Person youngestPerson = people.stream().min(Comparator.comparingInt(Person::age)).get();
        System.out.println(youngestPerson);

        // TODO: 5 - Find the maximum value in 'numbers' using reduce() instead of max()
        //           Use Integer::max as the binary operator
        //           Print the result
        Integer reduce = numbers.stream().reduce(0, (Integer::max));
        System.out.println(reduce);

        // TODO: 6 - Handle the empty stream case: try to find min of 'emptyList'
        //           Use orElse() to provide a default value of -1
        //           Print the result
        Integer i = emptyList.stream().min(Comparator.naturalOrder()).orElse(-1);
        System.out.println(i);
    }
}
