package com.simpleguessinggame.main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotWarmColdHelperTest {

    @Test
    void getHotWarmColdScore() {
        HotWarmColdHelper help = new HotWarmColdHelper();
        int hotScore = help.getHotWarmColdScore(20, 22);
        int expectedHotScore = 300;
        Assertions.assertEquals(expectedHotScore, hotScore);

    }

    @Test
    void getHotWarmColdMessage() {
    }
}