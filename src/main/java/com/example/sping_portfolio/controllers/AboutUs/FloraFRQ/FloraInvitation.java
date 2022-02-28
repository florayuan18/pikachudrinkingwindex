package com.example.sping_portfolio.controllers.AboutUs.FloraFRQ;

public class FloraInvitation {
    private String hostName = "Karen";
    private String address;

    public String getHostName() {
        return hostName;
    }

    public String setAddress(String ad) {
        address = ad;
        return address;
    }

    public FloraInvitation(String n, String a) {
        hostName = n;
        address = a;
    }

    public String message(String guestName) {
        return "Dear " + guestName + ", please attend my event at " + address + ". See you then, " + hostName;
    }
/*
    public static void main(String[] args) {
        FloraInvitation party = new FloraInvitation("Wilma", "1234567 Eleven Lane");
        party.displayhostName();
        party.updateAddress("1234 Walnut Street");
        party.message("Cheryl");
    } */
}