package com.company;

import java.util.Dictionary;

public class Tester {
    public static void main(String[] args) {
        //through a dice 24 times
        int rounds =0;
        int wins = 0;
        while(rounds<100) {
            for (int i = 1; i <= 24; i++) { // through a die 24 times
                System.out.println(">> t " + i + " r "+rounds); // print the round and attempt
                System.out.println((rounds*24)+i); // count all rolls
                if(Dice.through2Dice()){ // this through a pair of dice (return true if simelar)
                    System.out.println("🎲✔✔ WELL DONE");
                    wins++;
                }
                System.out.println("==========");
            }
            rounds++;
            System.out.println("rounds :" + rounds);
        }
        System.out.println("wins is" + wins);

    }
}
