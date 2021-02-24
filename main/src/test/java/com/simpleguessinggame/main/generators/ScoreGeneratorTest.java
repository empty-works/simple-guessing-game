package com.simpleguessinggame.main.generators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScoreGeneratorTest {

    @Test
    void calculateScore() {
        int expectedScore = 900;
        int resultingScore = ScoreGenerator.calculateScore(33, 44, 3, 750);
        Assertions.assertEquals(expectedScore, resultingScore);
    }
}