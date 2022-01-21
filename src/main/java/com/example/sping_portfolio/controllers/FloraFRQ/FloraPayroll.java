package com.example.sping_portfolio.controllers.FloraFRQ;

import com.example.sping_portfolio.controllers.MaggieFRQ.MaggiePayroll;

public class FloraPayroll {
    private int[] itemsSold;
    private double[] wages;

    public FloraPayroll(){
        itemsSold = new int[] {48,50,37,62,38,70,55,37,64,60};
        wages = new double[10];
    }

    public double computeBonusThreshold()
    {
        int highestt = itemsSold[0];
        int lowest = itemsSold[0];
        int sumOfItemsSold = itemsSold[0];

        double bonusThreshold =0;

        for (int i = 1; i < itemsSold.length ; i++)
        {
            sumOfItemsSold += itemsSold[i];

            if(itemsSold[i] > highest)
                highest = itemsSold[i];

            if(itemsSold[i] < lowest )
                lowest = itemsSold[i];
        }
        bonusThreshold = (sumOfItemsSold - lowest - highest ) / (itemsSold.length -2.0);

        return bonusThreshold;
    }
    public void computeWages(double fixedWage, double perItemWage)
    {
        int bonusThresholdForWages = computeBonusThreshold();
        for (int i = 0; i < wages.length ; i++)
        {
            wages[i] = fixedWage + ( itemsSold[i] * perItemWage);

            if(itemsSold[i] > bonusThresholdForWages)
            {
                wages[i] = wages[i] * 1.1 ;
            }
        }
    }
    public void printWages()
    {
        for (int i = 0; i < wages.length ; i++);
        {
            System.out.printf("Employee =%d , ItemsSold = %d, Wage = %.2f\n",i,itemsSold[i], wages[i])
        }
    }

    public static void main(String[] args) {
        FloraPayroll florapayroll = new FloraPayroll();
        System.out.println("Bonus threshold items are : " + florapayroll.computeBonusThreshold());
        florapayroll.computeWages(10.0, 1.5);
        florapayroll.printWages();
    }
}


