package com.example.sping_portfolio.controllers.CalvinAboutMVC;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.swap;
import static org.springframework.data.mongodb.core.aggregation.ObjectOperators.MergeObjects.merge;

public class Number {
    // instance variables
    private int squirrels;
    private int NubCreate;
    private static int GlobCreate = 1;
    // Number has a zero Argument constructor
    // It initializes a random number between 3 and 36, ie the number of squirrels in class
    public Number() {
        squirrels = (int) (Math.random() * 34 + 3);

        NubCreate = GlobCreate;
        GlobCreate ++;

    }

    // It contains a getter for the Random Number
    public int getDay(){
        return NubCreate;
    }

    // It contains a getter for Index, or the order it was initialized


    public int getSquirrels() {
        return squirrels;
    }



    // Write a tester method
    public static void main(String[] args) {
        ArrayList<Number> squirrels = new ArrayList<>();

        // Create an ArrayList of Type Number, my ArrayList is called squirrels
        // Initialize 10 squirrels of class type Number
        // Insert Number instance into ArrayList Squirrel in least to greatest order by random number, mine required nested loops

           for (int i = 0; i < 10; i++) {
               squirrels.add(new Number());
           }
            int lowest = 50;
           int lowestSquirrels = 50;
        ArrayList<Number> squirrelz = new ArrayList<>();
           for (int i = 0; i < 9; i++){
               lowest = 50;
               lowestSquirrels = 50;
               for (int j = 0; j < squirrels.size()-1; j++){
                   if (squirrels.get(j).getSquirrels() < lowestSquirrels){
                       lowest = j;
                       lowestSquirrels = squirrels.get(j).getSquirrels();
//                       System.out.println(lowestSquirrels);

                   }

               }

//               for (Number day : squirrels){
//                   System.out.println("Squirrels:" + day.getSquirrels() + " Day:" + day.getDay());
//               }
//               System.out.println(squirrels.size()-1);
//               System.out.println(squirrels);
//               System.out.println(lowest + " " + lowestSquirrels);
//               System.out.println("lowest value" + squirrels.get(lowest));
               /*System.out.print("Squirrels:" + squirrels.get(lowest).getSquirrels() + " Day:" + lowest + "       ");*/
               squirrelz.add(squirrels.get(lowest));
               squirrels.remove(lowest);
           }






        for (Number day : squirrelz){
            System.out.println("Squirrels:" + day.getSquirrels() + " Day:" + day.getDay());
        }


        // Print a formatted message with number of Squirrels and Index by which they were created, use enhanced for loop

    }

}

