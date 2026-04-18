package com.amigoscode._4_datastructures._3_stacks;

// Exercise: Stack Operations
// Learn how to use the Stack data structure - Last In, First Out (LIFO).

import java.util.Stack;

public class StackExercises {

    public static void main(String[] args) {

        // TODO: 1 - Create a Stack of Strings called 'stack'
        Stack<String> stack = new Stack<>();

        // TODO: 2 - Push 5 elements onto the stack: "Java", "Python", "C++", "JavaScript", "Go"
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        stack.push("JavaScript");
        stack.push("Go");
        // TODO: 3 - Peek at the top element without removing it
        //           Print the result (should be "Go")

        System.out.println(stack.peek());

        // TODO: 4 - Pop an element from the stack and print it
        //           Then print the stack to see the remaining elements
        stack.pop();
        System.out.println(stack);

        // TODO: 5 - Check if the stack is empty using isEmpty()
        //           Print the result

        System.out.println(stack.isEmpty());
        // --- String Reversal ---
        System.out.println("\n--- String Reversal ---");
        String original = "Hello World";

        // TODO: 6 - Use a Stack to reverse the string 'original'
        //           Push each character onto a stack, then pop them all to build the reversed string
        //           Print both original and reversed strings
        String[] splitBySpace = original.split(" ");
        Stack<String> saveElementsStack = new Stack<>();
        for (String element: splitBySpace){
            saveElementsStack.push(element);
        }
        System.out.println("Before");
        System.out.println(saveElementsStack);
        System.out.println("After reversed");
        System.out.println(saveElementsStack.reversed());

        // --- Balanced Brackets ---
        System.out.println("\n--- Balanced Brackets ---");
        String balanced = "({[()]})";
        String unbalanced = "({[})";
        // TODO: 7 - Implement a balanced brackets checker
        //           Use a Stack to check if a string of brackets is balanced
        //           For each char: if opening bracket, push it; if closing bracket, check
        //           that the top of stack is the matching opening bracket
        //           Test with both 'balanced' and 'unbalanced' strings
        //           Print whether each string is balanced or not
        System.out.println(balanced + " -> " + isBalanced(balanced));
        System.out.println(unbalanced + " -> " + isBalanced(unbalanced));


    }
    static boolean isBalanced(String text){
        Stack<Character> stack = new Stack<>();

        for (char c : text.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
