package com.example.sping_portfolio.controllers;

class VoiceLine {
    public void line() {
        System.out.println("Filler");
    }
}
class Sage extends VoiceLine {
    public void line() {
        System.out.println("I am both shield and sword");
    }
}
class Reyna extends VoiceLine {
    public void line() {
        System.out.println("They have no idea how heartless I am");
    }
}

class Jett extends VoiceLine{

    public void line(){
        System.out.println("Careful of the edges! Not sure if I could catch you in time if you fell off. I mean, I'd try of course.");
    }
}

class Raze extends VoiceLine{

    public void line(){
        System.out.println("Okay, minha família. Leave the fireworks to me. Should be plenty loud for you to have some fun.");
    }
}

class Viper extends VoiceLine{

    public void line(){
        System.out.println("Remember, nobody's a hero when they're crying for air.");
    }
}

class Quiz {
    public static void main(String args[ ]) {
        VoiceLine a = new Reyna();
        VoiceLine b = new Sage();
        VoiceLine c = new Jett();
        VoiceLine d = new Raze();
        VoiceLine e = new Viper();

        a.line();
        b.line();
        c.line();
        d.line();
        e.line();
    }
}
