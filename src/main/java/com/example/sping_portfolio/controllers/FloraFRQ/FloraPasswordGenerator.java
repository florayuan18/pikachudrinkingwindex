package com.example.sping_portfolio.controllers.FloraFRQ;
import java.util.Random;

public class FloraPasswordGenerator {
    private static double generatedPasswords=0;
    private static Random random = new Random();
    private String prefix;
    private double length

    public PasswordGenerator(String prefix, double length){
        this.prefix="A";
        this.length=length;
    }
    public String pwGen(){
        String pwd = this.prefix+".";
        for(int i=1, i<=this.length;i++){
            pwd+=random.nextInt(10);        }
        generatedPasswords+=1;
        return pwd;
    }
    public int pwCount() {
        return generatedPasswords;
    }
}
