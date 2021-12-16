package com.example.sping_portfolio.controllers;


public class UnitThreeFRQ {

//    public static void drawSquare(int x, int y, int len) {
//        if(x+len>10)
//            len = 10-x;
//        if(y+len>10)
//            len = 10-y;
//        System.out.println("side length = " + len + ", area = " + len*len);
//        drawLine(x, y, x+len, y);
//        drawLine(x+len,y,x+len,y-len);
//        drawLine(x+len, y-len, x, y-len);
//        drawLine(x, y-len, x, y);
//    }

    public static void main(String [] args)
    {
        boolean rsvp = true;
        int selection = 1;
        String option1 = "";
        String option2 = "";

        if(rsvp){
            System.out.println("Attending");
        }
        else{
            System.out.println("Not attending");
        }

        if(selection ==1){
            System.out.println("beef");
        }
        else if (selection ==2){
            System.out.println("chicken");
        }
        else if(selection ==3){
            System.out.println("pasta");
        }
        else{
            System.out.println("fish");
        }

        if(rsvp && selection ==1){
            option1 = "Thanks for attending.You will be served beef.";
        }
        if(rsvp && selection ==2){
            option1 = "Thanks for attending.You will be served chicken.";
        }
        if(rsvp && selection ==1){
            option1 = "Thanks for attending.You will be served pasta.";
        }
        else if(rsvp){
            option1 = "Thanks for attending.You will be served fish.";
        }
        else{
            option1 = "Sorry you couldn't make it";
        }

        if (option1.equals(option2)) {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }

}
