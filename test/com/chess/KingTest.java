package com.chess;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class KingTest {

    @Test
    public void shouldReturnAllPossibleMovesForKing() {
        King king = new King(new Position(4, 5));
        List<Position> positions = king.possibleMoves();

        List<Position> expected = Arrays.asList(new Position(5, 5),
                new Position(3, 5),
                new Position(4, 6),
                new Position(4, 4),
                new Position(5, 4),
                new Position(3, 6),
                new Position(3, 4),
                new Position(5, 6));

        assertEquals(positions.size(), expected.size());
        assertArrayEquals(positions.toArray(), expected.toArray());
    }
}