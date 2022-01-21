package com.example.sping_portfolio.controllers.CalvinAboutMVC.CalvinFRQ.FRQ_5;

public class Invitation {
    private String hostName;
    private String address;

    public void Invitation(String n, String a){
        hostName = n;
        address = a;
    }
    public void Invitation(String address){
        hostName = "Host";
        this.address = address;
    }
    public String GetHost(){
        return hostName;
    }
    public void UpdateAdress(String address){
        this.address = address;
    }
    public void Invite(String name){
        System.out.println("Dear " + name + ", please attend my event at " + address + ". See you then, " + hostName);
    }
    public static void main(String [] args) {
        Invitation Person1 = new Invitation();
        Person1.Invitation("Mag", "193 not mab");
        Person1.UpdateAdress("101 Fireman");
        Person1.Invite("Brad");




    }
}
