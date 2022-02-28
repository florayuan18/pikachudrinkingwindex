package com.example.sping_portfolio.controllers.AboutUs.CalvinAboutMVC.CalvinFRQ.FRQ_6;

public class Payroll {
    private int[] itemsSold = {0, 0, 0, 0, 0, 0, 0, 0, 0}; // number of items sold by each employee

    private double[] wages = {10, 10, 10, 10, 10, 10, 10, 10, 10}; // wages to be computed in part (b)



    /** Returns the bonus threshold as described in part (a).

     */

    public void computeBonusThreshold(){
        double total_wages = 0.0;
        int ii = 1;
        for(double number : wages) {
            total_wages += number;
        }
        //making total wages the average of the wages
        total_wages = total_wages / wages.length;
        for(int i = 0; i < wages.length; i++) {
            if (wages[i] > total_wages){
                wages[i] = wages[i] * 1.1;
                System.out.println("bonus for employee " + (i+1));

            }
        }
        for(double number : wages) {
            System.out.println("Employee " + ii + "'s pay: " + number);
            ii++;
        }
    }

    public void computeWages(double fixedWage, double perItemWage)

    {
        randomItemsSold();
        for(int i = 0; i < wages.length; i++) {
                wages[i] = fixedWage + (Double.valueOf(itemsSold[i]) * perItemWage);
        }
        computeBonusThreshold();
    }

    public void randomItemsSold(){
        for(int i = 0; i < itemsSold.length; i++) {
            itemsSold[i] = (int) (Math.random() * 49 + 1);
        }
    }


// Other instance variables, constructors, and methods not shown.


    public static void main(String [] args) {
        Payroll employee1 = new Payroll();
        employee1.computeWages(10, 1.5);




    }
}
