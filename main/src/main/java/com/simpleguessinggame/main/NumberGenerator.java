package com.simpleguessinggame.main;

import java.util.Random;

public class NumberGenerator {
    public static int get(int upperLimit) {
        Random random = new Random(upperLimit);
        int num = random.nextInt();
        return num;
    }
}