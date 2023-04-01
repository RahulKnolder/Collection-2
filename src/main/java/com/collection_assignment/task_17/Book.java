package com.collection_assignment.task_17;

import java.util.Comparator;

public class Book {
    private String title;
    private String author;
    private double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getters and Setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Implementation of the Comparator interface for sorting by author in alphabetical order, and then by price in descending order

    public static Comparator<Book> authorPriceComparator = new Comparator<Book>() {
        @Override
        public int compare(Book book1, Book book2) {
            int result = book1.getAuthor().compareTo(book2.getAuthor());

            if (result == 0) {
                result = Double.compare(book2.getPrice(), book1.getPrice());
            }

            return result;
        }
    };
}
