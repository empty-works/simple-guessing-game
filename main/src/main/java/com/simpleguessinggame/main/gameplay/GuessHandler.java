package com.simpleguessinggame.main.gameplay;
import java.util.Scanner;

public class GuessHandler {
    // Check if guess matches answer
    public static boolean isFinalGuessRight(int answer) {
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
}
