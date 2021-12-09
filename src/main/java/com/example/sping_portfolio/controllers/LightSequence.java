package com.example.sping_portfolio.controllers;

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
    public void insertSegment(String segment, int ind)
    {
        resultSeq = seq.substring(0,ind) + segment + seq.substring(ind);
        seq = resultSeq;
    }
//removes first instance of segment
//seggy is the substring
    public void removeSegment(String seggy) {
        i = 0;
        while (i < seq.length()-seggy.length())
        {
            subby = seq.substring(i, i + seggy.length());

            if(seggy.equals(subby))
            {
                w1 = seq.substring(0,i);
                w2 = seq.substring(i + seggy.length());
                newSeq = w1 + w2;
                seq = newSeq;
                i = seq.length();
            }
            else
            {
                i++;
            }
        }
    }
//changes the sequence, kinda redundant with LightSequence
    public void changeSequence(String seq)
    {
        this.seq = seq;

    }
//removes spaces
    public void removeSpace()
    {
        seq = seq.replaceAll(" ","");
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
    public void distCalc(int xDist, int yDist)
    {
        distance = (Double) Math.sqrt(Math.pow(xDist, 2) + Math.pow(yDist, 2));
        System.out.println(distance);
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
        gradShow.removeSpace();
        gradShow.display();

        gradShow.distCalc(1,7);
    }
}
