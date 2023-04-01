package com.collection_assignment.task_3;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a HashMap to store stock symbols and their prices
        HashMap<String, Double> stockPrices = new HashMap<>();

        // Use Scanner to get user input for stock symbols and their prices
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter stock symbols and prices (separated by space), or type \"done\" to exit:");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            String[] symbolPrice = input.split(" ");
            String symbol = symbolPrice[0];
            double price = Double.parseDouble(symbolPrice[1]);
            stockPrices.put(symbol, price);
        }

        // Find the stock with the highest price
        StockPriceFinder finder = new StockPriceFinder();
        String highestStock = finder.findHighestStock(stockPrices);

        // Print the result
        System.out.println("The stock with the highest price is: " + highestStock);
    }
}
