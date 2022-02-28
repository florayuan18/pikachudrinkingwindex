package com.example.sping_portfolio.controllers.AboutUs.CrystalFRQ.FRQ_9;

public class CrystalAnimal {
    private String food;
    private String species;
    private String name;
  
    public CrystalAnimal(String f, String s, String n){
      food = f;
      species = s;
      name = n;
    }
  
    public String toString(){
      String thestring = name + " the " + species + " is a " + food;
      return thestring;
    }
}
