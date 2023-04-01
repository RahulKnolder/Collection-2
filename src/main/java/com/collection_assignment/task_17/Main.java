package com.collection_assignment.task_17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Gatsby", "Rahul sinha", 9.99));
        books.add(new Book("bhagwat geeta", "Balmiki g", 7.99));
        books.add(new Book("Pride and Prejudice", "Riya", 6.99));
        books.add(new Book(" in the Rye", "shiv", 8.99));

        Collections.sort(books, Book.authorPriceComparator);

        for (Book book : books) {
            System.out.println(book.getAuthor() + " - " + book.getTitle() + " - Rs" + book.getPrice());
        }
    }
        }
