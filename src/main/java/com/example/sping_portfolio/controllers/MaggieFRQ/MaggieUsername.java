/*
Maggie Killada
AP CSA FRQ #7
 */

package com.example.sping_portfolio.controllers.MaggieFRQ;
import java.util.ArrayList;

public class MaggieUsername{
    //arraylist of possible usernames, based on a user’s first and last names
    private ArrayList<String> possibleNames;

    //default constructor
    public MaggieUsername(){
    }

    //2-parameter constructor
    public MaggieUsername(String firstName, String lastName){
        possibleNames = new ArrayList<String>();
        for (int i = 0; i < firstName.length(); i++){
            possibleNames.add(lastName + firstName.substring(0, i + 1));
            //example of values in possibleNames: "smithj", "smithjo", "smithjoh", "smithjohn"
        }
    }

    /** Returns true if arr contains name, and false otherwise.
    public boolean isUsed(String name, String[] arr){
        /* implementation not shown
        return ...;
    }
    */

    /** Removes strings from possibleNames that are found in usedNames as described in part (b).*/
    public void setAvailableUsernames(String[] usedNames)
    { /* to be implemented in part (b) */ }

}
