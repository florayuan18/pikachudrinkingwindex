/*
Maggie Killada
AP CSA FRQ #8
 */

package com.example.sping_portfolio.controllers.AboutUs.MaggieFRQ;

public class MaggiePlot {
        private String cropType;
        private int cropYield;

        public MaggiePlot(String crop, int yield) {
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


