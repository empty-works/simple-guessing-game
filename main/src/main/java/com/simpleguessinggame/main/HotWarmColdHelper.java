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
        StringBuilder sb = new StringBuilder();
        int difference = Math.abs(userGuess - answer);
        boolean isPositive = (userGuess - answer > 0) ? true : false;
        if (difference != BINGO) {
            if (difference <= HOT) {
                sb.append("Red hot! You're very close.");
            }
            if (difference <= WARM) {
                sb.append("Warm. Your guess is pretty close.");
            }
            // User's guess is cold.
            else {
                sb.append("Brrr. Not even close.");
            }
        }
        else sb.append("Correct!");

        if(isPositive) sb.append(" Your guess is too high.");
        else sb.append(" Your guess is too low.");
        // User gets correct answer
        return sb.toString();
    }
}