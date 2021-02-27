package com.simpleguessinggame.main.generators;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LevelGenerator {
        public static ArrayList<Integer> levels;
        public final static int NUM_LEVELS = 3;
        public static int get() {
                for(int i = 1; i <= NUM_LEVELS; i++) {
                        levels.add(i);
                        System.out.println("Level " + i);
                }
                System.out.println("Enter number of desired level:");
                Scanner levelInput = new Scanner(System.in);
                int level = 0;
                boolean isNumeric = false;
                while(!isNumeric) {
                        try {
                                level = levelInput.nextInt();
                                levelInput.nextLine();
                                if(level > 0 && level <= NUM_LEVELS) isNumeric = true;
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