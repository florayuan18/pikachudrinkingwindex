package com.example.sping_portfolio.controllers.CrystalFRQ;

public class CrystalPlotMain {
    public static void main(String[] args)

    {
        CrystalPlot p1 = new CrystalPlot("corn",20);
        CrystalPlot p2 = new CrystalPlot("corn",30);
        CrystalPlot p3 = new CrystalPlot("peas",10);
        CrystalPlot p4 = new CrystalPlot("peas",30);
        CrystalPlot p5 = new CrystalPlot("corn",40);
        CrystalPlot p6 = new CrystalPlot("corn",62);
        CrystalPlot p7 = new CrystalPlot("wheat",10);
        CrystalPlot p8 = new CrystalPlot("corn",50);
        CrystalPlot p9 = new CrystalPlot("rice",30);
        CrystalPlot p10 = new CrystalPlot("corn",55);
        CrystalPlot p11 = new CrystalPlot("corn",30);
        CrystalPlot p12 = new CrystalPlot("peas",30);
        CrystalPlot[][] plots = {{p1,p2,p3},
                {p4,p5,p6},
                {p7,p8,p9},
                {p10,p11,p12}};

        CrystalExperimentalFarm f = new CrystalExperimentalFarm(plots);
        CrystalPlot highestYield = f.getHighestYield("corn");
        CrystalPlot highestYield1 = f.getHighestYield("peas");
        CrystalPlot highestYield2 = f.getHighestYield("bananas");

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
