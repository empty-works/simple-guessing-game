package com.simpleguessinggame.main.generators;

public class LivesGenerator {
    // Number of lives should be set depending on the difficulty level.
    public static int getNumLives(int level) {
        // Multiply the level by a percent to linearly increase number of lives.
        double numLivesDbl = level * 1.3;
        return (int) numLivesDbl;
    }
}