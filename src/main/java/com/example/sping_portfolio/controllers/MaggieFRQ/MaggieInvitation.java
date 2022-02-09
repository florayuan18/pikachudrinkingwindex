/*
Maggie Killada
AP CSA FRQ #5
 */

package com.example.sping_portfolio.controllers.MaggieFRQ;

public class MaggieInvitation {
    private String hostName;
    private String address;

    public MaggieInvitation(String n, String a){
        hostName = n;
        address = a;
    }

    //returns host name
    public String displayHostName(){
        return this.hostName;
    }

    //method that accepts a parameter and uses it to update an address for the event
    public String updateAddress(String newAddress){
        this.address = newAddress;
        return address;
    }

    //displays invitation message
    public String message(String guestName){
        return "Dear " + guestName + ", please attend my event at " + address + ". See you then, " + hostName;
    }

    /*
    //method call
    public static void main(String [] args) {
        MaggieInvitation party = new MaggieInvitation("Sofie","5678 Cashew Lane");
        party.displayHostName();
        party.updateAddress("1234 Walnut Street");
        party.message("Cheryl");
    }
     */
}
