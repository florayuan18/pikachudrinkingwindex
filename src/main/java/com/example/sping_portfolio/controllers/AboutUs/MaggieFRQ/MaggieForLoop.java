/*
Maggie Killada
AP CSA FRQ #6
 */

package com.example.sping_portfolio.controllers.AboutUs.MaggieFRQ;

public class MaggieForLoop {
    public static void main(String[] args) {
        String words[] = {"ten", "fading", "post", "card", "thunder", "hinge", "trailing", "batting"};
        for (String i : words) {
            if (i.endsWith("ing")) {
                System.out.println(i);
            }
        }
    }
}
