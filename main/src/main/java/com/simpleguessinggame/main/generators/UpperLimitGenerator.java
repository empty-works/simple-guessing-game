package com.simpleguessinggame.main.generators;

public class UpperLimitGenerator {
    public static int getUl(int level) {
        switch(level) {
            case 1: return 20;
            case 2: return 40;
            case 3: return 70;
            default: return 30;
        }
    }
}