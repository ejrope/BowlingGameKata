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
            if (rolls[rollIndex] + rolls[rollIndex + 1] == 10) {
                score += rolls[rollIndex] + rolls[rollIndex + 1] + rolls[rollIndex + 2];
            } else {
                score += rolls[rollIndex] + rolls[rollIndex + 1];
            }
            rollIndex += 2;
        }
        return score;
    }
}
