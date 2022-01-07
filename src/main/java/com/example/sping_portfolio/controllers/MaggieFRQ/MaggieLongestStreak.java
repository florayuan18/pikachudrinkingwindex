package com.example.sping_portfolio.controllers.MaggieFRQ;

public class MaggieLongestStreak {
    //longestStreak("CCAAAAATTT!");
    public String longestStreak(String str){
        char previousChar = ' ';
        String largestStreak = "", currentStreak = "";
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) != previousChar){
                currentStreak = "";
            }
            currentStreak += str.charAt(i);
            if (currentStreak.length() > largestStreak.length()){
                largestStreak = currentStreak;
            }
            previousChar = str.charAt(i);
        }
        //System.out.println(largestStreak.charAt(0)+" "+largestStreak.length());
        return (largestStreak.charAt(0)+" "+largestStreak.length());
    }
}