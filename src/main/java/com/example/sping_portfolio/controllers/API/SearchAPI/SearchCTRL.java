package com.example.sping_portfolio.controllers.API.SearchAPI;

import org.springframework.stereotype.Controller;

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



public class SearchCTRL {

    private String search;
    private Boolean sortby_rating;
    private Boolean sortby_PlayTime;
    public SearchCTRL(String search, boolean sortby_rating, boolean sortby_PlayTime){
        this.search = search;
        this.sortby_PlayTime = sortby_PlayTime;
        this.sortby_rating = sortby_rating;
    }

    public ArrayList<String[]> getGames() throws IOException, InterruptedException, JSONException {
        String KEY = "42771867b81b456496770e0c1c15d4f2";
        String url = "https://api.rawg.io/api/games?" + "&search=" + search.replace(" ", "-") + "&key=" + KEY;
//        if (!(id.equals("0"))){
//            url = "https://api.rawg.io/api/games?" + "&id=" + id + "&key=" + KEY;
//        }
//https://api.rawg.io/api/games?id=3498&key=42771867b81b456496770e0c1c15d4f2


        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("x-rapidapi-host", "https://api.rawg.io/api/games")
                .header("x-rapidapi-key", KEY)
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        JSONArray gameList = new JSONObject(response.body()).getJSONArray("results");


        ArrayList<String[]> retArr = new ArrayList<>();
        for (int i = 0; i < gameList.length(); i++) {
            retArr.add(
                new String[] {gameList.getJSONObject(i).getString("name"), "http://localhost:8080/id?id=" + gameList.getJSONObject(i).getString("id"),gameList.getJSONObject(i).getString("background_image"), gameList.getJSONObject(i).getString("rating"), gameList.getJSONObject(i).getString("playtime"),gameList.getJSONObject(i).getString("id")}
            );

        }

        if (sortby_rating){
            retArr.sort(new RatingComparator());
        }
        if (sortby_PlayTime){
            retArr.sort(new PlayTimeComparator());
        }


        return retArr;
    }
}
