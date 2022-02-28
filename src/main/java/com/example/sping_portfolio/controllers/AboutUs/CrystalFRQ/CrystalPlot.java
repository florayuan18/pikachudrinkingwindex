package com.example.sping_portfolio.controllers.AboutUs.CrystalFRQ;

public class CrystalPlot {
        private String cropType;
        private int cropYield;

        public CrystalPlot(String crop, int yield)
        {
            this.cropType = crop;
            this.cropYield = yield;
        }

        public String getCropType()
        {
            return cropType;
        }

        public int getCropYield()
        {
            return cropYield;
        }

        public String toString() {
            return this.cropType+", "+this.getCropYield();
        }

    }


