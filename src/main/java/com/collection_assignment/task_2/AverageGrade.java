package com.collection_assignment.task_2;

import java.util.HashMap;
import java.util.Scanner;

public class AverageGrade {

    //method for calculating average
    public  double calculateAverageGrade(HashMap<String, Double> grades) {
        double sum = 0.0;
        for (Double grade : grades.values()) {
            sum += grade;
        }
        return sum / grades.size();
    }



}
