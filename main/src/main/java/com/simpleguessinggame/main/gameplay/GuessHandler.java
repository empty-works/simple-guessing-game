package com.simpleguessinggame.main.gameplay;
import com.simpleguessinggame.main.generators.LivesGenerator;
import com.simpleguessinggame.main.generators.ScoreGenerator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessHandler {
    // Check if guess matches answer
    public static GuessResultsContainer getResults(int level, int answer) {
        int maxNumLives = LivesGenerator.getNumLives(level);
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
                currentScore = ScoreGenerator.calculateScore(
                        userGuess, answer, numLives, currentScore);
                grc.addGuessLivesLeftScore(userGuess, numLives, currentScore);
                numLives--;
                if(userGuess == answer || numLives == 0) {
                    isDone = true;
                }
            }
            catch(InputMismatchException ime) {
                System.out.println("Must be a number!");
                scan.nextLine();
            }
        }
        return grc;
    }
}