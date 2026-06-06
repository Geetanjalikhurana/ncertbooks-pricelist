package com.example.service;

import com.example.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();

        books.add(new Book("Mathematics", 1, 120, "maths_1.jpg"));
        books.add(new Book("English", 1, 100, "english_1.jpg"));
        books.add(new Book("EVS", 1, 90, "evs_1.jpg"));

        books.add(new Book("Mathematics", 2, 140, "maths_2.jpg"));
        books.add(new Book("English", 2, 120, "english_2.jpg"));

        books.add(new Book("Science", 3, 180, "science_3.jpg"));
        books.add(new Book("Science", 4, 200, "science_4.jpg"));
        books.add(new Book("Science", 5, 220, "science_5.jpg"));
        books.add(new Book("Science", 6, 240, "science_6.jpg"));
        books.add(new Book("Science", 7, 260, "science_7.jpg"));
        books.add(new Book("Science", 8, 280, "science_8.jpg"));

        books.add(new Book("Geography", 7, 340, "geography_7.jpg"));
        books.add(new Book("Mathematics", 8, 400, "maths_8.jpg"));
        books.add(new Book("History", 8, 380, "history_8.jpg"));
        books.add(new Book("Geography", 8, 390, "geography_8.jpg"));

        books.add(new Book("Physics", 11, 450, "physics_11.jpg"));
        books.add(new Book("Chemistry", 11, 460, "chemistry_11.jpg"));
        books.add(new Book("Biology", 11, 470, "biology_11.jpg"));

        books.add(new Book("Physics", 12, 500, "physics_12.jpg"));
        books.add(new Book("Chemistry", 12, 520, "chemistry_12.jpg"));
        books.add(new Book("Biology", 12, 540, "biology_12.jpg"));

        books.add(new Book("UPSE 35", 12, 2900, "upse_35.jpg"));
        books.add(new Book("UPSE 40", 12, 3200, "upse_40.jpg"));

        return books;
    }
}
