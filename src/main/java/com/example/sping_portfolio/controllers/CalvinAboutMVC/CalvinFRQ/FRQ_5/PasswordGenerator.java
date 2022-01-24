package com.example.sping_portfolio.controllers.CalvinAboutMVC.CalvinFRQ.FRQ_5;

public class PasswordGenerator {

    private String Password;
    private String Characters;
    private String Character;
    public int NumberOfPass = 0;

    public void pwGen(int NumberOfCharacters, String Prefix){
        Characters = "";
        for (int i=0; NumberOfCharacters > i; i++){
            Characters += String.valueOf((int) (Math.random() * 10 + 0));
        }
        Password = Prefix + " . " + Characters;
        NumberOfPass ++;
        System.out.println(Password);
    }
    public void pwGen(int NumberOfCharacters){
        Characters = "";
        for (int i=0; NumberOfCharacters > i; i++){
            Characters += String.valueOf((int) (Math.random() * 10 + 0));
        }
        Password = "A" + "." + Characters;
        NumberOfPass ++;
        System.out.println(Password);
    }
    public void pwCount(){
        System.out.println(NumberOfPass);
    }




    public static void main(String [] args) {
        PasswordGenerator pw1 = new PasswordGenerator();
        pw1.pwCount();
        pw1.pwGen(4,"chs");
        pw1.pwGen(4,"chs");
        pw1.pwCount();
        PasswordGenerator pw2 = new PasswordGenerator();
        pw2.pwCount();
        pw2.pwGen(6);
        pw2.pwCount();
        pw1.pwCount();

    }
}
