
package com.example.sping_portfolio.controllers.CrystalFRQ;

import java.util.ArrayList;


public class CrystalUser {

// The list of possible user names, based on a user’s first and last names and initialized by the constructor.
    private ArrayList<String> possibleNames = new ArrayList<>(){};

    public CrystalUser(String firstName, String lastName){
        for(int i = 1; i < firstName.length(); i++){
            String subFirst = firstName.substring(0, i);
            possibleNames.add(lastName + subFirst);
        }

        }

    public boolean isUsed(String name, String[] arr){
        for (String s : arr){
            if (s.equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void setAvailableUserNames(String[] usedNames){
        ArrayList<String> pN = possibleNames;
        System.out.println(pN);
        for (String nn : usedNames) {
            for (int i = 0; i < pN.size(); i++) {
                if (nn.equals(pN.get(i))) {
                    possibleNames.remove(i);
//                    System.out.println(pN.get(i));
                }
            }
        }
        for (String n : possibleNames){
            System.out.println(n);
        }



    }

    public static void main(String [] args) {
        CrystalUser person = new CrystalUser("john", "smith");
        String[] used = {"smith", "smithj", "harty"};
        person.setAvailableUserNames(used);
    }
}
