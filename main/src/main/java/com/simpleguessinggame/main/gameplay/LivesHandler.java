package com.simpleguessinggame.main.gameplay;

public class LivesHandler {
    private int numLives = 0;
    // Number of lives should be set depending on the difficulty level.
    public LivesHandler(int level) {
        // Multiply the level by a percent to linearly increase number of lives.
        double numLivesDbl = level * 1.3;
        numLives = (int) numLivesDbl;
    }
}