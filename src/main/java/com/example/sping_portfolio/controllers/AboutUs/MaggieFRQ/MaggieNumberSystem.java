/*
Maggie Killada
AP CSA FRQ #10
 */

package com.example.sping_portfolio.controllers.AboutUs.MaggieFRQ;

public class MaggieNumberSystem {

    public static int gcf(int a, int b){
        if (b == 0){
            return a;
        }
        else{
            return (gcf(b, a % b));
        }
    }


    public static String reduceFraction(int numerator, int denominator) {
       if(numerator % denominator == 0){
           return "" + numerator/denominator;
       }
       else{
           int gcfvalue = gcf(numerator, denominator);
           numerator = numerator/gcfvalue;
           denominator = denominator/gcfvalue;
           return numerator + "/" + denominator;
       }
    }
}
