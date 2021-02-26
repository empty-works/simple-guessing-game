package com.simpleguessinggame.main;

public class HotWarmColdHelper {
    final int BINGO = 0, HOT = 3, WARM = 7, WARMER = 11;

    public int getHotWarmColdScore(int userGuess, int answer) {
        int difference = Math.abs(userGuess - answer);
        if(difference != BINGO) {
            if(difference <= HOT) {
                return 300;
            }
            if(difference <= WARM) {
                return 150;
            }
            if(difference <= WARMER) {
                return 75;
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
        if(difference != BINGO) {
            if(difference <= HOT) {
                sb.append("Red hot! You're very close.");
            }
            if(difference <= WARM) {
                sb.append("Very warm. Pretty close.");
            }
            if(difference <= WARMER) {
                sb.append("Slightly warm now...");
            }
            // User's guess is cold.
            else {
                sb.append("Brrr, cold. Not even close.");
            }
        }
        else sb.append("Correct!");

        if(isPositive) sb.append(" Your guess is too high.");
        else sb.append(" Your guess is too low.");
        // User gets correct answer
        return sb.toString();
    }
}