package com.company;

public class Book {
    private String title;
    private Author author;
    private int availables;
    private double price;
    private BookType type;

    public int getAvailables() {
        return availables;
    }

    public Book() {
    }

    public Book(String title, Author author, int availables, double price, BookType type) {
        this.title = title;
        this.author = author;
        this.availables = availables;
        this.price = price;
        this.type = type;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setAvailables(int availables) {
        this.availables = availables;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setType(BookType type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }
    public double getPrice(double priceReduction) {
        return price*(1-priceReduction);
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public BookType getType() {
        return type;
    }
}
