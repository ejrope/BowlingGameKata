package com.ejrope.katas.BowlingGame;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    @Test
    public void testCanCreateGame() {
        Game game = new Game();
    }

    @Test
    public void testGutterGame() {
        Game game = new Game();

        for (int i = 0; i < 20; i++) {
            game.roll(0);
        }
        assertEquals(0, game.score());
    }
}