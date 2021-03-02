package com.simpleguessinggame.main.gameplay;
import com.simpleguessinggame.main.generators.ScoreGenerator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessHandler {
    // Check if guess matches answer
    public static int getFinalScore(int answer) {
        int INVALID = -1;
        int currentScore = 0;
        Scanner scan = new Scanner(System.in);
        int userGuess = INVALID;
        boolean isCorrect = false;

        // TODO: Get number of lives from lives handler
        // TODO: Figure out what to return to main from here
        int numLives

        while(!isCorrect) {
            try {
                userGuess = scan.nextInt();
                scan.nextLine();
                if(userGuess == answer) isCorrect = true;
                else {
                    currentScore = ScoreGenerator.calculateScore(userGuess, answer, );
                }
            }
            catch(InputMismatchException ime) {

            }
        }
    }
}