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
        int warmerScore = help.getHotWarmColdScore(20, 27);
        int expectedWarmerScore = 150;
        Assertions.assertEquals(expectedWarmerScore, warmerScore);
        int warmScore = help.getHotWarmColdScore(20, 30);
        int expectedWarmScore = 75;
        Assertions.assertEquals(expectedWarmScore, warmScore);
        int coldScore = help.getHotWarmColdScore(20, 33);
        int expectedColdScore = 0;
        Assertions.assertEquals(expectedColdScore, coldScore);
    }

    @Test
    void getHotWarmColdMessage() {
        HotWarmColdHelper help = new HotWarmColdHelper();
        String hotMessage = help.getHotWarmColdMessage(20, 22);
        String expectedHotMessage = HotWarmColdHelper.HOT_MESSAGE;
        Assertions.assertEquals(expectedHotMessage, hotMessage);
        String warmerMessage = help.getHotWarmColdMessage(20, 27);
        String expectedWarmerMessage = HotWarmColdHelper.WARMER_MESSAGE;
        Assertions.assertEquals(expectedWarmerMessage, warmerMessage);
        String warmMessage = help.getHotWarmColdMessage(20, 30);
        String expectedWarmMessage = HotWarmColdHelper.WARM_MESSAGE;
        Assertions.assertEquals(expectedWarmMessage, warmMessage);
        String coldMessage = help.getHotWarmColdMessage(20, 30);
        String expectedColdMessage = HotWarmColdHelper.COLD_MESSAGE;
        Assertions.assertEquals(expectedColdMessage, coldMessage);
    }
}