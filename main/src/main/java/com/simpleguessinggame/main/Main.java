package com.simpleguessinggame.main;

import com.simpleguessinggame.main.gameplay.LivesHandler;
import com.simpleguessinggame.main.generators.LevelGenerator;
import com.simpleguessinggame.main.generators.NumberGenerator;
import com.simpleguessinggame.main.generators.UpperLimitGenerator;

public class Main {
    public static void main(String[] args) {
        // Ask user to select difficulty level with a menu
        int level = LevelGenerator.get();
        // upperLimit = com.simpleguessinggame.main.generators.UpperLimitGenerator.getUpperLimit(level)
        int upperLimit = UpperLimitGenerator.getUl(level);
        // answer = com.simpleguessinggame.main.generators.NumberGenerator.getAnswer(upperLimit)
        int answer = NumberGenerator.get(upperLimit);
        // Number of lives.
        LivesHandler livesHandler = new LivesHandler(level);

        // Handle user's guess.

        // Ask user if they would like to try again.
    }
}