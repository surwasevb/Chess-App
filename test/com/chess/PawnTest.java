package com.chess;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PawnTest {

    @Test
    public void shouldReturnAllPossibleMovesByPawn() {
        Pawn pawn = new Pawn(new Position(1, 1));
        List<Position> positions = pawn.possibleMoves();

        assertEquals(positions.size(), 2);
        assertEquals(positions.get(0).getVertical(), 2);
        assertEquals(positions.get(1).getVertical(), 3);
        assertEquals(positions.get(1).getHorizontal(), 1);
    }
}