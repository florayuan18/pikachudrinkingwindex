package com.example.sping_portfolio.controllers.FloraFRQ;

public class FloraDinner {
    private Boolean rsvp;
    private int selection;
    private String option1;
    private String option = "";
}

public FloraDinner() {
}

public FloraDinner(Boolean rsvp, int selection) {
    this.rsvp = rsvp;
    this.selection = selection;
}

public String displayOption () {
    return option1;
}

public String displayOption2 () {
    return option2;
}