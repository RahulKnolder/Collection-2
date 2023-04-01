package com.collection_assignment.task_8;

import java.util.*;

public class TreeMapSorter {


    public  LinkedHashMap<String, Integer> sortTreeMapByValues(TreeMap<String, Integer> treeMap) {
        // Create a list of entries from the TreeMap
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(treeMap.entrySet());

        // Sort the entries by values in descending order using a comparator
        Comparator<Map.Entry<String, Integer>> valueComparator = Map.Entry.<String, Integer>comparingByValue().reversed();
        entries.sort(valueComparator);

        // Store the sorted entries in a new LinkedHashMap
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            int value = entry.getValue();
            sortedMap.put(key, value);
        }

        return sortedMap;
    }
}
