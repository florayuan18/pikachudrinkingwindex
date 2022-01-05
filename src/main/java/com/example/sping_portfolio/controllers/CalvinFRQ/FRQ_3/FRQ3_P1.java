package com.example.sping_portfolio.controllers.CalvinFRQ.FRQ_3;

public class FRQ3_P1 {


    private Boolean rsvp;
    private String selection;
    private String option1 = "";
    private String option2 = "";
    private String tempFoodnumber;
    private String retStuff;
    private String retStuff2;

    public String didUrsvp(boolean rsvp, int selection)
    {
        if (rsvp == true)
        {
//            System.out.println("attending");
            foods(selection);
//            System.out.println("Thanks for attending. You will be served " + this.selection +".");
            retStuff = "Thanks for attending. You will be served " + this.selection +".";
        }
        else
        {
//            System.out.println("Not attending");
//            System.out.println("Sorry you can't make it.");
            retStuff = "Not attending, Sorry you can't make it.";

        }
        return retStuff;
    }
    public String foods(int selection)
    {
        if (selection == 1)
        {
//            System.out.println("Beef");
            this.selection = "Beef";
            tempFoodnumber = "1";
        }
        else if (selection == 2)
        {
//            System.out.println("Chicken");
            this.selection = "Chicken";
            tempFoodnumber = "2";
        }
        else if (selection == 3)
        {
//            System.out.println("pasta");
            this.selection = "pasta";
            tempFoodnumber = "3";
        }
        if (option1 == "")
        {
            option1 = rsvp + tempFoodnumber;
            retStuff = option1;
            return retStuff;
        }
        else
        {
            option2 = rsvp + tempFoodnumber;
            retStuff = option2;
            return retStuff;
        }


    }
    public String foodsCheck()
    {
        if (option1.equals(option2))
        {
//            System.out.println("true");
            retStuff = "true";
            return retStuff;
        }
        else
        {
//            System.out.println("false");
            retStuff = "false";
            return retStuff;
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
