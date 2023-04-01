package com.collection_assignment.task_7;

import java.util.*;

public class SortDecending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the strings separated by commas: ");
        String input = scanner.nextLine();
        HashSet<String> set = new HashSet<>(Arrays.asList(input.split(",")));
        ArrayList<String> sortedList = sortDescending(set);
        System.out.println(sortedList);
        scanner.close();
    }

    public static ArrayList<String> sortDescending(HashSet<String> set) {
        ArrayList<String> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());
        return list;
    }
}
