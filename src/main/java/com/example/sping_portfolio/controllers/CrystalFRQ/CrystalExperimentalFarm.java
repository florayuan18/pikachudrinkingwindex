package com.example.sping_portfolio.controllers.CrystalFRQ;

 class CrystalExperimentalFarm {
        private CrystalPlot[][] farmPlots;

 public CrystalExperimentalFarm() {
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
     this.farmPlots = plots;
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

