package com.collection_assignment.task_15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 20));

        System.out.println("Before sorting: " + people);

        Collections.sort(people, new PersonAgeComparator());

        for (Person personObj:people) {
            System.out.println(personObj.getName()+" "+personObj.getAge());

        }
    }
}
