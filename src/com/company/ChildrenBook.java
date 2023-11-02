package com.company;

public class ChildrenBook extends Book{
    int age;
    public double getPrice(){
        double orgprice=super.getPrice();

        System.out.println(getTitle() + "is on sale 70%");
        return orgprice*0.3;
    }
}
