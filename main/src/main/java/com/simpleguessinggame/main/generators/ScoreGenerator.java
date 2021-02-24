package com.simpleguessinggame.main.generators;

public class ScoreGenerator {
    public static int calculateScore(int answer, int userGuess, int numLives, int oldScore) {

        return 0;
    }

    private static int getProximityScore(int answer, int userGuess) {
        int difference = answer - userGuess;
        int BINGO = 0, HOT = 3, WARM = 7;
        if(difference != BINGO) {
            if(difference <= HOT) {
                return 250;
            }
            if(difference <= WARM) {
                return 100;
            }
            else return 0;
        }
    }
}
