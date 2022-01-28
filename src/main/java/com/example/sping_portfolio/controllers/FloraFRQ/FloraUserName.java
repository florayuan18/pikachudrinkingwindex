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
            System.out.printf("n=%d, name = %s\n",n, possibleNames.get(n));
        }
    }


    /** Returns true if arr contains name, and false otherwise. */
    public boolean isUsed(String name, String[] usedNames)
    {
        boolean isContainName = false;
        for (int i = 0; i < usedNames.length; i++)
        {
            if (usedNames[i].equals(name))
            {
                isContainName = true;
                return isContainName;
            }
            else
            {
                isContainName = false;
            }
        }
        return isContainName;
    }


    /** Removes strings from possibleNames that are found in usedNames as described in part (b).

     */

    public void setAvailableUserNames(String[] usedNames)
    {
        System.out.printf("+++ size=%d",possibleNames.size());
        for (int i = (possibleNames.size() - 1); i >= 0; i--)
        {

            String pn = possibleNames.get(i);

            if (isUsed(pn, usedNames))
            {
                possibleNames.remove(i);
            }
        }
    }

    public void printTest()
    {
        System.out.printf("=========================\n");
        for (int n = 0; n < possibleNames.size(); n++)
        {
            System.out.printf("n=%d, name = %s\n",n, possibleNames.get(n));
        }
    }

    public static void main(String[] args) {
        FloraUserName florausername = new FloraUserName("John", "Smith");
        String[] usedNames = {"harta", "hartm", "harty"};
        florausername.setAvailableUserNames(usedNames);
        florausername.printTest();

        // testing
       /* if(florausername.isUsed("harta", usedNames))
        {
            System.out.printf("True");
        }
        else
        {
            System.out.printf("False");
        }
        */


    }
}
