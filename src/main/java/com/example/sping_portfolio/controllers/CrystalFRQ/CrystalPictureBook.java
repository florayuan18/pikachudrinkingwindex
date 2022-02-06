package com.example.sping_portfolio.controllers.CrystalFRQ;

import com.example.sping_portfolio.controllers.CrystalFRQ.FRQ_9.CrystalBook;

public class CrystalPictureBook extends CrystalBook{
    private String illustrator;

    public CrystalPictureBook(String t, String a, String i){
      super(t, a);
      illustrator = i;
    }
  
    public void printBookInfo() {
      super.printCrystalBookInfo();
      System.out.print(" and illustrated by " + illustrator);
    }
}
