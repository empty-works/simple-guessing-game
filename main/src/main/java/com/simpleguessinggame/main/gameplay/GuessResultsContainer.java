package com.simpleguessinggame.main.gameplay;

// Stores all user guesses, number of lives left and scores
public class GuessResultsContainer {
    private int counter = 0;
    private int[] guesses;
    private int[] livesLeft;
    private int[] scores;

    public GuessResultsContainer(int numLives) {
        guesses = new int[numLives];
        livesLeft = new int[numLives];
        scores = new int[numLives];
    }

    public void addGuessLivesLeftScore(int guess, int livesLeft, int Score) {
        guesses[counter] = guess;
    }
}
