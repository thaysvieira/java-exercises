package com.amigoscode._4_datastructures._8_challenge;

// Exercise: Data Structure Challenge
// Combine multiple data structures to solve a real-world problem.
// Manage a collection of students, group them, track recently viewed, and generate reports.

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataStructureChallenge {

    // TODO: 1 - Create a Student record (or class) with three fields:
    //           String name, int grade, String subject
    //           If using a record: record Student(String name, int grade, String subject) {}
    //           If using a class: include constructor, getters, and a toString() method
    record Student(String name, int grade, String subject) {
    }

    public static void main(String[] args) {

        // TODO: 2 - Create a List of 10 students with various names, grades, and subjects
        //           Use at least 3 different subjects (e.g., "Math", "Science", "English")
        //           Example: new Student("Alice", 92, "Math")
        List<Student> students = new ArrayList<>(List.of(
                new Student("Alice", 92, "Math"),
                new Student("Pedro", 55, "Science"),
                new Student("Eduardo", 88, "Math"),
                new Student("Joao", 89, "English"),
                new Student("Antonela", 67, "Math"),
                new Student("Sonia", 75, "English"),
                new Student("Amanda", 50, "Math"),
                new Student("Maria", 90, "Science"),
                new Student("Helena", 67, "Science"),
                new Student("Joana", 77, "Math")
        ));


        // TODO: 3 - Use a Map<String, List<Student>> to group students by subject
        //           Iterate through the student list
        //           For each student, use computeIfAbsent() to get or create the list for their subject
        //           Then add the student to that list
        //           Print each subject and its students
        Map<String, List<Student>> studentsBySubject = new HashMap<>();

        for (Student student : students) {
            studentsBySubject.computeIfAbsent(student.subject(), s -> new ArrayList<>())
                    .add(student);
        }
        System.out.println(studentsBySubject);
        // TODO: 4 - Use a Set<String> to find all unique subjects
        //           Iterate through the students and add each subject to the set
        //           Print the unique subjects
        System.out.println("unique subjects.......");
        Set<String> subjects = new HashSet<>();
        for (Student student : students) {
            subjects.add(student.subject);
        }
        System.out.println(subjects);
        // TODO: 5 - Use a Stack<Student> to track the last 3 students "viewed"
        //           Push any 3 students from the list onto the stack
        //           Then pop and print them to show the viewing history (most recent first)
        Stack<Student> studentStack = new Stack<>();
        studentStack.push(new Student("Alice", 92, "Math"));
        studentStack.push(new Student("Pedro", 55, "Science"));
        studentStack.push(new Student("Antonela", 67, "Math"));
        System.out.println(studentStack.peek());
        studentStack.pop();
        System.out.println(studentStack);
        // TODO: 6 - Sort the student list by grade in descending order using a Comparator
        //           Use list.sort() with Comparator.comparingInt() and .reversed()
        //           Print the sorted list

        for (int i = students.size() - 1; i >= 0; i--) {
            System.out.println(students.get(i));
        }
        System.out.println("using students.reversed()");
        System.out.println(students.reversed());

        int max = students.get(0).grade;
        for (Student student : students) {
            if (student.grade > max) {
                max = student.grade;
            }
        }

        System.out.println("max is: " + max);
        // TODO: 7 - Print a summary report:
        //           - Total number of students
        //           - Number of unique subjects (from the Set)
        //           - Highest grade student (first in sorted list)
        //           - Number of students per subject (from the Map)
        System.out.println("Total number of students");
        System.out.println(students.size());
        System.out.println("Number of unique subjects (from the Set)");
        System.out.println(subjects.size());
        System.out.println("Highest grade student (first in sorted list)");
        System.out.println(students.get(0));
        System.out.println("Number of students per subject (from the Map)");

        int count = 0;
        int countScience = 0;
        int countEnglish = 0;
        for (Map.Entry<String, List<Student>> st : studentsBySubject.entrySet()) {
            if (st.getKey().equals("Math")) {
                count = count + st.getValue().size();
                System.out.println(st.getKey() + ": " + count);
            }
            if (st.getKey().equals("Science")) {
                countScience = countScience + st.getValue().size();
                System.out.println(st.getKey() + ": " + countScience);
            }
            if (st.getKey().equals("English")) {
                countEnglish = countEnglish + st.getValue().size();
                System.out.println(st.getKey() + ": " + countEnglish);
            }
        }
    }

}


















