/*
Maggie Killada
AP CSA Quiz
 */

package com.example.sping_portfolio.controllers.MaggieFRQ;

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
        randomNumber = (int)(Math.random() * 33) + 3;
    }

    // It contains a getter for the Random Number
    public int getRandomNumber(){
        return randomNumber;
    }

    // It contains a getter for Index, or the order it was initialized
    public int getIndex(){
        for (int i = 0; i < 11; i++){
            squirrels.add(getRandomNumber());
            index = i;
        }
        return index;
    }

    public ArrayList<Integer> getSquirrels(){
        return squirrels;
    }

    // Write a tester method
    public static void main(String[] args) {
        MaggieNumber sqnumber = new MaggieNumber();
        // Create an ArrayList of Type Number, my ArrayList is called squirrels
        // Initialize 10 squirrels of class type Number
        sqnumber.getRandomNumber();
        sqnumber.getIndex();
        System.out.println(sqnumber.getSquirrels());
        // Insert Number instance into ArrayList Squirrel in least to greatest order by random number, mine required nested loops


        // Print a formatted message with number of Squirrels and Index by which they were created, use enhanced for loop

    }

}
