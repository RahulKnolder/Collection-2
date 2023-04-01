package com.collection_assignment.task_10;

import java.util.*;

public class SortPriorityQueue {
    public static void main(String[] args) {
        // creating and adding values to priority queue.
        Queue<Integer> numbers = new PriorityQueue<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of entries to enter in queue: ");
        Integer totalEntries = input.nextInt();
        for(Integer index=0; index<totalEntries; index++)
        {
            System.out.println("Enter a number");
            Integer number = input.nextInt();
            numbers.add(number);
        }

        List<Integer> numberList = new ArrayList<>(numbers);
        //sorting priority queue in descending order by adding them in list.
        Collections.sort(numberList, Collections.reverseOrder());
        System.out.println(numberList);

    }
}
