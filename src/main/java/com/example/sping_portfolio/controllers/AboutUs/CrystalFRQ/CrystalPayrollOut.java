package com.example.sping_portfolio.controllers.AboutUs.CrystalFRQ;

public class CrystalPayrollOut {
    public static void main(String[] args) {
        CrystalPayroll crystalpayroll = new CrystalPayroll();

        System.out.println("Bonus threshold items are : " + crystalpayroll.computeBonusThreshold());

        crystalpayroll.computeWages(10.0, 1.5);
        crystalpayroll.printWages();
    }
}
