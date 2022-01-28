package com.example.sping_portfolio.controllers.FloraFRQ;
import com.example.sping_portfolio.controllers.FloraFRQ.FloraUserName;

import java.util.ArrayList;

public class FloraUserName
{
    private ArrayList<String> possibleNames;

    public FloraUserName(String firstName, String lastName)
    {
        ArrayList<String> possibleNames = new ArrayList<String>();
        for (int i = 0; i < firstName.length(); i++)
        {
            possibleNames.add(lastName + firstName.substring(0, i+1));
        }

        for (int n = 0; n < possibleNames.size(); n++)
        {
            System.out.println();
            System.out.printf("n=%d , name = %.2f\n",n, );
        }
    }



    /** Returns true if arr contains name, and false otherwise. */

    public boolean isUsed(String name, String[] arr)

    { /* implementation not shown */ }



    /** Removes strings from possibleNames that are found in usedNames as described in part (b).

     */

    public void setAvailableUserNames(String[] usedNames)

    { /* to be implemented in part (b) */ }
}
