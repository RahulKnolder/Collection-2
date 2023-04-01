package com.collection_assignment.task_3;

import java.util.HashMap;
import java.util.Scanner;

public class StockPriceFinder {


    // A method that finds the stock with the highest price in a HashMap
    public static String findHighestStock(HashMap<String, Double> stockPrices) {

        String highestStock = "";

        //Double.NEGATIVE_INFINITY is a constant value in Java that represents the negative infinity value of the double

      double highestPrice = Double.NEGATIVE_INFINITY;

        for (String symbol : stockPrices.keySet()) {
            double price = stockPrices.get(symbol);
            if (price > highestPrice) {
                highestPrice = price;
                highestStock = symbol;
            }
        }

        return highestStock;
    }
}
