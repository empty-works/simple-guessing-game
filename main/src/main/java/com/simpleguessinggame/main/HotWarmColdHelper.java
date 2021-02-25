package com.simpleguessinggame.main;

public class HotWarmColdHelper {
    int BINGO = 0, HOT = 3, WARM = 7;

    public static int getHotWarmColdScore(int difference) {
        if (difference != BINGO) {
            if (difference <= HOT) {
                return 250;
            }
            if (difference <= WARM) {
                return 100;
            }
            // User's guess is cold.
            else {
                return 0;
            }
        }
        // User gets correct answer
        else return 450;
    }
}
