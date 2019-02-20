package com.chess;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PositionTest {
    private Position position;

    @Before
    public void setUp() {
        position = new Position(5, 5);
    }

    @Test
    public void shouldMoveVerticallyUp() {
        assertEquals(position.moveVerticalUp(1).getVertical(), 6);
    }

    @Test
    public void shouldMoveVerticallyDown() {
        assertEquals(position.moveVerticalDown(1).getVertical(), 4);
    }

    @Test
    public void shouldMoveHorizontallyForward() {
        assertEquals(position.moveHorizontalForward(1).getHorizontal(), 6);
    }

    @Test
    public void shouldMoveHorizontallyBack() {
        assertEquals(position.moveHorizontalBackward(1).getHorizontal(), 4);
    }

    @Test
    public void shouldMoveDiagonallyInAllDirection() {
        assertEquals(position.moveDiagonally(1).size(), 4);
    }

    @Test
    public void shouldNotMoveVerticallyUpIfGoingAboveTopPosition() {
        assertEquals(position.moveVerticalUp(4).getVertical(), 5);
    }
}