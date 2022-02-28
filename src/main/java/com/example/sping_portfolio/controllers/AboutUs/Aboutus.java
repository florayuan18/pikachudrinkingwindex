package com.example.sping_portfolio.controllers.AboutUs;

import com.example.sping_portfolio.controllers.AboutUs.CalvinAboutMVC.CalvinFRQ.FRQ_2.LightSequence;
import com.example.sping_portfolio.controllers.AboutUs.CalvinAboutMVC.CalvinFRQ.FRQ_3.FRQ3_P1;
import com.example.sping_portfolio.controllers.AboutUs.CalvinAboutMVC.CalvinFRQ.FRQ_4.Streak;
import com.example.sping_portfolio.controllers.AboutUs.MaggieFRQ.*;
import com.fasterxml.jackson.databind.ObjectMapper;
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
import java.util.HashMap;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class Aboutus {
    @GetMapping("/aboutus")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String aboutus() {
        return "aboutus"; // returns HTML VIEW (greeting)
    }


    // About Flora CTRL
    @GetMapping("AboutUs/aboutflora")
    public String TableCTRL(@RequestParam(name="seq", required=false, defaultValue= "") String seq,
                            @RequestParam(name="changeSeq", required=false, defaultValue= "") String changeSeq,
                            @RequestParam(name="insertSeq", required=false, defaultValue="") String insertSeq,
                            @RequestParam(name="insertSeqLoc", required=false, defaultValue="0") int insertSeqLoc,
                            @RequestParam(name="removeSeq", required=false, defaultValue="") String removeSeq,
                            @RequestParam(name="xDist", required=false, defaultValue="0") int xDist,
                            @RequestParam(name="yDist", required=false, defaultValue="0") int yDist,
                            @RequestParam(name="rsvp", required=false, defaultValue="false") Boolean rsvp,
                            @RequestParam(name="food", required=false, defaultValue="0") int food,
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

        return "AboutUs/aboutflora";
    }

    // About Kira CTRL
    @GetMapping("AboutUs/aboutkira2")
    public String TableCTRL() {

        boolean rsvp = true;
        int selection = 1;
        String option1 = "";
        String option2 = "";

        if (rsvp) {
            System.out.println("Attending");
        } else {
            System.out.println("Not attending");
        }

        if (selection == 1) {
            System.out.println("beef");
        } else if (selection == 2) {
            System.out.println("chicken");
        } else if (selection == 3) {
            System.out.println("pasta");
        } else {
            System.out.println("fish");
        }

        if (rsvp && selection == 1) {
            option1 = "Thanks for attending.You will be served beef.";
        }
        if (rsvp && selection == 2) {
            option1 = "Thanks for attending.You will be served chicken.";
        }
        if (rsvp && selection == 1) {
            option1 = "Thanks for attending.You will be served pasta.";
        } else if (rsvp) {
            option1 = "Thanks for attending.You will be served fish.";
        } else {
            option1 = "Sorry you couldn't make it";
        }

        if (option1.equals(option2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        return "/AboutUs/aboutkira2";
    }

    // About Calvin CTRL
    @Controller
    public static class AboutCalvinCTRL {
        @GetMapping("AboutUs/aboutcalvin")
        public String TableCTRL(@RequestParam(name="seq", required=false, defaultValue= "") String seq,
                                @RequestParam(name="changeSeq", required=false, defaultValue= "") String changeSeq,
                                @RequestParam(name="insertSeq", required=false, defaultValue="") String insertSeq,
                                @RequestParam(name="insertSeqLoc", required=false, defaultValue="0") int insertSeqLoc,
                                @RequestParam(name="removeSeq", required=false, defaultValue="") String removeSeq,
                                @RequestParam(name="xDist", required=false, defaultValue="0") int xDist,
                                @RequestParam(name="yDist", required=false, defaultValue="0") int yDist,
                                @RequestParam(name="rsvp", required=false, defaultValue="false") Boolean rsvp,
                                @RequestParam(name="food", required=false, defaultValue="0") int food,
                                @RequestParam(name="rsvp2", required=false, defaultValue="false") Boolean rsvp2,
                                @RequestParam(name="food2", required=false, defaultValue="0") int food2,
                                @RequestParam(name="word", required=false, defaultValue="") String word,
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

            String foodcheck = "";
            FRQ3_P1 John = new FRQ3_P1();
            String rsv = John.didUrsvp(rsvp, food);
            String rsv2 = John.didUrsvp(rsvp2, food2);
            foodcheck = John.foodsCheck();

            model.addAttribute("rsv", rsv);
            model.addAttribute("rsv2", rsv2);
            model.addAttribute("foodcheck", foodcheck);

            Streak phrase = new Streak();
            String word_output = phrase.longestStreak(word);

            model.addAttribute("word_output", word_output);

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
            return "AboutUs/aboutcalvin";
        }

    // Maggie's About CTRL
    @GetMapping("AboutUs/aboutmaggie")
    public String aboutmaggie(@RequestParam(name="seq", required=false, defaultValue="000000000000") String seq,
                              @RequestParam(name="insseq", required=false, defaultValue="1111") String insseq,
                              @RequestParam(name="idx" , required=false, defaultValue="4") int idx,
                              @RequestParam(name="remseq" , required=false, defaultValue="11") String remseq,
                              @RequestParam(name="attendance" , required=false, defaultValue="false") Boolean attendance,
                              @RequestParam(name="food" , required=false, defaultValue="1") int food,
                              @RequestParam(name="word" , required=false, defaultValue="GREET") String word,
                              @RequestParam(name="startingcoins" , required=false, defaultValue="10") int startingcoins,
                              @RequestParam(name="maxrounds" , required=false, defaultValue="5") int maxrounds,
                              @RequestParam(name="len" , required=false, defaultValue="4") int len,
                              @RequestParam(name="pref" , required=false, defaultValue="chs") String pref,
                              @RequestParam(name="hname" , required=false, defaultValue="Karen") String hname,
                              @RequestParam(name="guestname" , required=false, defaultValue="Cheryl") String guestname,
                              @RequestParam(name="address" , required=false, defaultValue="5678 Cashew Lane") String address,
                              @RequestParam(name="newaddress" , required=false, defaultValue="1234 Walnut Street") String newaddress,
                              @RequestParam(name="firstn" , required=false, defaultValue="mary") String firstn,
                              @RequestParam(name="lastn" , required=false, defaultValue="hart") String lastn,
                              @RequestParam(name="title" , required=false, defaultValue="Frankenstein") String title,
                              @RequestParam(name="author" , required=false, defaultValue="Mary Shelley") String author,
                              @RequestParam(name="titlep", required = false, defaultValue = "The Wonderful Wizard of Oz") String titlep,
                              @RequestParam(name="authorp", required = false, defaultValue = "TL. Frank Baum") String authorp,
                              @RequestParam(name="illustrator", required = false, defaultValue = "W.W. Denslow") String illustrator,
                              @RequestParam(name="number1" , required=false, defaultValue="30") int number1,
                              @RequestParam(name="number2" , required=false, defaultValue="3") int number2,
                              Model model) throws IOException, InterruptedException {
        //FRQ #2
        MaggieLightSequence gradShow = new MaggieLightSequence("010101010101");
        model.addAttribute("originalSequence", gradShow.display());
        gradShow.changeSequence(seq);
        model.addAttribute("changedSequence", gradShow.display());
        gradShow.insertSegment(insseq, idx);
        model.addAttribute("insertedSequence", gradShow.display());
        gradShow.removeSegment(remseq);
        model.addAttribute("removedSequence", gradShow.display());
        double x = gradShow.findDistance(3, 4);
        model.addAttribute("distance", x);
        //FRQ #3
        MaggieDinner myDinner = new MaggieDinner(attendance, food);
        myDinner.message1();
        model.addAttribute("message", myDinner.displayOption1());
        //FRQ #4
        MaggieLongestStreak myStreak = new MaggieLongestStreak();
        model.addAttribute("streakInfo", myStreak.longestStreak(word));
        MaggieCoinGame coingame = new MaggieCoinGame(startingcoins,maxrounds);
        model.addAttribute("gameresults", coingame.playGame());
        //FRQ #5
        MaggiePasswordGenerator pw1 = new MaggiePasswordGenerator(len, pref);
        model.addAttribute("genpassword",pw1.pwGen());
        model.addAttribute("passwordcount",pw1.pwCount());
        MaggieInvitation party = new MaggieInvitation(hname, address);
        model.addAttribute("hostname",party.displayHostName());
        model.addAttribute("message1",party.message(guestname));
        party.updateAddress(newaddress);
        model.addAttribute("message2",party.message(guestname));
        //FRQ #6
        MaggiePayroll maggiepayroll = new MaggiePayroll();
        maggiepayroll.computeWages(10.0, 1.5);
        maggiepayroll.printWages();
        model.addAttribute("bonusthreshold", maggiepayroll.computeBonusThreshold());
        //FRQ #7
        String[] used = {"harta", "hartm", "harty"};
        MaggieUsername person2 = new MaggieUsername(firstn, lastn);
        person2.setAvailableUserNames(used);
        model.addAttribute("usernames", person2.displayPossibleUsernames());
        //FRQ #8
        MaggieExperimentalFarm f = new MaggieExperimentalFarm();
        MaggiePlot highestYield = f.getHighestYield("corn");
        model.addAttribute("highestcornyield", highestYield.getCropYield());
        MaggiePlot highestYield1 = f.getHighestYield("peas");
        model.addAttribute("highestpeasyield", highestYield1.getCropYield());
        model.addAttribute("samecropcolumn1", f.sameCrop(0));
        model.addAttribute("samecropcolumn2", f.sameCrop(1));
        model.addAttribute("samecropcolumn3", f.sameCrop(2));
        //FRQ #9
        ArrayList<MaggieBook> myLibrary = new ArrayList<MaggieBook>();
        MaggieBook book1 = new MaggieBook(title, author);
        MaggieBook book2 = new MaggiePictureBook(titlep, authorp, illustrator);
        myLibrary.add(book1);
        myLibrary.add(book2);
        MaggieBookListing listing1 = new MaggieBookListing(book1, 10.99);
        model.addAttribute("bookone", listing1.printDescription());
        MaggieBookListing listing2 = new MaggieBookListing(book2, 12.99);
        model.addAttribute("booktwo", listing2.printDescription());
        //FRQ #10
        int gcfresult = MaggieNumberSystem.gcf(number1,number2);
        model.addAttribute("gcfresult", gcfresult);
        String reduceresult = MaggieNumberSystem.reduceFraction(number1, number2);
        model.addAttribute("reduceresult", reduceresult);
        return "AboutUs/aboutmaggie";
    }

}
}




