package com.collection_assignment.task_4;

import java.util.*;

public class EmployeeSalaryTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a HashMap that maps employee names to their salaries
        Map<String, Double> employeeSalaries = new HashMap<>();

        // Ask the user for the number of employees
        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine();

        // Ask the user for each employee's name and salary, and add them to the HashMap
        for (int i = 0; i < numEmployees; i++) {
            System.out.print("Enter the employee name: ");
            String name = scanner.nextLine();
            System.out.print("Enter the employee salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();
            employeeSalaries.put(name, salary);
        }

        // Print out the original HashMap
        System.out.println("Original employee salaries:");
        System.out.println(employeeSalaries);

        // Update salaries of employees who earn less than $50,000 per year by 5%
        for (Map.Entry<String, Double> entry : employeeSalaries.entrySet()) {
            if (entry.getValue() < 50000.0) {
                double newSalary = entry.getValue() * 1.05;
                entry.setValue(newSalary);
            }
        }

        // Print out the updated HashMap
        System.out.println("Updated employee salaries:");
        System.out.println(employeeSalaries);
    }
}
