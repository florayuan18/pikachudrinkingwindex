package com.example.sping_portfolio.controllers.CrystalFRQ;

public class CrystalDinner {
    private Boolean rsvp;
    private int selection;
    private String option1;
    private String option2 = "";

    //default constructor
    public CrystalDinner(){
    }

    //overloaded constructor
    public CrystalDinner(Boolean rsvp, int selection){
        this.rsvp = rsvp;
        this.selection = selection;
    }

    public String displayOption1(){
        return option1;
    }

    public String displayOption2(){
        return option2;
    }

    public String attendance(){
        if (rsvp == true) {
            return "Attending";
        }
        else {
            return  "Not attending";
        }
    }

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
