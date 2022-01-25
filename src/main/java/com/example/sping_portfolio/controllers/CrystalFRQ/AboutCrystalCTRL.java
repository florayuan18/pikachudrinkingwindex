package com.example.sping_portfolio.controllers.CrystalFRQ;

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
                            @RequestParam(name="attendance" , required=false, defaultValue="false") Boolean attendance,
                            @RequestParam(name="food" , required=false, defaultValue="1") int food,
                            @RequestParam(name="word" , required=false, defaultValue="GREET") String word,
                            @RequestParam(name="len" , required=false, defaultValue="4") int len,
                            @RequestParam(name="pref" , required=false, defaultValue="chs") String pref,
                            Model model)
    {

        String binaryC = "";

        CrystalLightSequence gradShow = new CrystalLightSequence(seq);
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

        //FRQ #3
        CrystalDinner myDinner = new CrystalDinner(attendance, food);
        myDinner.message1();
        model.addAttribute("message", myDinner.displayOption1());
        //FRQ #4
        CrystalLength myStreak = new CrystalLength();
        model.addAttribute("streakInfo", myStreak.crystalength(word));
        //FRQ #5
        CrystalPassword pw1 = new CrystalPassword(len, pref);
        model.addAttribute("genpassword",pw1.pwGen());
        model.addAttribute("passwordcount",pw1.pwCount());
        //FRQ #6
        CrystalPayroll crystalpayroll = new CrystalPayroll();
        model.addAttribute("bonusthreshold", crystalpayroll.computeBonusThreshold());
        return "/aboutcrystal";
    }
}

