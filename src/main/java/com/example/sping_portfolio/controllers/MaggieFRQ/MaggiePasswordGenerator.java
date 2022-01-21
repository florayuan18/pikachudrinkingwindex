/*
Maggie Killada
AP CSA FRQ #5
 */

package com.example.sping_portfolio.controllers.MaggieFRQ;
import java.util.Random;

public class MaggiePasswordGenerator {
    //private instance variable setup
    private static int passwordsGenerated = 0;
    private static Random random = new Random();
    private String prefix;
    private int length;

    //overloaded constructor
    public MaggiePasswordGenerator(int length,String prefix) {
        this.prefix = prefix;
        this.length = length;
    }

    //overloaded constructor
    public MaggiePasswordGenerator(int length) {
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

        /*
        //main method
        public static void main(String[] args) {
            MaggiePasswordGenerator pw1 = new MaggiePasswordGenerator(4,"chs");
            System.out.println(pw1.pwCount());
            System.out.println(pw1.pwGen());
            System.out.println(pw1.pwGen());
            System.out.println(pw1.pwCount());
            MaggiePasswordGenerator pw2 = new MaggiePasswordGenerator(6);
            System.out.println(pw2.pwCount());
            System.out.println(pw2.pwGen());
            System.out.println(pw2.pwCount());
            System.out.println(pw1.pwCount());
        }
        */
    }