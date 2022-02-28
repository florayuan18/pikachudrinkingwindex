package com.example.sping_portfolio.controllers.AboutUs.CrystalFRQ;

public class CrystalLightSequence {
    private String resultSeq;
    private String seq;
    private Double distance;

    //sets initial value? kinda redundant
    public CrystalLightSequence(String seq)
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

    public String removeSegment(String seggy) {
//        i = 0;
        return(seq.replace(seggy,""));
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
        CrystalLightSequence gradShow = new CrystalLightSequence("0101 0101 0101");
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
