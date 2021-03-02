package com.simpleguessinggame.main.gameplay;

// Stores all user guesses, number of lives left and scores
public class GuessResultsContainer {
    private int numLives = 0;
    private int counter = 0;
    private int[] guesses;

    public GuessResultsContainer(int numLives) {
        this.numLives = numLives;
    }

    public void addGuessLivesLeftScore(int guess, int livesLeft, int Score) {
        guesses[counter] = guess;
    }
}
