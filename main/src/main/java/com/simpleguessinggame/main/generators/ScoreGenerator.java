package com.simpleguessinggame.main.generators;

public class ScoreGenerator {
    public static int calculateScore(int answer, int userGuess, int numLives, int oldScore) {
        int newScore = 0;
        int proxScore = getProximityScore(answer, userGuess);

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
            // User's guess is cold.
            else return 0;
        }
        // User gets correct answer
        else return 450;
    }

    private static int getLivesScore(int numLives) {
        // More lives means a score accumulating with each guess.
        return numLives * 5;
    }
}
