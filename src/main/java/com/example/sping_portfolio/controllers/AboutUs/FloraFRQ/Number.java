package com.example.sping_portfolio.controllers.AboutUs.FloraFRQ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Number implements Comparable<Number> {
    public static int temp = 0;

    private int randomNum;
    private int index = 0;
    // instance variables
    // Number has a zero Argument constructor
    // It initializes a random number between 3 and 36, ie the number of squirrels in class
    // constructor

    public Number() {
        Random rand = new Random();
        randomNum = rand.nextInt(34);
        randomNum += 3;

        index = temp++;
    }

    // It contains a getter for the Random Number
    public int getRandomNum(){
        return randomNum;
    }

    // It contains a getter for Index, or the order it was initialized
    public int getIndex(){
        return index;
    }

    @Override
    public int compareTo(Number numCompare) {
        int compareNum=((Number)numCompare).getRandomNum();
        // For Ascending order
        return this.randomNum-compareNum;
    }

    // Write a tester method
    public static void main(String[] args) {
        // Create an ArrayList of Type Number, my ArrayList is called squirrels
        ArrayList<Number> arrOfNumbers = new ArrayList<Number>();

        // Initialize 10 squirrels of class type Number
        // Insert Number instance into ArrayList Squirrel in least to greatest order by random number, mine required nested loops
        for (int i = 0; i < 10; i++) {
            Number squirrel = new Number();
            arrOfNumbers.add(squirrel);
        }

        Collections.sort(arrOfNumbers);

        //print arrOfNumbers with enhanced for loop
        for (Number aa: arrOfNumbers) {
            System.out.println("Squirrels: " + aa.getRandomNum() + " Day: " + aa.getIndex());
        }
    }
}