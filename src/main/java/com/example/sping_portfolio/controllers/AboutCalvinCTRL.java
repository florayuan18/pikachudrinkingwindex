package com.example.sping_portfolio.controllers;

import com.example.sping_portfolio.SQL.Person;
import com.example.sping_portfolio.SQL.PersonSqlRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.tomcat.util.json.JSONParser;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
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
import java.util.List;

@Controller
public class AboutCalvinCTRL {
    @GetMapping("/AboutUs/aboutcalvin")
    public String TableCTRL(@RequestParam(name="seq", required=false, defaultValue= "") String seq,
                            @RequestParam(name="changeSeq", required=false, defaultValue= "") String changeSeq,
                            @RequestParam(name="insertSeq", required=false, defaultValue="") String insertSeq,
                            @RequestParam(name="insertSeqLoc", required=false, defaultValue="0") int insertSeqLoc,
                            @RequestParam(name="removeSeq", required=false, defaultValue="") String removeSeq,
                            @RequestParam(name="xDist", required=false, defaultValue="0") int xDist,
                            @RequestParam(name="yDist", required=false, defaultValue="0") int yDist,
                            Model model) throws IOException, InterruptedException {

        String binaryC = "";

        LightSequence gradShow = new LightSequence(seq);
        String binary = gradShow.displayRet();

        if (changeSeq.equals("")) {
            binaryC = binary;
        }
        else{
            binaryC = gradShow.changeSequence(changeSeq);
        }
        String binaryI = gradShow.insertSegment(insertSeq, insertSeqLoc);
        String binaryR = gradShow.removeSegment(removeSeq);
        Double distXY = gradShow.distCalc(xDist,yDist);


        model.addAttribute("binary", binary);
        model.addAttribute("binaryC", binaryC);
        model.addAttribute("binaryI", binaryI);
        model.addAttribute("binaryR", binaryR);
        model.addAttribute("distXY", distXY);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://weatherapi-com.p.rapidapi.com/current.json?q=q%3DSan%20Diego%20California"))
                .header("x-rapidapi-host", "weatherapi-com.p.rapidapi.com")
                .header("x-rapidapi-key", "e2ec6cd693msh31f1d4d692bd6b0p1dcb11jsn9ee520fd4398")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        //alternative #1: convert response.body() to java hash map
        var weatherStats = new ObjectMapper().readValue(response.body(), HashMap.class);

//        pass stats to view
        model.addAttribute("weatherStats", weatherStats);
        return "/AboutUs/aboutcalvin";
    }
//    @Autowired
//    PersonSqlRepository repository;
//
//    @GetMapping("/AboutUs/aboutcalvin")
//    public String addComment(PersonSqlRepository personSqlRepository) {
//        try{
//            repository.save(Person);
//        } catch (Exception e) {
//            e.printStackTrace();
//            return "/AboutUs/aboutcalvin";
//        }
//
//    }

}

