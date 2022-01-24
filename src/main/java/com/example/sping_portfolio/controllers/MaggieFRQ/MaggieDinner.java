/*
Maggie Killada
AP CSA FRQ #3
 */

package com.example.sping_portfolio.controllers.MaggieFRQ;

public class MaggieDinner{
    //initializing private instance variables
    private Boolean rsvp;
    private int selection;
    private String option1;
    private String option2 = "";

    //default constructor
    public MaggieDinner(){
    }

    //overloaded constructor
    public MaggieDinner(Boolean rsvp, int selection){
        this.rsvp = rsvp;
        this.selection = selection;
    }

    //display method for option 1
    public String displayOption1(){
        return option1;
    }
    //display method for option 2
    public String displayOption2(){
        return option2;
    }

    //method that verifies attendance using if statement
    public String attendance(){
        if (rsvp == true) {
            return "Attending";
        }
        else {
            return  "Not attending";
        }
    }

    //method for selecting food using the switch method
    public String food() {
        switch (selection) {
            case 1:
                return "beef";
            case 2:
                return "chicken";
            case 3:
                return "pasta";
            default:
                return "fish";
        }
    }

    //void method so does not return anything, instead updates the variable option1
    public void message1(){
        if (rsvp == true){
            option1 = "Thanks for attending. You will be served " + food() + ".";
        }
        else {
            option1 = "Sorry you can't make it.";
        }
    }

    public Boolean message2(){
        if (option1 == option2){
            return true;
        }
        else {
            return false;
        }
    }

}
