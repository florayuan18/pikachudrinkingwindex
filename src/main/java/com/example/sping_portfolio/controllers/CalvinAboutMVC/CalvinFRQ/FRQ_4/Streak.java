package com.example.sping_portfolio.controllers.CalvinAboutMVC.CalvinFRQ.FRQ_4;

public class Streak {
    private String best_letter;
    private int best_letter_streak;
    private int current_letter_streak;
    private String prev_letter;
    private int heighest_start;
    private int heighest_end;
    private int start;
    private int end;
    private int streakCheck;
    private String combine;

    public String longestStreak(String word) {

        for (int i = 0; i < word.length(); i++){
            String letter = word.substring(i, (i + 1));

            if (letter.equals(prev_letter)){
                current_letter_streak ++;
                if (streakCheck == 0) {
                    streakCheck = 1;

                }
                if (best_letter_streak < current_letter_streak) {
                    heighest_start = start;
                    heighest_end = end;
                    best_letter = letter;
                    best_letter_streak = current_letter_streak;
                    streakCheck = 0;
                    end = i;

                }

            }
            else{
                current_letter_streak = 1;
                prev_letter = letter;
                streakCheck = 0;
            }



        }
//       System.out.println(best_letter + " " + best_letter_streak);
        combine = best_letter + " " + best_letter_streak;
        return combine;
    }
//    public static void main(String [] args) {
//        Streak phrase = new Streak();
//        phrase.longestStreak("myyggguuuuy");
//        phrase.longestStreak("CCAAAAATTT!");
//    }
}
