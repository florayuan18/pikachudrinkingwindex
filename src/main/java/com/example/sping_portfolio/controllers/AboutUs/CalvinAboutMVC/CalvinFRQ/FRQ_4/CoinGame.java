package com.example.sping_portfolio.controllers.AboutUs.CalvinAboutMVC.CalvinFRQ.FRQ_4;


import java.util.Scanner;

import static java.lang.Math.abs;

public class CoinGame
{

    private int startingCoins; // starting number of coins
    private int maxRounds; // maximum number of rounds played
    private int round;
    private int p1_move;
    private int p2_move;
    private int p1_bank;
    private int p2_bank;
    private int check;
//    private Sanner p1_move;



    public CoinGame(int s, int r)
    {

        startingCoins = s;

        maxRounds = r;

    }
    /** Returns the number of coins (1, 2, or 3) that player 1 will spend.

     */
    public int getPlayer1Move()

    {

        return (int) (Math.random() * 3) + 1;

    }



    /** Returns the number of coins (1, 2, or 3) that player 2 will spend, as described in part (a).

     */

    public int getPlayer2Move(int round)

    {

        if(round % 3 == 0) return 3;
        if(round % 2 == 0) return 2;
        return 1;

    }



    /** Plays a simulated game between two players, as described in part (b).

     */

    public void playGame()
    {
        p1_bank = startingCoins;
        p2_bank = startingCoins;
        round = 0;


        while (round < maxRounds) {
            System.out.println("Round " + (round + 1));

//            p1_move = getPlayer1Move();
            p2_move = getPlayer2Move(round);
            p1_move = -1;

            Scanner p1_moveSCN = new Scanner(System.in);

            while (p1_move >3 || p1_move <= 0){
                System.out.println("How much do you want to bet? 1-3");
                p1_move = Integer.parseInt(p1_moveSCN.nextLine());
            }



            p1_bank = p1_bank -  p1_move;
            p2_bank = p2_bank - p2_move;



            System.out.println("Player 1 has wagered " + p1_move);
            System.out.println("Player 2 has wagered " + p2_move);

//            same rule
            if (p1_move == p2_move) {
                p1_bank ++;
                System.out.println("Player 2 wins 1 coin!");
            }

//            off by one rule
            if (abs(p1_move - p2_move) == 1) {
                p2_bank ++;
                System.out.println("Player 2 wins 1 coin!");
            }

//            off by two rule
            if (abs(p1_move - p2_move) == 2) {
                p1_bank += 2;
                System.out.println("Player 1 wins 2 coins!");
            }
            round ++;

//          update banks
            System.out.println("player 1 has " + p1_bank + " in their bank");
            System.out.println("player 2 has " + p2_bank + " in their bank");

//          check for winner
            if (p1_bank <= 0) {
                break;
            }
            else if (p2_bank <= 0) {
                break;
            }

        }
//      win msg
            System.out.println();
            System.out.println();
            if (p1_bank > p2_bank) {
                System.out.println("Player 1 Wins!");
            } else if (p1_bank < p2_bank) {
                System.out.println("Player 2 Wins!");
            } else {
                System.out.println("It's a tie!");
            }


    }
    public static void main(String [] args)
    {
        if (!(2 != 2)){
            System.out.println("hello");
    }
//        CoinGame Game_1  = new CoinGame(10, 10);
//        Game_1.playGame();
    }

}
