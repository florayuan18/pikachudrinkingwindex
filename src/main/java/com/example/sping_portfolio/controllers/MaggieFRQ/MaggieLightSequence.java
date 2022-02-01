/*
Maggie Killada
AP CSA FRQ #2
 */

package com.example.sping_portfolio.controllers.MaggieFRQ;

//light sequence class
public class MaggieLightSequence {
    //private instance variables
    private String oldSeq;

    //overloaded constructor
    public MaggieLightSequence(String seq) {
        this.oldSeq = seq;
    }

    //inserts "segment" into position "ind"
    public String insertSegment(String segment, int ind){
        String resultSeq = oldSeq.substring(0,ind) + segment + oldSeq.substring(ind);
        this.oldSeq = resultSeq;
        return(resultSeq);
    }

    //changes the sequence
    public void changeSequence(String seq) {
        this.oldSeq = seq;
    }

    //display method
    public String display(){
        return oldSeq;
    }

    //removes first instance of segment
    public String removeSegment(String segment) {
        int index = oldSeq.indexOf(segment);
        String newSeq = oldSeq.substring(0, index) + oldSeq.substring(index + segment.length());
        this.oldSeq = newSeq;
        return oldSeq;
    }

    //finds distance between point A and point B
    public double findDistance(double a, double b) {
        return Math.sqrt(a*a + b*b);
    }

/*
    //method call
    public static void main(String [] args) {
        MaggieLightSequence gradShow = new MaggieLightSequence("0101 0101 0101");
        gradShow.display();
        gradShow.changeSequence("0011 0011 0011");
        gradShow.display();
        gradShow.insertSegment("1111 1111", 4);
        gradShow.display();
        double x = gradShow.findDistance(3, 4);
    }
*/
}
