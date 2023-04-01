package com.collection_assignment.task_16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortEmployee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Employee> employeesList = new ArrayList<>();
        System.out.println("Enter the number of persons: ");
        Integer numberOfEmployees = input.nextInt();
        String employeeName;
        Integer employeeId;
        Double employeeSalary;
        for(Integer index = 1; index<=numberOfEmployees; index++){
            System.out.println("Enter the name of employee "+(index)+":");
            employeeName = input.nextLine();
            employeeName = input.nextLine();
            System.out.println("Enter the id of employee "+(index)+":");
            employeeId = input.nextInt();
            System.out.println("Enter the salary of employee "+(index)+":");
            employeeSalary = input.nextDouble();
            Employee employee = new Employee(employeeName, employeeId, employeeSalary);
            employeesList.add(employee);
        }
        //sorting the list
        Collections.sort(employeesList);
        System.out.println(employeesList);
    }
}
