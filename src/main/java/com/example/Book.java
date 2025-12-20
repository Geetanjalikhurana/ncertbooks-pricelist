package com.example.model;

public class Book {

    private String subject;
    private int bookClass;
    private int price;
    private String image;

    public Book(String subject, int bookClass, int price, String image) {
        this.subject = subject;
        this.bookClass = bookClass;
        this.price = price;
        this.image = image;
    }

    public String getSubject() {
        return subject;
    }

    public int getBookClass() {
        return bookClass;
    }

    public int getPrice() {
        return price;
    }

    public String getImage() {
        return image;
    }
}
