package com.example.sping_portfolio.controllers.API.SearchAPI;

import java.util.Comparator;

public class RatingComparator implements Comparator<String[]> {
    public int compare(String[] a, String[] b) {
        if (Float.parseFloat(a[3]) < Float.parseFloat(b[3])) {
            return 1;
        } else if (Float.parseFloat(a[3]) > Float.parseFloat(b[3])) {
            return -1;
        }

        return 0;
    }
}