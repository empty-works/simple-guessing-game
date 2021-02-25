package com.simpleguessinggame.main.gameplay;
import java.util.Scanner;

public class GuessHandler {
    // Check if guess matches answer
    public static int getFinalScore(int answer) {
        int INVALID = -1;
        Scanner scan = new Scanner(System.in);
        int userGuess = INVALID;
        boolean isNumeric = false;
        while(!isNumeric) {
            try {
                userGuess = scan.nextInt();
                scan.nextLine();
                if(userGuess == answer) isNumeric = true;

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
