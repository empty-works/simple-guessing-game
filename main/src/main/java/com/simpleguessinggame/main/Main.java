package com.simpleguessinggame.main;

public class Main {
    public static void main(String[] args) {
        // Ask user to select difficulty level with a menu
        int level = LevelGenerator.get();
        // upperLimit = com.simpleguessinggame.main.UpperLimitGenerator.getUpperLimit(level)
        int upperLimit = UpperLimitGenerator.getUl(level);
        // answer = com.simpleguessinggame.main.NumberGenerator.getAnswer(upperLimit)
        int answer = NumberGenerator.get(upperLimit);
        // Gameplay time.
        // int finalAnswer =
        // Ask user if they would like to try again.
    }
}