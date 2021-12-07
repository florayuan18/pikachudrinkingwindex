package com.example.sping_portfolio.controllers;

import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Controller
public class WebAPIController {

//    // GET request, no parameters
//    @GetMapping("/covid19")
//    public String covid19(Model model) throws IOException, InterruptedException, ParseException {
////         https://rapidapi.com/spamakashrajtech/api/corona-virus-world-and-india-data/
////        rapidapi setup:
////        HttpRequest request = HttpRequest.newBuilder()
////                .uri(URI.create("https://corona-virus-world-and-india-data.p.rapidapi.com/api"))
////                .header("x-rapidapi-key", "dec069b877msh0d9d0827664078cp1a18fajsn2afac35ae063")
////                .header("x-rapidapi-host", "corona-virus-world-and-india-data.p.rapidapi.com")
////                .method("GET", HttpRequest.BodyPublishers.noBody())
////                .build();
////
////        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create("https://rawg-video-games-database.p.rapidapi.com/games/%7Bgame_pk%7D"))
//                .header("x-rapidapi-host", "rawg-video-games-database.p.rapidapi.com")
//                .header("x-rapidapi-key", "e2ec6cd693msh31f1d4d692bd6b0p1dcb11jsn9ee520fd4398")
//                .method("GET", HttpRequest.BodyPublishers.noBody())
//                .build();
//        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
//        //alternative #1: convert response.body() to java hash map
//        var map = new ObjectMapper().readValue(response.body(), HashMap.class);
//
////        //alternative #2: convert response.body() to JSON object
////        Object obj = new JSONParser().parse(response.body());
////        JSONObject jo = (JSONObject) obj;
////
////        //pass stats to view
////        model.addAttribute("map", map);
////        model.addAttribute("jo", jo);
////        model.addAttribute("world_map", map.get("world_total")); //illustrative of map get
////        model.addAttribute("world_jo", jo.get("world_total"));  //illustrative of jo get
////
////
////        return "covid19";
////    }
//
////}


}