package com.example.sping_portfolio.controllers.CrystalFRQ.FRQ_9;

import java.util.ArrayList;

import com.example.sping_portfolio.controllers.CrystalFRQ.CrystalPictureBook;

public class CrystalBookRun {
    public static void main(String[] args) {
    
        CrystalPictureBook myBook = new CrystalPictureBook("Peter and Wendy", "J.M. Barrie", "F.D. Bedford");
    
        myBook.printBookInfo();
        System.out.println();
    
    
        ArrayList<CrystalBook> myLibrary = new ArrayList<CrystalBook>();
    
        CrystalBook book1 = new CrystalBook("Frankenstein", "Mary Shelley");
        CrystalPictureBook book2 = new CrystalPictureBook("The Wonderful Wizard of Oz", "L. Frank Baum", "W.W. Denslow");
    
        myLibrary.add(book1);
        myLibrary.add(book2);
    
        CrystalBookListing listing1 = new CrystalBookListing(book1, 10.99);listing1.printDescription();
        System.out.println();
    
        CrystalBookListing listing2 = new CrystalBookListing(book2, 12.99);listing2.printDescription();
        System.out.println();
    
        System.out.println("Unit 9 FRQ part 2");
        CrystalAnimal lisa = new CrystalAnimal("carnivore", "lion", "Lisa");
        System.out.println(lisa.toString());
    
        CrystalHerbivore gary = new CrystalHerbivore("giraffe", "Gary");
        System.out.println(gary.toString());
    
        CrystalElephant percy = new CrystalElephant("Percy", 2.0);
        System.out.println(percy.toString());
    
    
      }
}
