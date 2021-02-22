import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ask user to select difficulty level with a menu
        int level = LevelGenerator.get();
        // upperLimit = UpperLimitGenerator.getUpperLimit(level)
        int upperLimit = UpperLimitGenerator.getUl(level);
        System.out.println(upperLimit);
        // answer = NumberGenerator.getAnswer(upperLimit)
        // Ask user to guess number from 0 to upperLimit
        // Let user enter number
        // Tell user whether right or wrong. If right, congratulate. If wrong, try again.
        // If trying again, let user enter another guess.
        // Show whether the user is above or below the guess. Also, show if close or not.
        // Regardless, in the end calculate user's score.
    }
}