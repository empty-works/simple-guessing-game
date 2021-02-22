import java.util.InputMismatchException;
import java.util.Scanner;

public class LevelGenerator {
        public static int get() {
                System.out.println("Enter number of desired level:");
                System.out.println("1. Easy");
                System.out.println("2. Medium");
                System.out.println("3. Hard");
                // level = user enters a corresponding number
                Scanner levelInput = new Scanner(System.in);
                int level = 0;
                boolean isNumeric = false;
                while(!isNumeric) {
                        try {
                                level = levelInput.nextInt();
                                isNumeric = true;
                        }
                        catch (InputMismatchException ime) {
                                System.out.println("Must be a number!");
                                levelInput.nextLine(); // Advance the scanner
                        }
                }
                return level;
        }
}