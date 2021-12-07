package com.example.sping_portfolio;

public class LightSequence {
    String sequence = "";

    public LightSequence(String seq)
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
        LightSequence gradshow = new LightSequence("0101 0101 0101");
        gradshow.display();

        gradshow.changeSequence("0011 0011 0011");
        gradshow.display();

        System.out.println(gradshow.insertSegment("1111 1111", 4));
        System.out.println(newSequence("1100000111", "11"));
        System.out.println(squareRoot(4, 0));


    }

}
