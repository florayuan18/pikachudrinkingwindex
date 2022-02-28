/*
Maggie Killada
AP CSA FRQ #9
 */

package com.example.sping_portfolio.controllers.AboutUs.MaggieFRQ;

public class MaggieBook {
    private String title;
    private String author;

    public MaggieBook(String t, String a) {
        title = t;
        author = a;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor(){
        return author;
    }

    public String printBookInfo(){
        return (title + ", written by " + author);
    }
}
