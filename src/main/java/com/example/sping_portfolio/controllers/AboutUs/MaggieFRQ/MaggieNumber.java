/*
Maggie Killada
AP CSA Quiz
 */

package com.example.sping_portfolio.controllers.AboutUs.MaggieFRQ;

import java.util.ArrayList;

// Write a Class Number
public class MaggieNumber {
    // instance variables
    private int randomNumber;
    private int index;
    private ArrayList<Integer>squirrels;

    // Number has a zero Argument constructor
    public MaggieNumber() {
        squirrels = new ArrayList<Integer>();
        // initializes a random number between 3 and 36, ie. the number of squirrels in class
        randomNumber = (int)(Math.random() * 34) + 3;
    }

    // It contains a getter for the Random Number
    public int getRandomNumber(){
        return randomNumber;
    }

    // It contains a getter for Index, or the order it was initialized
    public int getIndex(){
        index = 0;
        squirrels.add(getRandomNumber());
        return index++;
    }

    public ArrayList<Integer> getSquirrels(){
        return squirrels;
    }

    // Write a tester method
    public static void main(String[] args) {
        MaggieNumber sqnumber = new MaggieNumber();
        // Create an ArrayList of Type Number
        ArrayList<Integer> thesquirrels = new ArrayList<Integer>();
        // Initialize 10 squirrels of class type Number
        // Insert Number instance into ArrayList Squirrel in least to greatest order by random number, mine required nested loops
        int r = sqnumber.getIndex();
        for (r = 0; r < 11; r++){
            sqnumber.getIndex();
            System.out.println(sqnumber.getSquirrels());
        }

        // Print a formatted message with number of Squirrels and Index by which they were created, use enhanced for loop

    }

}
