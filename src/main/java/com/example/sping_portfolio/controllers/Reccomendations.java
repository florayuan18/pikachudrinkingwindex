package com.example.sping_portfolio.controllers;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Comparator;

class StrategyComparator implements Comparator<String[]> {
    public int compare(String[] a, String[] b) {
        if (Float.parseFloat(a[4]) < Float.parseFloat(b[4])) {
            return 1;
        } else if (Float.parseFloat(a[4]) > Float.parseFloat(b[4])) {
            return -1;
        }
        return 0;
    }
}

class HelloComparator implements Comparator<String[]> {
    public int compare(String[] a, String[] b) {
        if (Float.parseFloat(a[4]) < Float.parseFloat(b[4])) {
            return 1;
        } else if (Float.parseFloat(a[4]) > Float.parseFloat(b[4])) {
            return -1;
        }
        return 0;
    }
}

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class Reccomendations {
    @GetMapping("/recommendations")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String RawgAPI(@RequestParam(name="search", required=true, defaultValue= "") String search,
                          @RequestParam(name="rpgSearch", required=false, defaultValue= "false") boolean rpgSort,
                          @RequestParam(name="horrorSort", required=false, defaultValue= "false") boolean horrorSort,
                          @RequestParam(name="strategySort", required=false, defaultValue= "false") boolean strategySort,
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
            System.out.println(response.body());

            JSONArray gameList = new JSONObject(response.body()).getJSONArray("results");
            System.out.println(gameList.length());

            ArrayList<String[]> retArr = new ArrayList<>();

            for (int i = 0; i < gameList.length(); i++) {
                retArr.add(
                        new String[] {gameList.getJSONObject(i).getString("name"), gameList.getJSONObject(i).getString("id"),gameList.getJSONObject(i).getString("background_image"), gameList.getJSONObject(i).getString("rating"), gameList.getJSONObject(i).getString("playtime")}
                );
            }

            if (strategySort){
                retArr.sort(new StrategyComparator());
            }
            if (rpgSort){
                retArr.sort(new PlayTimeComparator());
            }
            if (horrorSort){
                retArr.sort(new PlayTimeComparator());
            }

            model.addAttribute("gameList", retArr);
            return "recommendations"; // returns HTML VIEW (greeting)
    }
}


