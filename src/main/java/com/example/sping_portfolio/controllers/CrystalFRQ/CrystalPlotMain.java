package com.example.sping_portfolio.controllers.CrystalFRQ;

public class CrystalPlotMain {
    public static void main(String[] args)

    {
        Plot p1 = new Plot("corn",20);
        Plot p2 = new Plot("corn",30);
        Plot p3 = new Plot("peas",10);
        Plot p4 = new Plot("peas",30);
        Plot p5 = new Plot("corn",40);
        Plot p6 = new Plot("corn",62);
        Plot p7 = new Plot("wheat",10);
        Plot p8 = new Plot("corn",50);
        Plot p9 = new Plot("rice",30);
        Plot p10 = new Plot("corn",55);
        Plot p11 = new Plot("corn",30);
        Plot p12 = new Plot("peas",30);
        Plot[][] plots = {{p1,p2,p3},
                {p4,p5,p6},
                {p7,p8,p9},
                {p10,p11,p12}};

        ExperimentalFarm f = new ExperimentalFarm(plots);
        Plot highestYield = f.getHighestYield("corn");
        Plot highestYield1 = f.getHighestYield("peas");
        Plot highestYield2 = f.getHighestYield("bananas");

        try {
            System.out.println(highestYield.toString());
            System.out.println(highestYield1.toString());
            System.out.println(highestYield2.toString());
        }

        catch(Exception e)

        {

            System.out.println("null");

        }

        System.out.println("The method call f.sameCrop(0)");

        System.out.println(f.sameCrop(0));

        System.out.println("The method call f.sameCrop(1)");

        System.out.println(f.sameCrop(1));

    }

}
