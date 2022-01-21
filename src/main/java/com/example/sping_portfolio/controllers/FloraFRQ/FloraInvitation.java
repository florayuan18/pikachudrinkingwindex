package com.example.sping_portfolio.controllers.FloraFRQ;

public class FloraInvitation {
    private String hostName = "Karen";
    private String address;
    public String getHostName(){
        return hostName;
    }
    public String setAddress(String ad){
        address=ad;
        return address;
    }
    public FloraInvitation(String n, String a){
        hostName = n;
        address = a;
    }
    public String message(String guestName){
        return "Dear " + guestName + ", please attend my event at " + address + ". See you then, " + hostName;
    }

    public static void main(String[] args) {
        FloraInvitation Guest= new FloraInvitation();
    }
}
