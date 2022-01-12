package com.example.sping_portfolio.controllers;

import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;
import java.util.HashMap;

//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.simple.parser.JSONParser;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashMap;

import org.json.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchCTRL {
    @GetMapping("/search")
    public String RawgAPI(@RequestParam(name="search", required=true, defaultValue= "") String search, Model model) throws IOException, InterruptedException, ParseException, JSONException {

        String KEY = "42771867b81b456496770e0c1c15d4f2";
        String url = "https://api.rawg.io/api/games?key=" + KEY + "&search=" + search;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("x-rapidapi-host", "https://api.rawg.io/api/games")
                .header("x-rapidapi-key", KEY)
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
//
//        System.out.println(response.body());

//        var gameList = new ObjectMapper().readValue(response.body(), HashMap.class);
//        JSONObject resp = new JSONObject(response.body()).getJSONObject("player").getJSONObject("stats").getJSONObject("Bedwars");


        JSONArray gameList = new JSONObject(response.body()).getJSONArray("results");

//        System.out.println(gameList.length());

        String[][] retArr = new String[0][3];

        for (int i = 0; i < gameList.length(); i++) {
            if (i >= retArr.length) {
                retArr = Arrays.copyOf(retArr, i + 1);
            }
            retArr[i] = new String[] {gameList.getJSONObject(i).getString("name"), gameList.getJSONObject(i).getString("id"),gameList.getJSONObject(i).getString("background_image")};
        }

        //JSONObject gameList = new JSONObject("{'test':1}").getJSONArray("results").getJSONObject(0);

        model.addAttribute("gameList", retArr);
        return "/search";

    }
}
