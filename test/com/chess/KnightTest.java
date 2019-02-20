package com.chess;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class KnightTest {

    @Test
    public void shouldReturnAllPossibleMovesForKnight() {
        Knight knight = new Knight(new Position(5, 3));
        List<Position> positionList = knight.possibleMoves();

        List<Position> expected = Arrays.asList(new Position(7, 4),
                new Position(7, 2),
                new Position(3, 4),
                new Position(3, 2),
                new Position(6, 5),
                new Position(4, 5),
                new Position(6, 1),
                new Position(4, 1));

        assertEquals(positionList.size(), expected.size());
        assertArrayEquals(positionList.toArray(), expected.toArray());
    }
}