package com.example.sping_portfolio.controllers.CrystalFRQ.FRQ_9;

public class CrystalPictureBook extends CrystalBook {

    private String illustrator;

    public CrystalPictureBook(String title, String author, String illustrator) {
        super(title, author);
        this.illustrator = illustrator;
    }

    public void printBookInfo(){
        System.out.println(super.getTitle() + ", written by " + super.getAuthor() + " and illustrated by " + illustrator);
    }

}