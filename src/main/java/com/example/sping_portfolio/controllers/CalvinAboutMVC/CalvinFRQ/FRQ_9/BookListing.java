package com.example.sping_portfolio.controllers.CalvinAboutMVC.CalvinFRQ.FRQ_9;

public class BookListing extends Book{

    private Double price;

    public BookListing(Book book, Double price) {
        super(book.getTitle(), book.getAuthor());
        this.price = price;
    }

    public void printDescription(){
        System.out.println(super.getTitle() + ", written by " + super.getAuthor() + " , " + price);
    }
}
