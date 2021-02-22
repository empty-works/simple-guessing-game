import java.util.Scanner;

public class LevelGenerator {
        public static int get() {
                System.out.println("Enter number of desired level:");
                System.out.println("1. Easy");
                System.out.println("2. Medium");
                System.out.println("3. Hard");
                // level = user enters a corresponding number
                Scanner levelInput = new Scanner(System.in);
                int level = levelInput.nextInt();
                return level;
        }
}