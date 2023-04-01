package com.collection_assignment.task_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortInAsending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers (comma-separated):");
        String input = scanner.nextLine();
        List<Integer> numbers = parseInput(input);
        sortList(numbers);
        System.out.println("Sorted list: " + numbers);
    }

    public static List<Integer> parseInput(String input) {
        List<Integer> numbers = new ArrayList<>();
        String[] tokens = input.split(",");
        for (String token : tokens) {
            int number = Integer.parseInt(token.trim());
            numbers.add(number);
        }
        return numbers;
    }

    public static void sortList(List<Integer> list) {
        Collections.sort(list);
    }
}
