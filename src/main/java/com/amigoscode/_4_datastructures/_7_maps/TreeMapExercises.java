package com.amigoscode._4_datastructures._7_maps;

// Exercise: TreeMap Operations
// Learn how to use TreeMap - a sorted map implementation that maintains keys in natural order.

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapExercises {

    public static void main(String[] args) {

        // TODO: 1 - Create a TreeMap<String, Double> called 'productPrices'
        //           This will store product names and their prices
        Map<String, Double> productPrices = new TreeMap<>();

        // TODO: 2 - Add 5 products with prices:
        //           "Laptop" -> 999.99, "Phone" -> 699.99, "Tablet" -> 449.99,
        //           "Headphones" -> 149.99, "Mouse" -> 29.99
        productPrices.put("Laptop",999.99);
        productPrices.put("Phone",699.99);
        productPrices.put("Tablet",449.99);
        productPrices.put("Headphones",149.99);
        productPrices.put("Mouse",29.99);

        // TODO: 3 - Get and print the first key using firstKey()
        //           Get and print the last key using lastKey()
        //           Observe that they are in alphabetical order
        System.out.println(productPrices);
      for(Map.Entry<String,Double> product: productPrices.entrySet()){
          System.out.println("Printing first element");
          System.out.println(product);
          break;
      }
      int count = 0;
        for(Map.Entry<String,Double> product: productPrices.entrySet()){
           count++;
          if(count== productPrices.size()){
              System.out.println("Printing last element");
              System.out.println(product);
          }
        }

        // TODO: 4 - Get a submap of products from "Laptop" (inclusive) to "Phone" (exclusive)
        //           using subMap() and print it
        Map<String, Double> submap = new TreeMap<>();
        for(Map.Entry<String,Double> product: productPrices.entrySet()){
            switch (product.getKey()){
                case "Laptop","Mouse","Phone"->submap.put(product.getKey(), product.getValue());
            }
        }
        System.out.println(submap);

        // TODO: 5 - Iterate over the TreeMap in natural (ascending) key order
        //           Print each product and price in format: "<product>: $<price>"

        for(Map.Entry<String,Double> product: productPrices.entrySet()){
            System.out.println(product.getKey()+": "+product.getValue());
        }

        // TODO: 6 - Iterate in reverse order using descendingMap()
        //           Print each product and price
        TreeMap<String,Double> map = new TreeMap<>();
        map.putAll(productPrices);
        System.out.println(map.descendingMap());
    }
}
