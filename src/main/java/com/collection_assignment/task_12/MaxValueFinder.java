package com.collection_assignment.task_12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaxValueFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list of integers (separated by spaces): ");
        String input = scanner.nextLine();
        List<Integer> list = new ArrayList<>();
        for (String inputString : input.split("\\s+")) {
            list.add(Integer.parseInt(inputString));
        }
        int maxValue = findMaxValue(list);
        System.out.println("Max value in list: " + maxValue);
        scanner.close();
    }

    public static int findMaxValue(List<Integer> list) {
        return Collections.max(list);
    }
}
