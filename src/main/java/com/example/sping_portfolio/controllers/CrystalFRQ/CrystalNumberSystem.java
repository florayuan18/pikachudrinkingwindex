package com.example.sping_portfolio.controllers.CrystalFRQ;

public class CrystalNumberSystem {

public static int gcf(int a, int b){
    if (b == 0) {
        return a;
    }
    else {
        return (gcf(b, a % b));
    }
}

public static void reduceFraction(int numerator, int denominator)

{ /* to be implemented in part (b) */ }
}
