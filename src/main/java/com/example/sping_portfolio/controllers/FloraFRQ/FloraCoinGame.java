package com.example.sping_portfolio.controllers.FloraFRQ;

import java.util.Scanner;
import static java.lang.Math.abs;

public class FloraCoinGame {
    int startingCoins; // starting number of coins
    int maxRounds; // maximum number of rounds played
    int p1coins = startingCoins; // don’t use s because it’s attribute
    int p2coins = startingCoins;
    int round = 1;

    int p1spend; // determining how much player 1 spends
    int p2spend; // determining how much player 2 spends

    /* conditions for the game to be played continually */
    public int getPlayer1Move(){
        return (int) (Math.random() * 3) + 1;
    }
    public int getPlayer2Move(int round){
        if(round % 3 == 0) return 3;
        if(round % 2 == 0) return 2;
        return 1;
    }

    public String Moves() {
        while (round <= maxRounds && p1coins >= 3 && p2coins >= 3) {
            p1spend = getPlayer1Move(); // no parameter for this one
            p2spend = getPlayer2Move(round); // round number included

            p1coins = p1spend; // coins spent in round
            p2coins = p2spend; // coins spent in round

            if (p2spend == p1spend)
                p2coins++;
            else if (Math.abs(p2spend - p1spend) == 1) // difference is 1
                p2coins++;
            else
                p1coins += 2;
            round++; // increment round
        }

        /* determining the winner */
            if (p1coins == p2coins)
                return "tie game";
            else if (p1coins > p2coins)
                return "player 1 Wins";
            else
                return "player 2 Wins";
        }
    }
/*    public void main(String[] args) {
        int p1coins = startingCoins; // don’t use s because it’s attribute
        int p2coins = startingCoins;
        int round = 1;

        int p1spend; // determining how much player 1 spends
        int p2spend; // determining how much player 2 spends
    } */