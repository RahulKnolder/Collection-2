package com.collection_assignment.task_11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StringListSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list of strings (separated by spaces): ");
        String input = scanner.nextLine();
        List<String> list = Arrays.asList(input.split("\\s+"));
        System.out.println(list);
        sortAscending(list);
        System.out.println("Sorted list: " + list);
        scanner.close();
    }

    public static void sortAscending(List<String> list) {
        Collections.sort(list);
    }
}
