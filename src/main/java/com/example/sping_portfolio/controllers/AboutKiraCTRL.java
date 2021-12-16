package com.example.sping_portfolio.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;

@Controller
public class AboutKiraCTRL {
    @GetMapping("/AboutUs/aboutkira")
    public String TableCTRL() {

        boolean rsvp = true;
        int selection = 1;
        String option1 = "";
        String option2 = "";

        if (rsvp) {
            System.out.println("Attending");
        } else {
            System.out.println("Not attending");
        }

        if (selection == 1) {
            System.out.println("beef");
        } else if (selection == 2) {
            System.out.println("chicken");
        } else if (selection == 3) {
            System.out.println("pasta");
        } else {
            System.out.println("fish");
        }

        if (rsvp && selection == 1) {
            option1 = "Thanks for attending.You will be served beef.";
        }
        if (rsvp && selection == 2) {
            option1 = "Thanks for attending.You will be served chicken.";
        }
        if (rsvp && selection == 1) {
            option1 = "Thanks for attending.You will be served pasta.";
        } else if (rsvp) {
            option1 = "Thanks for attending.You will be served fish.";
        } else {
            option1 = "Sorry you couldn't make it";
        }

        if (option1.equals(option2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        return "/aboutkira";
    }
}
