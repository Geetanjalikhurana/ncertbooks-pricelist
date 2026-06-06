package com.example.service;

import com.example.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    public List<Book> getBooks() {

        List<Book> books = new ArrayList<>();

        books.add(new Book("Mathematics", 1, 120, "maths.jpg"));
        books.add(new Book("English", 1, 100, "english.jpg"));
        books.add(new Book("EVS", 1, 90, "evs.jpg"));

        books.add(new Book("Mathematics", 2, 140, "maths_2.jpg"));
        books.add(new Book("English", 2, 120, "english_2.jpg"));
        books.add(new Book("EVS", 2, 100, "evs_2.jpg"));

        books.add(new Book("Mathematics", 3, 180, "maths_3.jpg"));
        books.add(new Book("Science", 3, 200, "science_3.jpg"));
        books.add(new Book("English", 3, 150, "english_3.jpg"));

        books.add(new Book("Mathematics", 4, 210, "maths_4.jpg"));
        books.add(new Book("Science", 4, 230, "science_4.jpg"));
        books.add(new Book("Social Science", 4, 220, "sst_4.jpg"));

        books.add(new Book("Mathematics", 5, 250, "maths_5.jpg"));
        books.add(new Book("Science", 5, 260, "science_5.jpg"));
        books.add(new Book("English", 5, 200, "english_5.jpg"));

        books.add(new Book("Mathematics", 6, 300, "maths_6.jpg"));
        books.add(new Book("Science", 6, 320, "science_6.jpg"));
        books.add(new Book("History", 6, 280, "history_6.jpg"));

        books.add(new Book("Mathematics", 7, 350, "maths_7.jpg"));
        books.add(new Book("Science", 7, 370, "science_7.jpg"));
        books.add(new Book("History", 7, 330, "history_7.jpg"));

        books.add(new Book("Mathematics", 8, 400, "maths_8.jpg"));
        books.add(new Book("Science", 8, 420, "science_8.jpg"));
        books.add(new Book("History", 8, 380, "history_8.jpg"));
        books.add(new Book("Geography", 8, 390, "geography_8.jpg"));

        books.add(new Book("Physics", 11, 450, "physics_11.jpg"));
        books.add(new Book("Chemistry", 11, 460, "chemistry_11.jpg"));
        books.add(new Book("Biology", 11, 470, "biology_11.jpg"));

        books.add(new Book("Physics", 12, 500, "physics_12.jpg"));
        books.add(new Book("Chemistry", 12, 520, "chemistry_12.jpg"));
        books.add(new Book("Biology", 12, 540, "biology_12.jpg"));

        books.add(new Book("UPSE 40", 12, 3200, "upse_40.jpg"));
        books.add(new Book("UPSE 35", 12, 2900, "upse_35.jpg"));

        return books;
    }
}
