/*
Maggie Killada
AP CSA FRQ #4
 */

package com.example.sping_portfolio.controllers.MaggieFRQ;

public class MaggieCoinGame {
    private int startingCoins; // starting number of coins
    private int maxRounds; // maximum number of rounds played
    private int p1coins;
    private int p2coins;

    public MaggieCoinGame(int s, int r) {
        startingCoins = s;
        maxRounds = r;
        p1coins = p2coins = startingCoins;
    }

    // conditions for the game to be played continually
    public int getPlayer1Move(){
        return (int) (Math.random() * 3) + 1;
    }

    public int getPlayer2Move(int round){
        if(round % 3 == 0) return 3;
        if(round % 2 == 0) return 2;
        return 1;
    }

    public String playGame() {
        int round = 1;
        int p1spend = getPlayer1Move();
        int p2spend = getPlayer2Move(round);

        //while loop for game conditions
        while (round <= maxRounds && p1coins >= 3 && p2coins >= 3) {
            if (p2spend == p1spend)
                p2coins++;
            else if (Math.abs(p2spend - p1spend) == 1) // difference is 1
                p2coins++;
            else
                p1coins += 2;

            // increment and get new moves for new round
            round++;
            p1spend = getPlayer1Move();
            p2spend = getPlayer2Move(round);
        }

        // determining the winner
        if (p1coins == p2coins)
            return "tie game";
        else if (p1coins > p2coins)
            return "player 1 Wins";
        else
            return "player 2 Wins";
    }
}