package com.example.sping_portfolio.controllers.AboutUs.CrystalFRQ;

import java.util.ArrayList;

    // Write a Class Number
    public class Number {
        // instance variables
        int randomnumber;
        int numberindex;

        // Initializes number from 3 to 36
        public Number(int passing) {
            // constructor
            this.randomnumber = (int)((Math.random() * 34) + 3);
            this.numberindex = passing;
        }

        // Random Number Getter
        public int randomNumber(){
            return this.randomnumber;
        }

        // Index Getter
        public int numberIndex() {
            return this.numberindex;
        }

        // Write a tester method
        public static void main(String[] args) {
            // Create an ArrayList of Type Number, my ArrayList is called squirrels
            ArrayList<Number> squirrels = new ArrayList<Number>();
            // Initialize 10 squirrels of class type Number
            for (int i = 0; i < 10; i++)
            {
                Number newnumber = new Number(i+1);
                squirrels.add(newnumber);
            }
            // Sorting
            System.out.println(squirrels);
            ArrayList<Number> sorted = new ArrayList<Number>();
            int n = 10;
            for (int i = 0; i < n-1; i++){
                //Using two different variables because the code will be confused on which im referring to
                for (int k = 0; k < n-i-1; k++){
                    if (squirrels.get(k).randomNumber() > squirrels.get(k+1).randomNumber())
                    {
                        Number temp = squirrels.get(k);
                        squirrels.set(k, squirrels.get(k+1));
                        squirrels.set(k+1, temp);
                    }
                }
            }
            // Print a formatted message with number of Squirrels and Index by which they were created, use enhanced for loop
            for (Number sort : squirrels)
            {
                System.out.println("There were " + sort.randomNumber() + " squirrels on day " + sort.numberIndex());
            }
        }

    }

