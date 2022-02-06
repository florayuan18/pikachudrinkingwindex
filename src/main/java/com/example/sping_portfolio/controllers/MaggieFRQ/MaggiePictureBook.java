/*
Maggie Killada
AP CSA FRQ #9
 */

package com.example.sping_portfolio.controllers.MaggieFRQ;

import java.util.ArrayList;

public class MaggiePictureBook extends MaggieBook {
    private String illustrator;

    public MaggiePictureBook(String title, String author, String i){
        super(title, author);
        this.illustrator = i;
    }

    public String printBookInfo(){
        return (super.printBookInfo() + " illustrated by " + illustrator);
    }

    /*
    public static void main(String[] args) {
        ArrayList<MaggieBook> myLibrary = new ArrayList<MaggieBook>();
        MaggieBook book1 = new MaggieBook("Frankenstein", "Mary Shelley");
        MaggiePictureBook book2 = new MaggiePictureBook("The Wonderful Wizard of Oz", "L. Frank Baum", "W.W. Denslow");
        myLibrary.add(book1);
        myLibrary.add(book2);
    }
     */
}