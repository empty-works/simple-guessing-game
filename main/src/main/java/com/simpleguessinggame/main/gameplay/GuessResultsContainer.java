package com.simpleguessinggame.main.gameplay;

// Stores all user guesses, number of lives left and scores
public class GuessResultsContainer {
    private int counter = 0;
    private int[] guesses;
    private int livesLeft;
    private int[] scores;
    private int maxNumLives = 0;

    public GuessResultsContainer(int maxNumLives) {
        guesses = new int[maxNumLives];
        livesLeft = maxNumLives;
        scores = new int[maxNumLives];
        this.maxNumLives = maxNumLives;
    }

    public void addGuessLivesLeftScore(int guess, int livesLeft, int score) {
        guesses[counter] = guess;
        this.livesLeft = livesLeft;
        scores[counter] = score;
    }

    public int[] getGuesses() {
        return guesses;
    }

    public int getLivesLeft() {
        return livesLeft;
    }

    public int[] getScores() {
        return scores;
    }

    public int getNumGuess() {
        return maxNumLives - livesLeft;
    }
}