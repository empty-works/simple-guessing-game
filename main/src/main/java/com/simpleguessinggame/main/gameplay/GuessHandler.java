package com.simpleguessinggame.main.gameplay;
import com.simpleguessinggame.main.generators.LivesGenerator;
import com.simpleguessinggame.main.generators.ScoreGenerator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessHandler {
    // Check if guess matches answer
    public static GuessResultsContainer getResults(int answer, int level) {

        // TODO: Get number of lives from lives handler
        // TODO: Figure out what to return to main from here
        int maxNumLives = LivesGenerator.getNumLives(level);
        return getResultsHelper(maxNumLives, answer);
    }

    private static GuessResultsContainer getResultsHelper(int maxNumLives, int answer) {
        int INVALID = -1;
        int currentScore = 0;
        Scanner scan = new Scanner(System.in);
        int userGuess = INVALID;
        boolean isCorrect = false;
        GuessResultsContainer grc = new GuessResultsContainer(maxNumLives);
        while(!isCorrect) {
            try {
                userGuess = scan.nextInt();
                scan.nextLine();
                if(userGuess == answer) isCorrect = true;
                else {
                    currentScore = ScoreGenerator.calculateScore(
                            userGuess, answer, maxNumLives, currentScore);
                }
            }
            catch(InputMismatchException ime) {

            }
        }
    }
}