package com.ejrope.katas.BowlingGame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    private Game game;

    @Before
    public void setUp() throws Exception {
        game = new Game();
    }

    @Test
    public void testGutterGame() {
        rollMany(20,0);
        assertEquals(0, game.score());
    }

    @Test
    public void testAllOnes() {
        rollMany(20,1);
        assertEquals(20, game.score());
    }

    @Test
    public void testOneSpare() {
        rollSpare();
        game.roll(7);
        rollMany(17,0);
        assertEquals(24, game.score());
    }

    @Test
    public void testFalseSpare() {
        game.roll(0);
        rollSpare();
        game.roll(7);
        rollMany(16,0);
        assertEquals(17, game.score());
    }

    @Test
    public void testOneStrike() {
        game.roll(10);
        game.roll(4);
        game.roll(3);
        rollMany(18,0);
        assertEquals(24, game.score());
    }

    private void rollMany(int rolls, int pins) {
        for (int i = 0; i < rolls; i++) {
            game.roll(pins);
        }
    }

    private void rollSpare() {
        game.roll(5);
        game.roll(5);
    }
}
