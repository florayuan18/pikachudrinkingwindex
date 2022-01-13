package com.example.sping_portfolio.controllers;

import java.util.ArrayList;
import java.util.List;

public class UnitFourFRQ {
    public static void longestStreak(String str){
//        int longestCount = ;
//        char longestChar = ;
//
//        int currentCount = ;
//        char currentChar = ;
//
//        System.out.printf("%c %d\n", longestChar, longestCount);
    }

    public static List<Character>
    convertStringToCharList(String str)
    {

        // Create an empty List of character
        List<Character> chars = new ArrayList<>();

        // For each character in the String
        // add it to the List
        for (char ch : str.toCharArray()) {

            chars.add(ch);
        }

        // return the List
        return chars;
    }

    public static void main(String [] args){
        String checkstring = "CAAAAAAT";
        int longestCount = 0;
        char longestChar = 'a';

        int currentCount = 0;
        char currentChar = 'a';

        for (int i = 1; i < convertStringToCharList(checkstring).size(); i++) {
            currentChar = convertStringToCharList(checkstring).get(i);
            if (convertStringToCharList(checkstring).get(i) == convertStringToCharList(checkstring).get(i - 1)){
                longestCount = longestCount + 1;
                longestChar = convertStringToCharList(checkstring).get(i);

        System.out.println(longestCount);
        System.out.println(longestChar);


            }
        }

    }
}
