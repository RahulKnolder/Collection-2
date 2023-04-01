package com.collection_assignment.task_2;

import java.util.HashMap;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Create a HashMap to store student names and grades
        HashMap<String, Double> grades = new HashMap<>();

        // Use Scanner to take input from the user
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a student name (or 'done' to finish): ");
            String name = scanner.nextLine();
            if (name.equals("done")) {
                break;
            }

            System.out.print("Enter " + name + "'s grade: ");
            double grade = scanner.nextDouble();
            scanner.nextLine();  // consume the remaining newline character

            grades.put(name, grade);
        }

        // Calculate the average grade
        AverageGrade garde= new AverageGrade();
        double average = garde.calculateAverageGrade(grades);

        // Print the average grade
        System.out.println("Average grade: " + average);
    }
}
