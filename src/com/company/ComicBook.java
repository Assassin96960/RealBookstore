package com.company;

public class ComicBook extends Book{
    String characterName;

    public ComicBook() {
    }

    public ComicBook(String title, Author author, int availables, double price, BookType type, String characterName) {
        super(title, author, availables, price, type);
        this.characterName = characterName;
    }
    public double getPrice(){
        double orgprice=super.getPrice();

        System.out.println(super.getTitle() + "is on sale 60%");
        return orgprice*0.4;
    }
}
