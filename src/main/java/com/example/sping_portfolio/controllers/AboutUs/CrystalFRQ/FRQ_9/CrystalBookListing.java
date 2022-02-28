package com.example.sping_portfolio.controllers.AboutUs.CrystalFRQ.FRQ_9;

public class CrystalBookListing {
    private double cost;
    private CrystalBook book;
  
    public CrystalBookListing(CrystalBook b, double c){
      cost = c;
      book = b;
    }
  
    public void printDescription(){
      book.printBookInfo();
      System.out.print(", $" + cost);
    }
}
