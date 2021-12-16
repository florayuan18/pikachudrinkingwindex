package com.example.sping_portfolio.controllers.CalvinFRQ.FRQ_3;

public class FRQ3_P1 {


    private Boolean rsvp;
    private String selection;
    private String option1 = "";
    private String option2 = "";
    private String tempFoodnumber;

    public void didUrsvp(boolean rsvp, int selection)
    {
        if (rsvp == true)
        {
            System.out.println("attending");
            foods(selection);
            System.out.println("Thanks for attending. You will be served " + this.selection +".");
        }
        else
        {
            System.out.println("Not attending");
            System.out.println("Sorry you can't make it.");
        }
    }
    public void foods(int selection)
    {
        if (selection == 1)
        {
            System.out.println("Beef");
            this.selection = "Beef";
            tempFoodnumber = "1";
        }
        else if (selection == 2)
        {
            System.out.println("Chicken");
            this.selection = "Chicken";
            tempFoodnumber = "2";
        }
        else if (selection == 3)
        {
            System.out.println("pasta");
            this.selection = "pasta";
            tempFoodnumber = "3";
        }
        if (option1 == "")
        {
            option1 = rsvp + tempFoodnumber;
        }
        else
        {
            option2 = rsvp + tempFoodnumber;
        }

    }
    public void foodsCheck()
    {
        if (option1.equals(option2))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
    public static void main(String [] args)
    {
        FRQ3_P1 John = new FRQ3_P1();
        John.didUrsvp(true, 1);
        John.didUrsvp(true, 1);
        John.foodsCheck();

    }
}
