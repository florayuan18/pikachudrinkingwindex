//package com.example.sping_portfolio.controllers;
//
//import com.example.sping_portfolio.controllers.CalvinAboutMVC.CalvinFRQ.LightSequence;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import javassist.bytecode.ClassFile;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import static org.asynchttpclient.Dsl.*;

//import java.io.IOException;
//import java.net.URI;
//import java.net.http.HttpClient;
//import java.net.http.HttpRequest;
//import java.net.http.HttpResponse;
//import java.util.HashMap;
//@Controller
//public class homepgCTRL {
//    @GetMapping("/index")
//    public String GameNewsApi(@RequestParam(name="seq", required=false, defaultValue= "") String seq, Model model) throws IOException, InterruptedException {
//        AsyncHttpClient client = new DefaultAsyncHttpClient();
//        client.prepare("GET", "https://fortnite-api.p.rapidapi.com/stats/QwikSP")
//                .setHeader("x-rapidapi-host", "fortnite-api.p.rapidapi.com")
//                .setHeader("x-rapidapi-key", "e2ec6cd693msh31f1d4d692bd6b0p1dcb11jsn9ee520fd4398")
//                .execute()
//                .toCompletableFuture()
//                .thenAccept(System.out::println)
//                .join();
//
//        client.close();
//        AsyncHttpClient asyncHttpClient = asyncHttpClient();
//        DefaultAsyncHttpClientConfig.Builder clientBuilder = Dsl.config()
//        DefaultAsyncHttpClientConfig.Builder clientBuilder = Dsl.config()
//                .setConnectTimeout(500)
//                .setProxyServer(new ProxyServer(...));
//        AsyncHttpClient client = Dsl.asyncHttpClient(clientBuilder);
        //alternative #1: convert response.body() to java hash map
//        var gameNews = new ObjectMapper().readValue(response.body(), HashMap.class);

//        pass stats to view
//        model.addAttribute("gameNews", gameNews);
//        return "/index";
//    }
//}