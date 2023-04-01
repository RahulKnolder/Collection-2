package com.collection_assignment.task_13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ShuffleList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list of integers (separated by spaces): ");
        String input = scanner.nextLine();
        List<Integer> list = convertInputToList(input);
        System.out.println("Original list: " + list);
        Collections.shuffle(list);
        System.out.println("Shuffled list: " + list);
        scanner.close();
    }

    public static List<Integer> convertInputToList(String input) {
        List<Integer> list = new ArrayList<>();
        for (String inputString : input.split("\\s+")) {
            list.add(Integer.parseInt(inputString));
        }
        return list;
    }
}
