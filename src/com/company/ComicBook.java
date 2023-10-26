package com.company;

public class ComicBook extends Book{
    String characterName;

    public ComicBook() {
    }

    public ComicBook(String title, Author author, int availables, double price, BookType type, String characterName) {
        super(title, author, availables, price, type);
        this.characterName = characterName;
    }

}
