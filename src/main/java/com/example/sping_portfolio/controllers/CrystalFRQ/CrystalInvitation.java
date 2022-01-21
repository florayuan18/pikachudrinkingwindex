package com.example.sping_portfolio.controllers.CrystalFRQ;

public class CrystalInvitation {
    private String hostName = "Karen";
    private String address;

    public CrystalInvitation(String n, String a){
        hostName = n;
        address = a;
    }

    //one parameter constructor
    public CrystalInvitation(String address){
        this.address = address;
    }

    //returns host name
    public String displayHostName(){return this.hostName;}

    //method that accepts a parameter and uses it to update an address for the event
    public String updateAddress(String newAddress){
        this.address = newAddress;
        return address;
    }

    //displays invitation message
    public String message(String guestName){
        return "Dear " + guestName + ", please attend my event at " + address + ". See you then, " + hostName;
    }

}
