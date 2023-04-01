package com.collection_assignment.task_5;

import java.util.*;

public class WordCounter {


    public void wordConter(String inputString) {
        //removing special charter and converting into lower case
        inputString = inputString.replaceAll("[^a-zA-Z0-9]", " ").toLowerCase();

        String inputArray[] = inputString.split(" ");


        HashMap<String, Integer> map = new HashMap<>();

        for (int indexofInputArray = 0; indexofInputArray < inputArray.length; indexofInputArray++) {
            inputArray[indexofInputArray] = inputArray[indexofInputArray].trim();
        }

        int counterWords = 0;

        //comparing and counting the words in the string
        for (int firstIndexofInputArray = 0; firstIndexofInputArray < inputArray.length - 1; firstIndexofInputArray++) {
            for (int secondIndexofInputArray = 0; secondIndexofInputArray < inputArray.length - 1; secondIndexofInputArray++) {
                if (inputArray[firstIndexofInputArray].equals(inputArray[secondIndexofInputArray])) {
                    if (inputArray[firstIndexofInputArray] == "") {
                        firstIndexofInputArray++;
                    }
                    counterWords++;
                }

            }

            //storing it into map
            map.put(inputArray[firstIndexofInputArray], counterWords);

            counterWords = 0;
        }


        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        // Sort the ArrayList using a Comparator that compares the values of each entry
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        // Copy the sorted entries back into a LinkedHashMap
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        // Print the top 10 values
        int count = 0;
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            count++;
            if (count == 10) {
                break;
            }
        }
    }

    public static void main(String[] args) {

        //scanner input
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        WordCounter word = new WordCounter();
        word.wordConter(inputString);

    }
}
