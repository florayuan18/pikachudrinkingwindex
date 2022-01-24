package com.example.sping_portfolio.controllers.CrystalFRQ;

public class CrystalPayrollOut {
    public static void crystalpayroll(String[] args) {
        CrystalPayroll crystalpayroll = new CrystalPayroll();

        System.out.println("Bonus threshold items are : " + crystalpayroll.computeBonusThreshold());

        crystalpayroll.computeWages(10.0, 1.5);
        crystalpayroll.printWages();
    }
}
