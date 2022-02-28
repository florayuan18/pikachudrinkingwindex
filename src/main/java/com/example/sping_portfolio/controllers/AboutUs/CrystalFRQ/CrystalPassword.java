package com.example.sping_portfolio.controllers.AboutUs.CrystalFRQ;

import java.util.Random;

public class CrystalPassword {
    private static int passwordsGenerated = 0;
    private static Random random = new Random();
    private String prefix;
    private int length;

    //overloaded constructor
    public CrystalPassword(int length,String prefix) {
        this.prefix = prefix;
        this.length = length;
    }

    //overloaded constructor
    public CrystalPassword(int length) {
        this.prefix = "A";
        this.length = length;
    }

    //password generating method
    public String pwGen(){
        String pwd= this.prefix+".";
        for(int i=1;i<=this.length;i++){
            pwd+=random.nextInt(10);
        }
        passwordsGenerated+=1;
        return pwd;
    }
    //password counting method
    public int pwCount(){
        return passwordsGenerated;

    }
}
