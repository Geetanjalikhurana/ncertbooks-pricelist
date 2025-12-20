package com.example.service;

import com.example.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();

        books.add(new Book("Maths", 1, 120, "maths.jpg"));
        books.add(new Book("English", 1, 100, "english.jpg"));
        books.add(new Book("EVS", 1, 90, "evs.jpg"));

        books.add(new Book("Maths", 2, 140, "maths_2.jpg"));
        books.add(new Book("English", 2, 120, "english_2.jpg"));

        return books;
    }
}
