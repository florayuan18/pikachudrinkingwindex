package com.example.sping_portfolio.controllers.AboutUs.CrystalFRQ.FRQ_9;

import java.util.ArrayList;

public class CrystalBook {
    private String title;
    private String author;
    private String illustrator;

    public CrystalBook(String title, String author){
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
        CrystalPictureBook myBook = new CrystalPictureBook("Peter and Wendy", "J.M. Barrie", "F.D. Bedford");
        myBook.printBookInfo();
        ArrayList<CrystalBook> myLibrary = new ArrayList<CrystalBook>();
        CrystalBook book1 = new CrystalBook("Frankenstein", "Mary Shelley");
        CrystalPictureBook book2 = new CrystalPictureBook("The Wonderful Wizard of Oz", "L. Frank Baum", "W.W. Denslow");
        myLibrary.add(book1);
        myLibrary.add(book2);
        CrystalBookListing listing1 = new CrystalBookListing(book1, 10.99);
        listing1.printDescription();
        CrystalBookListing listing2 = new CrystalBookListing(book2, 12.99);
        listing2.printDescription();
    }
}




