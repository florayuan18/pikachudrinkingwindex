package com.example.sping_portfolio.controllers;
/* MVC code that shows defining a simple Model, calling View, and this file serving as Controller
 * Web Content with Spring MVCSpring Example: https://spring.io/guides/gs/serving-web-con
 */

import com.example.sping_portfolio.LightSequence;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class AboutKira {
    @GetMapping("/aboutkira")    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String greeting(@RequestParam(name="sequence", required=false, defaultValue="World") String name, Model model) {
        // @RequestParam handles required and default values, name and model are class variables, model looking like JSON
        model.addAttribute("sequence", sequence); // MODEL is passed to html
        return "aboutkira"; // returns HTML VIEW (greeting)
    }

    String sequence = "";

    public AboutKira(String seq)
    {
        sequence = seq;
    }

    public void display(){
        System.out.println("The light sequence is " + this.sequence);
    }

    public void changeSequence(String seq)
    {
        this.sequence = seq;
    }

    public String insertSegment(String segment, int ind)
    {
        String newSequence = this.sequence.substring(0, ind + 1)
                + segment
                + this.sequence.substring(ind + 1);

        return newSequence;

    }

    public static String newSequence(String oldSeq, String segment){
        int index = oldSeq.indexOf(segment);
        String newSeq = oldSeq.substring(0, index) + oldSeq.substring(index + segment.length());

        return newSeq;
    }

    public static int squareRoot(double a, double b){
        double root = (Math.sqrt(a*a + b*b));
        return (int)root;
    }


    public static void main(String args[])
    {
        AboutKira gradshow = new AboutKira("0101 0101 0101");
        gradshow.display();

        gradshow.changeSequence("0011 0011 0011");
        gradshow.display();

        System.out.println(gradshow.insertSegment("1111 1111", 4));
        System.out.println(newSequence("1100000111", "11"));
        System.out.println(squareRoot(4, 0));
    }
}