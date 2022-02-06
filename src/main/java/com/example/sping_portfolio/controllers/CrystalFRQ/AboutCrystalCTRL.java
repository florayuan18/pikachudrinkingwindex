package com.example.sping_portfolio.controllers.CrystalFRQ;

import com.example.sping_portfolio.controllers.CrystalFRQ.FRQ_9.CrystalBookListing;
import com.example.sping_portfolio.controllers.CrystalFRQ.FRQ_9.CrystalPictureBook;

import com.example.sping_portfolio.controllers.MaggieFRQ.MaggieUsername;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AboutCrystalCTRL {
    @GetMapping("AboutUs/aboutcrystal")
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
                            @RequestParam(name="firstn" , required=false, defaultValue="mary") String firstn,
                            @RequestParam(name="lastn" , required=false, defaultValue="hart") String lastn,
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
        return "/AboutUs/aboutcrystal";
        //FRQ #7
//        String[] used = {"harta", "hartm", "harty"};
//        CrystalUser person2 = new CrystalUser(firstn, lastn);
//        person2.setAvailableUserNames(used);
//        model.addAttribute("usernames", person2.displayPossibleUsernames());
//        //FRQ #8
//
//        //FRQ #9
//        ArrayList<CrystalBook> myLibrary = new ArrayList<CrystalBook>();
//        CrystalBook book1 = new CrystalBook("Frankenstein", "Mary Shelley");
//        CrystalBook book2 = new CrystalPictureBook("The Wonderful Wizard of Oz", "L. Frank Baum", "W.W. Denslow");
//        myLibrary.add(book1);
//        myLibrary.add(book2);
//        CrystalBookListing listing1 = new CrystalBookListing(book1, 10.99);
//        model.addAttribute("bookone", listing1.printDescription());
//        CrystalBookListing listing2 = new CrystalBookListing(book2, 12.99);
//        model.addAttribute("booktwo", listing2.printDescription());
    }
}

