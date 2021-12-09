package com.example.sping_portfolio.controllers;

import com.example.sping_portfolio.controllers.LightSequence;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Controller
public class FRQUNIT2 {
    @GetMapping("/aboutcalvin")
    public String FRQUNIT2(@RequestParam(name="input", required=false, defaultValue="" ) String input, Model model)
    {
        String binary = "";
        LightSequence gradShow = new LightSequence("0101 0101 0101");
        gradShow.changeSequence("0011 0011 0011");
        gradShow.insertSegment("1111 1111", 4);
        gradShow.insertSegment("111", 0);
        gradShow.removeSegment("1111 0011");

        binary = gradShow.displayRet();

        model.addAttribute("binary", binary);
        return "aboutcalvin";
    }
}



