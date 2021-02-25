package com.simpleguessinggame.main;

import java.util.Scanner;

public class Gameplay {
    // Ask user to enter a guess. First guess is free.
    public static int start(int answer, int upperLimit) {
        int score = 0;
        System.out.println("Enter a guess from 0 to " + upperLimit);
        Scanner scan = new Scanner(System.in);
        int userGuess = scan.nextInt();
        scan.nextLine();

        return 0;
    }
    // Check if guess matches answer
    // If user correct, calculate score based on number lives left and how close each guess was.
    // If user incorrect, tell user if below answer or above and hot, warm or cold.
    // If user runs out of lives, then calculate scored based on how close each guess was.
    // Send final score back to the Main class.
}