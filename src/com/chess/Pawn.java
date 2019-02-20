package com.chess;

import java.util.Arrays;
import java.util.List;

class Pawn implements Piece {
    private static final int STEPS = 1;
    private Position position;

    Pawn(Position position) {
        this.position = position;
    }

    @Override
    public List<Position> possibleMoves() {
        return Arrays.asList(position.moveVerticalUp(STEPS), position.moveVerticalUp(STEPS + 1));
    }
}
