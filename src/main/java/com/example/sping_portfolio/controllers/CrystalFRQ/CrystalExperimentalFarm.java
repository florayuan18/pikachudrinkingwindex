package com.example.sping_portfolio.controllers.CrystalFRQ;

public class CrystalExperimentalFarm {
        private CrystalPlot[][] farmPlots;

        public CrystalExperimentalFarm(CrystalPlot[][] p)
        {
            this.farmPlots = p;
        }

        public CrystalPlot getHighestYield(String c)
        {
            CrystalPlot plot = null;
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


        public boolean sameCrop(int col)
        {
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

