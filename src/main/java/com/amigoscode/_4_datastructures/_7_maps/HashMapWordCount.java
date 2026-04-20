package com.amigoscode._4_datastructures._7_maps;

// Exercise: Word Frequency Counter using HashMap
// A practical exercise to count word occurrences in a sentence.

import java.util.*;

public class HashMapWordCount {

    public static void main(String[] args) {

        String sentence = "the cat sat on the mat and the cat ate the rat on the mat";

        // TODO: 1 - Split the sentence into an array of words using split(" ")
        String[] sentenceSplit = sentence.split(" ");

        // TODO: 2 - Create a HashMap<String, Integer> called 'wordCount'
        //           Iterate through the words array and count the frequency of each word
        //           Hint: use getOrDefault(word, 0) + 1 to increment the count
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : sentenceSplit) {
            int count = wordCount.getOrDefault(word, 0);
            wordCount.put(word, count + 1);
        }

        // TODO: 3 - Print each word and its count by iterating over the map
        //           Format: "<word>: <count>"
        System.out.println(wordCount);
        // TODO: 4 - Find and print the most frequent word
        //           Iterate through the entrySet and track the entry with the highest value
        int max= wordCount.get("and");
        String word = "";
        for(Map.Entry<String, Integer> value: wordCount.entrySet()){
            if(value.getValue()>max){
                max= value.getValue();
                word= value.getKey();
            }
        }
        System.out.println("highest value: "+max);
        System.out.println("most frequent word: "+word);
        // TODO: 5 - Find and print all words that appear only once
        //           Iterate through the entrySet and collect entries where value == 1
        for(Map.Entry<String, Integer> value: wordCount.entrySet()){
            if(value.getValue()==1){
                System.out.println(value.getKey());
            }
        }
        }









        // TODO: 6 - Sort the map entries by value (frequency) in descending order and print
        //           Hint: create a List from entrySet(), then sort using a Comparator
        //           that compares entry values in reverse order

    }

