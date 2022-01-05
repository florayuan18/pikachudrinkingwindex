/*
package com.example.sping_portfolio.controllers.MaggieFRQ;
import java.lang.String;

public class MaggieLongestStreak {
    //private instance variables
    private int longestCount = "";
    private char longestChar = "";
    private int currentCount = "";
    private char currentChar = "";

    //overloaded constructor
    public MaggieLongestStreak(int longestCount, char longestChar, int currentCount, char currentChar){
        this.longestCount = longestCount;
        this.longestChar = longestChar;
        this.currentCount = currentCount;
        this.currentChar = currentChar;
    }

    public static void MaggieLongestStreak(String str) {


        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i-1)) {
                currentCount++;
            }
            else{
                currentCount = "";
            }


            currentCount += str.charAt(i);
            if (currentStreak.length() > largestStreak.length()) {
                largestStreak = currentStreak;
            }
        }
        System.out.println(largestStreak.charAt(0) + " " + largestStreak.length());

    }
}
?
 */