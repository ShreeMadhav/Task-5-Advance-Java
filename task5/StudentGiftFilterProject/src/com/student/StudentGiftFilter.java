package com.student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentGiftFilter {
    public static void main(String[] args) {
        // Create a list to store student names
        List<String> students = new ArrayList<>();
        
        // Adding 10 student names to the list
        students.add("Alice");
        students.add("Bob");
        students.add("Andrew");
        students.add("Cathy");
        students.add("Adam");
        students.add("David");
        students.add("Eva");
        students.add("Aiden");
        students.add("Sophia");
        students.add("Michael");
        
        // Use Stream API and lambda expression to filter names that start with 'A'
        List<String> studentsWithAGifts = students.stream()
            .filter(name -> name.startsWith("A")) // Filter names that start with 'A'
            .collect(Collectors.toList()); // Collect the results into a list

        // Print the names of students who will receive gifts
        System.out.println("Students receiving special gifts: " + studentsWithAGifts);
    }
}
