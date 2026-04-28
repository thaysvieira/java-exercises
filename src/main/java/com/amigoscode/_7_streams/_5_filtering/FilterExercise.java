package com.amigoscode._7_streams._5_filtering;

import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Exercise: Advanced Filtering
 *
 * Practice more complex filtering scenarios including chaining filters,
 * using Predicate variables, and combining conditions.
 */
public class FilterExercise {

    record Person(String name, int age, String city) {}

    record Order(String product, double amount, String status) {}

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Alice", 25, "London"),
                new Person("Bob", 17, "Paris"),
                new Person("Charlie", 30, "London"),
                new Person("Diana", 15, "Berlin"),
                new Person("Eve", 22, "Paris"),
                new Person("Frank", 45, "Berlin"),
                new Person("Grace", 12, "London")
        );

        List<Order> orders = List.of(
                new Order("Laptop", 999.99, "COMPLETED"),
                new Order("Mouse", 29.99, "PENDING"),
                new Order("Keyboard", 149.99, "COMPLETED"),
                new Order("Monitor", 399.99, "SHIPPED"),
                new Order("Headset", 79.99, "PENDING"),
                new Order("Webcam", 59.99, "COMPLETED")
        );

        List<String> emails = List.of(
                "user@example.com",
                "invalid-email",
                "admin@company.co.uk",
                "not-an-email",
                "hello@world.org",
                "test@test.com"
        );

        // TODO: 1 - Filter 'people' to find persons older than 18
        //           Print each person's name and age
        List<Person> olderThan18 = people.stream().filter(p -> p.age > 18).toList();
        System.out.println(olderThan18);

        // TODO: 2 - Filter 'orders' with amount greater than 100
        //           Print each order's product and amount
        List<Order> amountGreater = orders.stream().filter(n -> n.amount > 100).toList();
        System.out.println(amountGreater);
        // TODO: 3 - Filter 'emails' keeping only valid ones matching a simple regex
        //           Use the pattern: ".+@.+\\..+"  (contains @ and a dot after it)
        //           Hint: Use String::matches in the filter predicate
        //           Print each valid email
        List<String> match = emails.stream().filter(s->Pattern.matches(".+@.+\\..+",s)).toList();
        System.out.println(match);

        // TODO: 4 - Chain multiple filter conditions on 'people':
        //           Keep persons who are older than 18 AND live in "London"
        //           Print each matching person
        List<Person> london = people.stream().filter(p -> p.age() > 18).filter(o -> o.city().equals("London")).toList();
        System.out.println(london);

        // TODO: 5 - Create a Predicate<Order> variable called 'isExpensive' that checks
        //           if an order amount is >= 100. Use this predicate in filter().
        //           Print each matching order's product
        Predicate<Order> isExpensive = o-> o.amount>=100;
        List<Order> expensiveOrders = orders.stream().filter(isExpensive).toList();
        System.out.println(expensiveOrders);

        // TODO: 6 - Filter 'people' with complex OR conditions:
        //           Keep persons who live in "Paris" OR are younger than 18
        //           Print each matching person
        List<Person> paris = people.stream().filter(p -> p.age() > 18).filter(o -> o.city().equals("Paris")).toList();
        System.out.println(paris);
        // TODO: 7 - Count the number of COMPLETED orders
        //           Use filter + count() and print the result
        long completed = orders.stream().filter(o -> o.status.equals("COMPLETED")).count();
        System.out.println(completed);
    }
}
