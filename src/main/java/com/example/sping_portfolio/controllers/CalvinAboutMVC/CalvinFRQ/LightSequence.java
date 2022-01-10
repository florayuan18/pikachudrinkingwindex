package com.example.sping_portfolio.controllers.CalvinAboutMVC.CalvinFRQ;

public class LightSequence
{
//initialize variables needed
    private String resultSeq;
    private String seq;
    private int i;
    private String subby;
    private String w1;
    private String w2;
    private String newSeq;
    private Double distance;

//sets initial value? kinda redundant
    public LightSequence(String seq)
    {
     this.seq = seq;
    }
//inserts "segment" into position "ind"
    public String insertSegment(String segment, int ind)
    {
        resultSeq = seq.substring(0,ind) + segment + seq.substring(ind);
        this.seq = resultSeq;
        return(resultSeq);
    }
//removes first instance of segment
//seggy is the substring
    public String removeSegment(String seggy) {
//        i = 0;
        return(seq.replace(seggy,""));
//        while (i < seq.length()-seggy.length())
//        {
//            subby = seq.substring(i, i + seggy.length());
//
//            if(seggy.equals(subby))
//            {
//
//
//                w1 = seq.substring(0,i);
//
//                w2 = seq.substring(i + seggy.length()-1);
//
//                newSeq = w1 + w2;
////                i = seq.length();
//                return(newSeq);
//            }
//            else
//            {
//                i++;
//            }
//        }

//        return("DNE");
    }
//changes the sequence, kinda redundant with LightSequence
    public String changeSequence(String seq)
    {
        this.seq = seq;
        return(seq);

    }

//Displays binary
    public void display()
    {
        System.out.println(seq);
    }
//Returns seq
    public String displayRet()
    {
        return(seq);
    }

    public Double distCalc(int xDist, int yDist)
    {
        distance = (Double) Math.sqrt(Math.pow(xDist, 2) + Math.pow(yDist, 2));
        return(distance);
    }
//lets me run the code and calls the methods
    public static void main(String [] args)
    {
        LightSequence gradShow = new LightSequence("0101 0101 0101");
        gradShow.changeSequence("0011 0011 0011");
        gradShow.insertSegment("1111 1111", 4);
        gradShow.insertSegment("gay", 4);
        gradShow.display();
        gradShow.removeSegment("gay");
        gradShow.display();
        gradShow.display();

        gradShow.distCalc(1,7);
    }
}
