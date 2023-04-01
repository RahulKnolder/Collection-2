package com.collection_assignment.task_9;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<CustomObject> linkedList = new LinkedList<>();
        linkedList.add(new CustomObject("Rahul"));
        linkedList.add(new CustomObject("sinha"));
        linkedList.add(new CustomObject("rakhi"));

        // Sort the LinkedList in alphabetical order by the "name" field
        Collections.sort(linkedList, new Comparator<CustomObject>() {
            @Override
            public int compare(CustomObject o1, CustomObject o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        // Print the sorted LinkedList
        for (CustomObject obj : linkedList) {
            System.out.println(obj.getName());
        }
    }
}
