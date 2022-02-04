package com.example.sping_portfolio.controllers.CalvinAboutMVC.CalvinFRQ.FRQ_9;


import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private String illustrator;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public void printBookInfo(){
        System.out.println(title + ", written by " + author);
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public static void main(String[] args){
        PictureBook myBook = new PictureBook("Peter and Wendy", "J.M. Barrie", "F.D. Bedford");
        myBook.printBookInfo();
        ArrayList<Book> myLibrary = new ArrayList<Book>();
        Book book1 = new Book("Frankenstein", "Mary Shelley");
        PictureBook book2 = new PictureBook("The Wonderful Wizard of Oz", "L. Frank Baum", "W.W. Denslow");
        myLibrary.add(book1);
        myLibrary.add(book2);
        BookListing listing1 = new BookListing(book1, 10.99);
        listing1.printDescription();
        BookListing listing2 = new BookListing(book2, 12.99);
        listing2.printDescription();
    }
}





