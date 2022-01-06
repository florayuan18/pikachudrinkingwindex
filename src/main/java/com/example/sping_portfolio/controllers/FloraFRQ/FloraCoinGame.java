package com.example.sping_portfolio.controllers.FloraFRQ;

public class FloraCoinGame {

    public void FloraCoinGame() {
    }


/** Plays a simulated game between two players, as described in part (b). */
/*Notes:
	Both players will start with same number of coins
	Code section to determine winner
*/

        int p1coins = startingCoins; // don’t use s because it’s attribute
        int p2coins = startingCoins;
        int round = 1;

        int p1spend; // determining how much player 1 spends
        int p2spend; // determining how much player 2 spends

        /* conditions for the game to be played continually
         */
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

        /* determining the winner*/

        if (p1coins == p2coins)
            System.out.println("tie game");
        else if (p1coins > p2coins)
            System.out.println("player 1 Wins");
        else
            System.out.println("player 2 Wins");


    public static void main(String [] args) {
        int p1coins = startingCoins; // don’t use s because it’s attribute
        int p2coins = startingCoins;
        int round = 1;

        int p1spend; // determining how much player 1 spends
        int p2spend; // determining how much player 2 spends

        /* conditions for the game to be played continually
         */
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

        /* determining the winner*/

        if (p1coins == p2coins)
            System.out.println("tie game");
        else if (p1coins > p2coins)
            System.out.println("player 1 Wins");
        else
            System.out.println("player 2 Wins");
    }
}