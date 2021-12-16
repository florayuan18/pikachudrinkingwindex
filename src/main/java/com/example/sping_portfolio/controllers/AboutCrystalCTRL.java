package com.example.sping_portfolio.controllers;

import com.example.sping_portfolio.controllers.CalvinFRQ.LightSequence;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AboutCrystalCTRL {
    @GetMapping("/aboutcrystal")
    public String TableCTRL(@RequestParam(name="seq", required=false, defaultValue= "") String seq,
                            @RequestParam(name="changeSeq", required=false, defaultValue= "") String changeSeq,
                            @RequestParam(name="insertSeq", required=false, defaultValue="") String insertSeq,
                            @RequestParam(name="insertSeqLoc", required=false, defaultValue="0") int insertSeqLoc,
                            @RequestParam(name="removeSeq", required=false, defaultValue="") String removeSeq,
                            @RequestParam(name="xDist", required=false, defaultValue="0") int xDist,
                            @RequestParam(name="yDist", required=false, defaultValue="0") int yDist,
                            Model model)
    {

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


        return "/aboutcrystal";
    }

//    public String API(Model model) throws IOException, InterruptedException, ParseException {
//        // https://rapidapi.com/spamakashrajtech/api/corona-virus-world-and-india-data/
//        //rapidapi setup:
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create("https://visual-crossing-weather.p.rapidapi.com/history?startDateTime=2019-01-01T00%3A00%3A00&aggregateHours=24&location=San%20Diego%2C%20California%2C%20USA&endDateTime=2019-01-03T00%3A00%3A00&unitGroup=us&dayStartTime=8%3A00%3A00&contentType=csv&dayEndTime=17%3A00%3A00&shortColumnNames=0"))
//                .header("x-rapidapi-host", "visual-crossing-weather.p.rapidapi.com")
//                .header("x-rapidapi-key", "e2ec6cd693msh31f1d4d692bd6b0p1dcb11jsn9ee520fd4398")
//                .method("GET", HttpRequest.BodyPublishers.noBody())
//                .build();
//        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
////        System.out.println(response.body());
//
//
////        //alternative #1: convert response.body() to java hash map
//        var weatherStats = new ObjectMapper().readValue(response.body(), HashMap.class);
////
////        //pass stats to view
//        model.addAttribute("weatherStats", weatherStats);
////        model.addAttribute("world_map", map.get("world_total")); //illustrative of map get
//
//
//        return "/AboutUs/aboutcalvin";
//    }

}

