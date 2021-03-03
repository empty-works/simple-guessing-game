package com.simpleguessinggame.main.gameplay;
import com.simpleguessinggame.main.generators.LivesGenerator;
import com.simpleguessinggame.main.generators.ScoreGenerator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessHandler {
    // Check if guess matches answer
    public static GuessResultsContainer getResults(int answer, int level) {
        int maxNumLives = LivesGenerator.getNumLives(level);
        return getResultsHelper(maxNumLives, answer);
    }

    private static GuessResultsContainer getResultsHelper(int maxNumLives, int answer) {
        int currentScore = 0;
        int numLives = maxNumLives;
        Scanner scan = new Scanner(System.in);
        int userGuess;
        boolean isDone = false;
        GuessResultsContainer grc = new GuessResultsContainer(maxNumLives);
        while(!isDone) {
            try {
                userGuess = scan.nextInt();
                scan.nextLine();
                if(userGuess == answer || numLives == 0) {
                    isDone = true;
                }
                currentScore = ScoreGenerator.calculateScore(
                        userGuess, answer, numLives, currentScore);
            }
            catch(InputMismatchException ime) {

            }
        }
        return grc;
    }
}