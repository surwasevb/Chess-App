package com.chess;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BishopTest {

    @Test
    public void shouldReturnAllPossibleMovesForBishop() {

        Bishop bishop = new Bishop(new Position(2, 3));

        List<Position> positions = bishop.possibleMoves();
        List<Position> expected = Arrays.asList(new Position(3, 2),
                new Position(1, 4),
                new Position(1, 2),
                new Position(3, 4),
                new Position(4, 1),
                new Position(4, 5),
                new Position(5, 6),
                new Position(6, 7),
                new Position(7, 8));

        assertEquals(positions.size(), expected.size());
        assertArrayEquals(positions.toArray(), expected.toArray());

    }
}