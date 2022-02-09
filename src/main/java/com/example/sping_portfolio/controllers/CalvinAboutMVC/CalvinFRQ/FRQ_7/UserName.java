package com.example.sping_portfolio.controllers.CalvinAboutMVC.CalvinFRQ.FRQ_7;

import java.util.ArrayList;


public class UserName {

// The list of possible user names, based on a user’s first and last names and initialized by the constructor.
    private ArrayList<String> possibleNames = new ArrayList<>(){};
    private ArrayList<String> used;


    public UserName(String firstName, String lastName){
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
        UserName person = new UserName("john", "smith");
        String[] used = {"smith", "smithj", "harty"};
//        person.setAvailableUserNames(used);
        UserName person1 = new UserName("john", "smith");
        if (person1 == person){
            System.out.println("works");
        }
        else{
            System.out.println("failed");
        }
    }
}
