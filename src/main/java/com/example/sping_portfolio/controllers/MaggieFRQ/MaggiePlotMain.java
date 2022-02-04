
package com.example.sping_portfolio.controllers.MaggieFRQ;

public class MaggiePlotMain {
    public static void main(String[] args)

    {
        MaggiePlot p1 = new MaggiePlot("corn",20);
        MaggiePlot p2 = new MaggiePlot("corn",30);
        MaggiePlot p3 = new MaggiePlot("peas",10);
        MaggiePlot p4 = new MaggiePlot("peas",30);
        MaggiePlot p5 = new MaggiePlot("corn",40);
        MaggiePlot p6 = new MaggiePlot("corn",62);
        MaggiePlot p7 = new MaggiePlot("wheat",10);
        MaggiePlot p8 = new MaggiePlot("corn",50);
        MaggiePlot p9 = new MaggiePlot("rice",30);
        MaggiePlot p10 = new MaggiePlot("corn",55);
        MaggiePlot p11 = new MaggiePlot("corn",30);
        MaggiePlot p12 = new MaggiePlot("peas",30);
        MaggiePlot[][] plots = {{p1,p2,p3},
                {p4,p5,p6},
                {p7,p8,p9},
                {p10,p11,p12}};

        MaggieExperimentalFarm f = new MaggieExperimentalFarm(plots);
        MaggiePlot highestYield = f.getHighestYield("corn");
        MaggiePlot highestYield1 = f.getHighestYield("peas");
        MaggiePlot highestYield2 = f.getHighestYield("bananas");

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
