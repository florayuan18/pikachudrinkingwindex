
package com.example.sping_portfolio.controllers.CrystalFRQ;

import java.util.ArrayList;


public class CrystalUser {

// The list of possible user names, based on a user’s first and last names and initialized by the constructor.
    private ArrayList<String> possibleNames;

    //2-parameter constructor
    public CrystalUser(String firstName, String lastName){
        possibleNames = new ArrayList<String>();
        for (int i = 0; i < firstName.length(); i++){
            possibleNames.add(lastName + firstName.substring(0, i + 1));
            //example of values in possibleNames: "smithj", "smithjo", "smithjoh", "smithjohn"
        }
    }

    //Returns true if arr contains name, and false otherwise.
    public Boolean isUsed(String name, String[] arr){
        for (int i=0; i < arr.length; i++){
            if(name.equals(arr[i]))
                return true;
        }
        return false;
    }

    //Removes strings from possibleNames that are found in usedNames
    public void setAvailableUserNames(String[] usedNames) {
        for (int i = possibleNames.size() - 1; i >= 0; i--) {
            if (isUsed(possibleNames.get(i), usedNames))
            {
                possibleNames.remove(i);
            }
        }
    }

    //display method
    public String displayPossibleUsernames(){
        String returnString = "";
        for (int i = possibleNames.size() - 1; i >= 0; i--){
            returnString += possibleNames.get(i) + " ";
        }
        return returnString;
    }

}
