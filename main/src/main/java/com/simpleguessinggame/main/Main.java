package com.simpleguessinggame.main;

public class Main {
    public static void main(String[] args) {
        // Ask user to select difficulty level with a menu
        int level = LevelGenerator.get();
        // upperLimit = com.simpleguessinggame.main.UpperLimitGenerator.getUpperLimit(level)
        int upperLimit = UpperLimitGenerator.getUl(level);
        // answer = com.simpleguessinggame.main.NumberGenerator.getAnswer(upperLimit)
        int answer = NumberGenerator.get(upperLimit);
        // Ask user to guess number from 0 to upperLimit
        // Let user enter number
        // Tell user whether right or wrong. If right, congratulate. If wrong, try again.
        // If trying again, let user enter another guess.
        // Show whether the user is above or below the guess. Also, show if close or not.
        // Regardless, in the end calculate user's score.
    }
}