package com.example.sping_portfolio.controllers.CrystalFRQ.FRQ_9;

public class CrystalPictureBook extends CrystalBook{
    private String illustrator;

    public CrystalPictureBook(String title, String author, String i){
        super(title, author);
        this.illustrator = i;
    }

    public String printBookInfo(){
        return (super.printBookInfo() + " illustrated by " + illustrator);
    }
}
