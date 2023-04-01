package com.collection_assignment.task_1;

import java.util.HashMap;
import java.util.Scanner;

public class NameAgeMap {
    public static void main(String[] args) {
        // Create a new Scanner object to read user input
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the number of entrie you want ");
        int numberOFEntries = scanner.nextInt();
        // Create a new HashMap to store name-age pairs
        HashMap<String, Integer> nameAgeMap = new HashMap<>();

        // Ask the user to enter the name and age for each person
        System.out.println("Enter first names and ages (separated by a space):");

        for (int indexOfMap = 0; indexOfMap < numberOFEntries; indexOfMap++) {
            String name = scanner.next();
            int age = scanner.nextInt();
            nameAgeMap.put(name, age);
        }

        // Print the contents of the HashMap
        System.out.println("Name-Age Pairs:");
        for (String name : nameAgeMap.keySet()) {
            System.out.println(name + " - " + nameAgeMap.get(name));
        }

        // Close the Scanner to free up resources
        scanner.close();
    }
}