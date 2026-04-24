package com.amigoscode._6_functionalinterfaces._1_gettingstarted;

/**
 * Exercise: Functional Interface Basics
 *
 * Learn how to define a functional interface, implement it using anonymous classes
 * and lambda expressions, and pass it as a method parameter.
 *
 * A functional interface is an interface with exactly one abstract method.
 * The @FunctionalInterface annotation helps the compiler enforce this rule.
 */
public class FunctionalInterfaceBasics {

    // TODO: 1 - Define a @FunctionalInterface called Greeting with a single
    //  abstract method: void greet(String name)
    //  Remember to annotate it with @FunctionalInterface.
    @FunctionalInterface
    interface Greeting{
        void greet(String name);
    }

    // TODO: 2 - Implement Greeting using an anonymous class.
    //  The greet method should print "Hello, <name>!" to the console.
    static class Person implements Greeting{

        @Override
        public void greet(String name) {
            System.out.println("Hello, "+name+"!");
        }
    }
    public static void main(String[] args) {

        // TODO: 3 - Implement Greeting using a lambda expression.
        //  Use the full lambda syntax: (String name) -> { ... }

        Greeting greeting = (name)->{
           name ="Maria";
            System.out.println(name);
        };
        greeting.greet("Alice");

        // TODO: 4 - Implement Greeting using a shorter lambda.
        //  Since there is only one parameter, you can omit the parentheses
        //  and the type: name -> System.out.println(...)
        Greeting greetingJulia =name -> System.out.println("Julia");
        greetingJulia.greet("Alice");

        // TODO: 5 - Call greet("Alice") on each of the three implementations above
        //  and observe the output.


        // TODO: 6 - Call the printGreeting method below, passing a Greeting lambda
        //  and the name "Bob". The lambda should print "Hey there, <name>!".
        Greeting bob = new Person();
        printGreeting(bob,"Bob");
    }

    // Uncomment the method below after completing TODO 1:

    // /**
    //  * A helper method that accepts a Greeting functional interface and a name,
    //  * then invokes greet on the given name.
    //  */
     static void printGreeting(Greeting greeting, String name) {
         greeting.greet(name);
     }
}
