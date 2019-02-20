package com.chess;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class QueenTest {

    @Test
    public void shouldReturnAllPossibleForQueens() {
        Queen queen = new Queen(new Position(4, 5));
        List<Position> positions = queen.possibleMoves();

        positions.forEach(it -> System.out.println(it.getHorizontal() + "," + it.getVertical()));

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
                new Position(8, 5),
                new Position(5, 4),
                new Position(3, 6),
                new Position(3, 4),
                new Position(5, 6),
                new Position(6, 3),
                new Position(2, 7),
                new Position(2, 3),
                new Position(6, 7),
                new Position(7, 2),
                new Position(1, 8),
                new Position(1, 2),
                new Position(7, 8),
                new Position(8, 1));

        assertEquals(positions.size(), expected.size());
        assertArrayEquals(positions.toArray(), expected.toArray());
    }
}