package com.company;

import jdk.swing.interop.SwingInterOpUtils;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int n;
        System.out.println("Въведете какви книги ще добавите.");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        sc.close();
        Bookstore s=new Bookstore();
        List<Book> l=s.getBooks();
        for(int i=0;i<n;i++)
        {

        }


    }
}
