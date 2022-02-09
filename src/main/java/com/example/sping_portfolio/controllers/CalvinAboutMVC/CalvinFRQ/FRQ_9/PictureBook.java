package com.example.sping_portfolio.controllers.CalvinAboutMVC.CalvinFRQ.FRQ_9;

public class PictureBook extends Book {

    private String illustrator;

    public PictureBook(String title, String author, String illustrator) {
        super(title, author);
        this.illustrator = illustrator;
    }

    public void printBookInfo(){
        System.out.println(super.getTitle() + ", written by " + super.getAuthor() + " and illustrated by " + illustrator);
    }

}
