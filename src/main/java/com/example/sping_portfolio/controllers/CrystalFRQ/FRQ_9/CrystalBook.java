package com.example.sping_portfolio.controllers.CrystalFRQ.FRQ_9;

public class CrystalBook {
  private String title;
  private String author;

  public CrystalBook(String t, String a) {
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
