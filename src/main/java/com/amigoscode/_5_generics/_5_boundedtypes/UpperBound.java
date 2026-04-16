package com.amigoscode._5_generics._5_boundedtypes;

import java.util.Arrays;
import java.util.List;

/**
 * Exercise: Upper Bounded Type Parameters
 *
 * This exercise demonstrates bounded type parameters using "extends".
 * When you write <T extends Number>, T can only be Number or its subclasses
 * (Integer, Double, Long, etc.). This lets you call Number methods like
 * doubleValue() on values of type T.
 *
 * Complete the TODOs below.
 */
public class UpperBound {

    // TODO: 1 - Create a static generic method: <T extends Number> double sum(List<T> list)
    //  It should return the sum of all elements as a double.
    //  Use the doubleValue() method on each element (available because T extends Number).
   static  <T extends Number> double sum(List<T> list){
       if(list.isEmpty()){
           throw new IllegalArgumentException("CAN'T BE NULL");
       }
        double sum = list.get(0).doubleValue();
        for(T element: list){
            sum+= element.doubleValue();
        }
        return sum;
   }

    // TODO: 2 - Create a static generic method: <T extends Number> T findMax(List<T> list)
    //  It should return the largest element in the list.
    //  Compare elements using doubleValue(). If the list is empty, return null.
    static <T extends Number> T findMax(List<T> list){
        if(list.isEmpty()){
            throw new IllegalArgumentException("CAN'T BE NULL");
        }
        T max = list.get(0);
        for(T element: list){
            if(element.doubleValue()>max.doubleValue()){
                max = element;
            }
        }
        return max;
    }

    // TODO: 3 - Create a generic class NumberBox<T extends Number> with a private T field
    //  called "number" and a constructor that takes T.
    static class NumberBox<T extends Number>{
       private T number;

        public NumberBox(T number) {
            this.number = number;
        }
        // TODO: 4 - In NumberBox, add an isPositive() method that returns true if the
        //  stored number's doubleValue() is greater than 0.

        public boolean isPositive(){
            return this.number.doubleValue()>0;
        }
        // TODO: 5 - In NumberBox, add toInt() and toDouble() conversion methods that
        //  return the stored number as an int (using intValue()) and as a double
        //  (using doubleValue()) respectively.
        public int toInt(){
            return this.number.intValue();
        }
        public double toDouble(){
            return this.number.doubleValue();
        }
    }







    public static void main(String[] args) {

        // TODO: 6 - Test sum() and findMax() with:
        //  (a) A List<Integer> e.g., Arrays.asList(1, 2, 3, 4, 5)
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(sum(numbers));
        System.out.println(findMax(numbers));
        //  (b) A List<Double> e.g., Arrays.asList(1.5, 2.5, 3.5)
        List<Double> numbersAsDouble = Arrays.asList(1.5, 2.5, 3.5);
        System.out.println(sum(numbersAsDouble));
        System.out.println(findMax(numbersAsDouble));
        //  Print the results for each.
        //  Also create a NumberBox<Integer> and NumberBox<Double and test
        NumberBox<Integer> numberBox=new NumberBox<>(2);
        System.out.println(numberBox.isPositive());
        System.out.println(numberBox.toDouble());
        NumberBox<Double> doubleNumberBox= new NumberBox<>(-9.0);
        System.out.println(doubleNumberBox.isPositive());
        System.out.println(doubleNumberBox.toInt());
        //  isPositive(), toInt(), and toDouble().


        // TODO: 7 - Uncomment the line below and observe the compile error.
        //  Then comment it back out and add a comment explaining why it fails.
        //
        // List<String> strings = Arrays.asList("a", "b");
        // double result = sum(strings);  // Why does this not compile?

    }
}
