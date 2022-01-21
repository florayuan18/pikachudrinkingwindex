package com.example.sping_portfolio.controllers.FloraFRQ;

public class FloraDinner {
    private Boolean rsvp;
    private int selection;
    private String option1;
    private String option2 = "";

public FloraDinner() {
}

public FloraDinner(Boolean rsvp, int selection) {
    this.rsvp = rsvp;
    this.selection = selection;
}

public String displayOption(){
    return option1;
}

public String displayOption2(){
    return option2;
}

public String attendance(){
    if(rsvp == true){
        return "attending";
    }
    else{
        return "not attending";
    }
}

public String food(){
    if(selection == 1){
        return "beef";
    }
    if(selection == 2){
        return "chicken";
    }
    if(selection == 3){
        return "pasta";
    }
    else{
        return "fish";
    }
}


public void message1() {
    if (!rsvp) {
        option1 = "Sorry you can't make it.";
    } else {
        option1 = "Thanks for attending. You will be served";
        if (selection == 1) {
            option1 += "beef.";
        } else if (selection == 2) {
            option1 += "chicken.";
        } else if (selection == 3) {
            option1 += "pasta.";
        } else {
            option1 += "fish.";
        }
    }
}
    public Boolean message2 () {
        if (option1.equals(option2)) {
            return "true";
        } else {
            return "false";
        }
    }
}