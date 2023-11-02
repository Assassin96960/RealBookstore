package com.company;

import java.util.List;

public class Bookstore {
    List<Book> books;
    void sell(Book b)
    {
        int a=b.getAvailables();
        a--;
        b.setAvailables(a);
    }

}
