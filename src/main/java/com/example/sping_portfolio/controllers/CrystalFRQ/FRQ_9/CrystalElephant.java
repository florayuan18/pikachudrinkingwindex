package com.example.sping_portfolio.controllers.CrystalFRQ.FRQ_9;

public class CrystalElephant extends CrystalHerbivore{
    private double tusk;
  
    public CrystalElephant(String n, double t){
      super("elephant", n);
      tusk = t;
    }
  
    public String toString(){
      String thestring = super.toString() + " with tusks " + tusk + " meters long";
  
      return thestring;
    }
  }
