package com.example.sping_portfolio.controllers.API;

import com.example.sping_portfolio.controllers.API.SearchAPI.SearchCTRL;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.IOException;
import java.util.ArrayList;

@Controller
public class API_CTRL {
    @GetMapping("/TopTwitchAPI")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String AsyncCTRL() {
        return "/TopTwitchAPI"; // returns HTML VIEW (greeting)
    }

    @GetMapping("/search")
    public String RawgAPI(@RequestParam(name="search", required=false, defaultValue= "") String search,
                          @RequestParam(name="sortby_rating", required=false, defaultValue= "false") boolean sortby_rating,
                          @RequestParam(name="sortby_PlayTime", required=false, defaultValue= "false") boolean sortby_PlayTime,
                          @RequestParam(name="id", required=false, defaultValue= "0") String id,

                          Model model) throws IOException, InterruptedException, ParseException, JSONException {

        SearchCTRL input = new SearchCTRL(search, sortby_rating, sortby_PlayTime);
        ArrayList<String[]> retArr = input.getGames();


        model.addAttribute("gameList", retArr);
        return "/search";
    }

    }
