package com.simpleguessinggame.main.generators;

import com.simpleguessinggame.main.HotWarmColdHelper;

public class ScoreGenerator {
    public static int calculateScore(int userGuess, int answer, int numLives, int oldScore) {
        int proximityScore = getProximityScore(userGuess, answer);
        int livesScore = getLivesScore(numLives);
        return oldScore + proximityScore + livesScore;
    }

    private static int getProximityScore(int userGuess, int answer) {
        HotWarmColdHelper help = new HotWarmColdHelper();
        return help.getHotWarmColdScore(userGuess, answer);
    }

    private static int getLivesScore(int numLives) {
        // More lives means a score accumulating with each guess.
        return numLives * 50;
    }
}