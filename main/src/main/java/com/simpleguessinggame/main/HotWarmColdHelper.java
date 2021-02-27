package com.simpleguessinggame.main;

public class HotWarmColdHelper {
    final int BINGO = 0, HOT = 3, WARMER = 7, WARM = 10;
    final static String HOT_MESSAGE = "Red hot! You're very close.";
    final static String WARMER_MESSAGE = "Getting warmer. Pretty close.";
    final static String WARM_MESSAGE = "Getting warm now...";
    final static String COLD_MESSAGE = "Brrr, cold. Not even close.";

    public int getHotWarmColdScore(int userGuess, int answer) {
        int difference = Math.abs(userGuess - answer);
        if(difference != BINGO) {
            if(difference <= HOT) {
                return 300;
            }
            if(difference <= WARMER) {
                return 150;
            }
            if(difference <= WARM) {
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
                sb.append(HOT_MESSAGE);
            }
            if(difference <= WARMER) {
                sb.append(WARMER_MESSAGE);
            }
            if(difference <= WARM) {
                sb.append(WARM_MESSAGE);
            }
            // User's guess is cold.
            else {
                sb.append(COLD_MESSAGE);
            }
        }
        else sb.append("Correct!");

        if(isPositive) sb.append(" Your guess is too high.");
        else sb.append(" Your guess is too low.");
        // User gets correct answer
        return sb.toString();
    }
}