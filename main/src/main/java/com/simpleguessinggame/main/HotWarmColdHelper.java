package com.simpleguessinggame.main;

public class HotWarmColdHelper {
    final int BINGO = 0, HOT = 3, WARM = 7;

    public int getHotWarmColdScore(int userGuess, int answer) {
        int difference = Math.abs(userGuess - answer);
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

    //TODO: include positive and negative difference values
    public String getHotWarmColdMessage(int userGuess, int answer) {
        if (difference != BINGO) {
            if (difference <= HOT) {
                return "Red hot! You're very close.";
            }
            if (difference <= WARM) {
                return "Warm. Your guess is pretty close.";
            }
            // User's guess is cold.
            else {
                return "Brrr. Not even close.";
            }
        }
        // User gets correct answer
        else return "Correct!";
    }
}