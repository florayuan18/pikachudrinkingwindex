package com.example.sping_portfolio.controllers;

import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;

import java.util.*;

//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
import org.json.JSONObject;
import org.json.JSONArray;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.json.*;

import org.springframework.web.bind.annotation.RequestParam;

class RatingComparator implements Comparator<String[]> {
    public int compare(String[] a, String[] b) {
        if (Float.parseFloat(a[3]) < Float.parseFloat(b[3])) {
            return 1;
        } else if (Float.parseFloat(a[3]) > Float.parseFloat(b[3])) {
            return -1;
        }

        return 0;
    }
}
class PlayTimeComparator implements Comparator<String[]> {
    public int compare(String[] a, String[] b) {
        if (Float.parseFloat(a[4]) < Float.parseFloat(b[4])) {
            return 1;
        } else if (Float.parseFloat(a[4]) > Float.parseFloat(b[4])) {
            return -1;
        }

        return 0;
    }
}
@Controller
public class SearchCTRL {
    @GetMapping("/search")
    public String RawgAPI(@RequestParam(name="search", required=true, defaultValue= "") String search,
                          @RequestParam(name="sortby_rating", required=false, defaultValue= "false") boolean sortby_rating,
                          @RequestParam(name="sortby_PlayTime", required=false, defaultValue= "false") boolean sortby_PlayTime,

                          Model model) throws IOException, InterruptedException, ParseException, JSONException {


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

        JSONArray gameList = new JSONObject(response.body()).getJSONArray("results");

//        System.out.println(gameList.length());

        ArrayList<String[]> retArr = new ArrayList<>();

        for (int i = 0; i < gameList.length(); i++) {
            retArr.add(
                new String[] {gameList.getJSONObject(i).getString("name"), gameList.getJSONObject(i).getString("id"),gameList.getJSONObject(i).getString("background_image"), gameList.getJSONObject(i).getString("rating"), gameList.getJSONObject(i).getString("playtime")}
            );
        }

        if (sortby_rating){
            retArr.sort(new RatingComparator());
        }
        if (sortby_PlayTime){
            retArr.sort(new PlayTimeComparator());
        }

        //JSONObject gameList = new JSONObject("{'test':1}").getJSONArray("results").getJSONObject(0);

        model.addAttribute("gameList", retArr);
        return "/search";
    }
}
