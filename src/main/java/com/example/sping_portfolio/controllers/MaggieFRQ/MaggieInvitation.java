/*
Maggie Killada
AP CSA FRQ #5

5.6 V2 and learn about "Methods":  Access Level, Ownership, Return Type , Identifier, Return Types
5.6 V3, 5.7 V1 and learn about use of 'Statics" Variables and Methods.
 */

package com.example.sping_portfolio.controllers.MaggieFRQ;

public class MaggieInvitation{
    private String hostName;
    private String address;

    public MaggieInvitation(String n, String a){
        hostName = n;
        address = a;
    }

    //one parameter constructor
    public MaggieInvitation(String address){
        address = "address";
        hostName = "Karen";
    }

    //returns host name
    public String displayHostName(){return hostName;}

    //method that accepts a parameter and uses it to update an address for the event
    public String updateAddress(String newAddress){
        newAddress = "16601 Nighthawk Ln";
        address = newAddress;
        return address;
    }

    //displays invitation message
    public String message(String guestName) {
        return "Dear " + guestName + ", please attend my event at " + address + ". See you then, " + hostName;
    }

    /*
    //method call
    public static void main(String [] args) {
        MaggieInvitation party = new MaggieInvitation("5678 Cashew Lane");
        party.displayHostName();
        party.updateAddress("1234 Walnut Street");
        party.message("Cheryl");
    }
     */
}