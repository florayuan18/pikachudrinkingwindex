package com.example.sping_portfolio.controllers.CrystalFRQ;

public class CrystalNumberSystem{

    public static int gcf(int a, int b){

      int gcf = 0;
      int large;
      int small;

      if (a < b){
        large = b;
        small = a;
      }
      else {
        large = a;
        small = b;
      }

      if (large % small == 0) {
        gcf = b;
        return gcf;
        
      }
      else {
        while (large % small != 0) {
          gcf = large % small;
          large = small;
          small = gcf;
        }
        return gcf;

      }

    }

  public static void reduceFraction(int numerator, int denominator){
    int gcf = 0;
    gcf = gcf(numerator, denominator);
    numerator = numerator / gcf;
    denominator = denominator / gcf;
    if (denominator == 1){
      System.out.println(numerator);
    }
    else{
      System.out.println(numerator + "/" + denominator);
    }
    
  }

  public static void main(String [] args) {

    CrystalNumberSystem test = new CrystalNumberSystem();
    test.reduceFraction(24, 9);
    test.reduceFraction(30, 3);
    test.reduceFraction(7, 3);

  }
}

