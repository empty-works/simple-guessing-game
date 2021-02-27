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
        while(!isCorrect) {
            try {
                userGuess = scan.nextInt();
                scan.nextLine();
                if(userGuess == answer) isCorrect = true;
                else {
                    currentScore = ScoreGenerator.calculateScore()
                }
            }
            catch(InputMismatchException ime) {

            }
        }
    }

    private static void handleWrongGuess(int userGuess, int answer) {
        boolean isPositive = (userGuess - answer > 0) ? true : false;
        int difference = Math.abs(userGuess - answer);
        if(isPositive) System.out.println("Your guess is too high.");
        else System.out.println("Your guess is too low.");

    }
}