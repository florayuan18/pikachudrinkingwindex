package com.example.sping_portfolio.controllers.CrystalFRQ;

import java.util.ArrayList;

public class CrystalUser {
    private String firstName;
    private String lastName;
    private ArrayList<String> possibleNames;

        public CrystalUser(String firstName, String lastName) {
            possibleNames = new ArrayList<String>();
            for (int i = 0; i < firstName.length; i++) {
                possibleNames.add (lastName + firstName.substring(0, i + 1 ));
            }
        }


        public boolean isUsed(String name, String[] arr) {

        }


        public void setAvailableUserNames(String[] usedNames) {
            for (int i = possibleNames.size() - 1; i >= 0; i--) {
                if (isUsed(possibleNames.get(i), usedNames))
                {
                    possibleNames.remove(i);
                }
            }
        }

    }
