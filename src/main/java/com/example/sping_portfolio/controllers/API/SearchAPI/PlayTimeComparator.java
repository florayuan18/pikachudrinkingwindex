package com.example.sping_portfolio.controllers.API.SearchAPI;

import java.util.Comparator;

public class PlayTimeComparator implements Comparator<String[]> {
    public int compare(String[] a, String[] b) {
        if (Float.parseFloat(a[4]) < Float.parseFloat(b[4])) {
            return 1;
        } else if (Float.parseFloat(a[4]) > Float.parseFloat(b[4])) {
            return -1;
        }

        return 0;
    }
}