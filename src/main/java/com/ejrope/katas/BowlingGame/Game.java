package com.ejrope.katas.BowlingGame;

public class Game {
    private int[] rolls = new int[21];
    private int currentRoll = 0;

    public void roll(int pins) {
        rolls[currentRoll] = pins;
        currentRoll++;
    }

    public int score() {
        int score = 0;
        int rollIndex = 0;

        for (int frame = 0; frame < 10; frame++) {
            if (isSpare(rollIndex)) {
                score += basicScore(rollIndex) + rolls[rollIndex + 2];
            } else {
                score += basicScore(rollIndex);
            }
            rollIndex += 2;
        }
        return score;
    }

    private int basicScore(int rollIndex) {
        return rolls[rollIndex] + rolls[rollIndex + 1];
    }

    private boolean isSpare(int rollIndex) {
        return rolls[rollIndex] + rolls[rollIndex + 1] == 10;
    }
}
