/*
Maggie Killada
AP CSA FRQ #8
 */

package com.example.sping_portfolio.controllers.MaggieFRQ;

import com.example.sping_portfolio.controllers.MaggieFRQ.MaggiePlot;

public class MaggieExperimentalFarm {
        private MaggiePlot[][] farmPlots;

        public MaggieExperimentalFarm() {
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
            this.farmPlots = plots;
        }

        public MaggiePlot getHighestYield(String c){
            MaggiePlot plot = null;
            int highest = this.farmPlots[0][0].getCropYield();
            for(int i=0;i<4;i++)
            {
                for(int j=0;j<3;j++)
                {
                    if(farmPlots[i][j].getCropType().equalsIgnoreCase(c) && farmPlots[i][j].getCropYield()>highest)
                    {
                        highest = farmPlots[i][j].getCropYield();
                        plot = farmPlots[i][j];
                    }
                }
            }
            if(plot != null)
                return plot;
            else
                return null;
        }

        public boolean sameCrop(int col) {
            boolean check = true;;
            String crop = farmPlots[0][col].getCropType();

            for(int i=0;i<4;i++)
            {
                if(!farmPlots[i][col].getCropType().equalsIgnoreCase(crop))
                {
                    check = false;
                    break;
                }
            }
            return check;
        }

    }

