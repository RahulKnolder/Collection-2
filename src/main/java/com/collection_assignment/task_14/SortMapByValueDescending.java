package com.collection_assignment.task_14;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SortMapByValueDescending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a list of key-value pairs separated by spaces
        System.out.print("Enter a list of key-value pairs (separated by spaces): ");
        String input = scanner.nextLine();

        // Create a new HashMap to store the key-value pairs
        Map<String, Integer> map = new HashMap<>();

        // Split the input string into individual pairs and add them to the HashMap
        for (String pair : input.split("\\s+")) {
            String[] keyValue = pair.split(":");
            map.put(keyValue[0], Integer.parseInt(keyValue[1]));
        }

        // Print the unsorted HashMap to the console
        System.out.println("Unsorted map: " + map);

        // Sort the HashMap in descending order by value using the sortByValueDescending() method
        Map<String, Integer> sortedMap = sortByValueDescending(map);

        // Print the sorted HashMap to the console
        System.out.println("Sorted map: " + sortedMap);

        // Close the Scanner object to free up system resources
        scanner.close();
    }

    // This method takes a HashMap and returns a new LinkedHashMap sorted in descending order by value
    public static Map<String, Integer> sortByValueDescending(Map<String, Integer> map) {
        // Create a new LinkedHashMap to store the sorted key-value pairs
        Map<String, Integer> sortedMap = new LinkedHashMap<>();

        // Define a Comparator to sort the HashMap by value in descending order
        Comparator<Map.Entry<String, Integer>> valueComparator =
                Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder());

        // Sort the HashMap by value in descending order and add the sorted key-value pairs to the LinkedHashMap
        map.entrySet()
                .stream()
                .sorted(valueComparator)
                .forEachOrdered(entry -> sortedMap.put(entry.getKey(), entry.getValue()));

        // Return the sorted LinkedHashMap
        return sortedMap;
    }
}
