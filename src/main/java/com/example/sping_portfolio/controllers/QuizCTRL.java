package com.example.sping_portfolio.controllers;

import com.google.gson.Gson;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class QuizCTRL {
    @GetMapping("/quiz")
    public String quiz(Model model) {

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

        model.addAttribute("json", json);
        return "quiz"; // returns HTML VIEW (greeting)
    }
}


