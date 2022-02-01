package com.example.sping_portfolio.controllers.CalvinAboutMVC.CalvinFRQ.FRQ_8;


import java.util.ArrayList;

public class ExperimentalFarm{

    private Plot[][] farmPlots;


    public void ExperimentalFarm(Plot[][] p){
        farmPlots = p;

    }



    /** Returns the plot with the highest yield for a given crop type, as described in part (a). */

    public void getHighestYield(String c){
        int highest_yield = 0;
        ArrayList<String> GHY_plots = new ArrayList<String>();
        for (int i = 0; i < farmPlots.length; i++) {
            for (int j = 0; j < farmPlots[i].length; j++) {
                if (farmPlots[i][j].getCropType().equals(c) && farmPlots[i][j].getCropYield() >= highest_yield) {
                    if (farmPlots[i][j].getCropYield() > highest_yield){
                        for (int ii = 0; ii < GHY_plots.size(); ii++){
//                            System.out.println(GHY_plots);
                            GHY_plots.remove(0);

                        }

                    }
                    highest_yield = farmPlots[i][j].getCropYield();
                    GHY_plots.add(c + " at " + "farmPlots[" + i + "]" + "[" + j + "]" + " --- yield " + highest_yield);
                }
            }
        }
        if ((GHY_plots.isEmpty())){
            System.out.println("null");
        }
        else{
            System.out.println(GHY_plots);
        }


    }


    public void sameCrop(int col){
        String pastType = farmPlots[0][col].getCropType();
        Boolean breakk = false;
        for (int i = 0; i < farmPlots[i].length; i++){
            if (!(farmPlots[i][col].getCropType().equals(pastType))){
                System.out.println("All of the crops are not the same");
                breakk = true;
                break;
            }
            pastType = farmPlots[i][col].getCropType();
        }
        if (breakk == false){
            System.out.println("All of the crops are the same");
        }

    }

    public static void main(String[] args) {

        Plot a1 = new Plot("corn", 20);
        Plot a2 = new Plot("corn", 30);
        Plot a3 = new Plot("peas", 10);

        Plot b1 = new Plot("peas", 30);
        Plot b2 = new Plot("corn", 40);
        Plot b3 = new Plot("corn", 62);

        Plot c1 = new Plot("wheat", 10);
        Plot c2 = new Plot("corn", 50);
        Plot c3 = new Plot("rice", 30);

        Plot d1 = new Plot("corn", 55);
        Plot d2 = new Plot("corn", 30);
        Plot d3 = new Plot("peas", 30);

        Plot[][] plot = {
                {a1,a2,a3},
                {b1,b2,b3},
                {c1,c2,c3},
                {d1,d2,d3}};
        ExperimentalFarm f = new ExperimentalFarm();
        f.ExperimentalFarm(plot);
        f.getHighestYield("corn");
        f.getHighestYield("peas");
        f.getHighestYield("bannan");
        f.sameCrop(0);



    }
}
