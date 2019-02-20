package com.chess;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class RookTest {

    @Test
    public void shouldReturnAllPossibleMovesForRook() {
        Rook rook = new Rook(new Position(4,5));
        List<Position> positions = rook.possibleMoves();

        List<Position> expected = Arrays.asList(new Position(4, 1),
                new Position(1, 5),
                new Position(4, 2),
                new Position(2, 5),
                new Position(4, 3),
                new Position(3, 5),
                new Position(4, 4),
                new Position(5, 5),
                new Position(4, 6),
                new Position(6, 5),
                new Position(4, 7),
                new Position(7, 5),
                new Position(4, 8),
                new Position(8, 5));

        assertEquals(positions.size(),expected.size());
        assertArrayEquals(positions.toArray(), expected.toArray());
    }
}