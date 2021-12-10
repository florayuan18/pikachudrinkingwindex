package com.example.sping_portfolio.controllers;
/* MVC code that shows defining a simple Model, calling View, and this file serving as Controller
 * Web Content with Spring MVCSpring Example: https://spring.io/guides/gs/serving-web-con
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.text.ParseException;
import java.util.HashMap;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class AboutKira {

    public static String makeurl(){
        String makeurl = "https://billboard-api2.p.rapidapi.com/billboard-200?range=1-10&date=" + java.time.LocalDate.now();
        return makeurl;
    }

/*
    @GetMapping("/aboutkira")
    public String quotes(Model model) throws IOException, InterruptedException, ParseException {
        //rapidapi setup:
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(makeurl()))
                .header("x-rapidapi-host", "billboard-api2.p.rapidapi.com")
                .header("x-rapidapi-key", "f4e47a0331msh068fd5299f4fe60p13031ejsn3acdd247ddd3")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        //convert response.body() to java hash map
        var aboutkira = new ObjectMapper().readValue(response.body(), HashMap.class);


        //pass stats to view
        model.addAttribute("aboutkira", aboutkira);


        return "AboutUs/aboutkira";
    }
    */

//    public static void main(String[] args) {
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create(makeurl()))
//                .header("x-rapidapi-host", "billboard-api2.p.rapidapi.com")
//                .header("x-rapidapi-key", "f4e47a0331msh068fd5299f4fe60p13031ejsn3acdd247ddd3")
//                .method("GET", HttpRequest.BodyPublishers.noBody())
//                .build();
//        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
//        System.out.println(response.body());
//   }

}