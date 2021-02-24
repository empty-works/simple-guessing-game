package com.simpleguessinggame.main.generators;

public class ScoreGenerator {
    public static int calculateScore(int answer, int userGuess, int numLives, int oldScore) {
        int proximityScore = getProximityScore(answer, userGuess);
        int livesScore = getLivesScore(numLives);
        return oldScore + proximityScore + livesScore;
    }

    private static int getProximityScore(int answer, int userGuess) {
        int difference = Math.abs(answer - userGuess);
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
        return numLives * 50;
    }
}