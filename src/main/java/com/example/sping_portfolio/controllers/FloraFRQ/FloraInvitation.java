package com.example.sping_portfolio.controllers.FloraFRQ;

public class FloraInvitation {
    private String hostName = "Karen";
    private String address;
    public String getHostName(){
        return hostName;
    }
    public String setAddress(String ad){
        address=ad;
    }
    public FloraInvitation(String n, String a){
        hostName = n;
        address = a;
    }
    public String message(String guestName){
        return "Dear " + guestName + ", please attend my event at " + address + ". See you then, " + hostName;
    }
}
