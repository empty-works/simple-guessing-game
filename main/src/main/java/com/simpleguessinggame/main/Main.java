package com.simpleguessinggame.main;

import com.simpleguessinggame.main.gameplay.GuessHandler;
import com.simpleguessinggame.main.gameplay.GuessResultsContainer;
import com.simpleguessinggame.main.generators.LivesGenerator;
import com.simpleguessinggame.main.generators.LevelGenerator;
import com.simpleguessinggame.main.generators.NumberGenerator;
import com.simpleguessinggame.main.generators.UpperLimitGenerator;

public class Main {
    public static void main(String[] args) {
        // Ask user to select difficulty level with a menu
        int level = LevelGenerator.get();
        int upperLimit = UpperLimitGenerator.getUl(level);
        int answer = NumberGenerator.get(upperLimit);
        // Number of lives.
        LivesGenerator livesHandler = new LivesGenerator();
        int lives = livesHandler.getNumLives(level);
        // Handle user's guess.
        GuessResultsContainer grc = GuessHandler.getResults(level, answer);
        // Ask user if they would like to try again.

    }
}