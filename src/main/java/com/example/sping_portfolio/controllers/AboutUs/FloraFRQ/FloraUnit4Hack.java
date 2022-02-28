package com.example.sping_portfolio.controllers.AboutUs.FloraFRQ;
import java.util.Scanner;


    public class FloraUnit4Hack {

        public static void longestStreak(String str) {
            int longestCount = 0;
            char longestChar = 'a';

            int currentCount = 0;
            char currentChar = 'a';

            int startIndex = 0;
            int endIndex = 0;


            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter string");
            String input = myObj.nextLine();

            for (int i = 1; i < input.length(); i++) {
                if (input.charAt(i-1) == input.charAt(i)) {
                    currentChar = input.charAt(i);
                    currentCount = currentCount + 1;
                    if (currentCount > longestCount) {
                        endIndex = i;
                        startIndex = endIndex - longestCount;
                        longestChar = input.charAt(i);
                        longestCount = currentCount;
                    }
                }
                else {
                    currentCount = 1;
                    currentChar = input.charAt(i);
                }
            }



            System.out.printf("%c %d\n", longestChar, longestCount);
            System.out.printf("Start index:" + startIndex);
            System.out.printf("End index:" + endIndex);
        }
        public static void main(String[] args) {
            FloraUnit4Hack c = new FloraUnit4Hack();
            c.longestStreak("CCAAAATTT!");
        }
    }

