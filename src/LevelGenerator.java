import java.util.InputMismatchException;
import java.util.Scanner;

public class LevelGenerator {
        public static int get() {
                System.out.println("1. Easy");
                System.out.println("2. Medium");
                System.out.println("3. Hard");
                System.out.println("Enter number of desired level:");
                Scanner levelInput = new Scanner(System.in);
                int level = 0;
                boolean isNumeric = false;
                while(!isNumeric) {
                        try {
                                level = levelInput.nextInt();
                                levelInput.nextLine();
                                if(level >= 1 && level <=3) isNumeric = true;
                                else System.out.println("Must be 1, 2 or 3!");
                        }
                        catch (InputMismatchException ime) {
                                System.out.println("Must be a number!");
                                levelInput.nextLine(); // Advance the scanner
                        }
                }
                return level;
        }
}