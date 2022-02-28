/*
Maggie Killada
AP CSA FRQ #9
 */

package com.example.sping_portfolio.controllers.AboutUs.MaggieFRQ;

public class MaggieBookListing {
    // using an object as a variable
    private MaggieBook maggieBook;
    private double price;

    public MaggieBookListing(MaggieBook mb, double p){
        this.maggieBook = mb;
        this.price = p;
    }

    public String printDescription(){
        return (maggieBook.printBookInfo() + ", " + price);
    }
}
