package com.collection_assignment.task_8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        // Create a new TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Create a Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter key-value pairs for the TreeMap
        System.out.println("Enter key-value pairs for the TreeMap (one pair per line): and press enter two times for result ");
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            String[] pair = line.split("\\s+");
            String key = pair[0];
            int value = Integer.parseInt(pair[1]);
            treeMap.put(key, value);
        }
        TreeMapSorter treeMapSorter = new TreeMapSorter();
        // Sort the entries in the TreeMap by values in descending order and store them in a LinkedHashMap
        LinkedHashMap<String, Integer> sortedMap = treeMapSorter.sortTreeMapByValues(treeMap);

        // Print the sorted entries in the LinkedHashMap
        System.out.println("Sorted entries in the LinkedHashMap:");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + " " + value);
        }
    }
}
