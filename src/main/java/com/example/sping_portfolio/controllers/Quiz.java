package com.example.sping_portfolio.controllers;

import com.google.gson.Gson;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.Objects;

class VoiceLine {
    public String question;
    public String correctAnswer;
    public String[] answers;

    public String line() {
        return "placeholder";
    }

    public String ques() {
        return "placeholder";
    }


    public VoiceLine(){
        correctAnswer = this.line();

        question = "Which line is said by " + getClass().getSimpleName() + "?";

        String[] incorrect = {"We all make choices in life, but in the end our choices make us.",
                "What is better? To be born good or to overcome your evil nature through great effort?",
                "The right man in the wrong place can make all the difference in the world.",
                "Stand in the ashes of a trillion dead souls, and asks the ghosts if honor matters. The silence is your answer.",
                "Bring me a bucket, and I'll show you a bucket!",
                "Wanting something does not give you the right to have it.",
                "Even in dark times, we cannot relinquish the things that make us human.",
                "A hero need not speak. When he is gone, the world will speak for him.",
                "It's time to kick ass and chew bubblegum... and I'm all outta gum.",
                "If our lives are already written, it would take a courageous man to change the script."};
        String incorrect1 = incorrect[(int)(Math.random()* (incorrect.length))];

        String string = incorrect[(int)(Math.random()* (incorrect.length))];
        if (string.equals(incorrect1)){
            while(string.equals(incorrect1)) {
                string = incorrect[(int) (Math.random() * (incorrect.length))];
            }
        }
        String incorrect2 = string;

        answers = new String[]{incorrect1, incorrect2, correctAnswer};
    }

}
class Sage extends VoiceLine {
    public String line() {
        return "I am both shield and sword.";
    }

}
class Reyna extends VoiceLine {
    public String line() {
        return "They have no idea how heartless I am.";
    }
}

class Jett extends VoiceLine{
    public String line() {
        return "Careful of the edges! Not sure if I could catch you in time if you fell off. I mean, I'd try of course.";
    }
}

class Raze extends VoiceLine{

    public String line() {
        return "Okay, minha família. Leave the fireworks to me. Should be plenty loud for you to have some fun.";
    }
}

class Viper extends VoiceLine{
    public String line() {
        return "Remember, nobody's a hero when they're crying for air.";
    }
}

class Quiz {
    public static void main(String args[ ]) {

        VoiceLine a = new Reyna();
        VoiceLine b = new Sage();
        VoiceLine c = new Jett();
        VoiceLine d = new Raze();
        VoiceLine e = new Viper();

        ArrayList<VoiceLine> list = new ArrayList<>();

        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        String json = new Gson().toJson(list);

        System.out.println(json);
    }
}
