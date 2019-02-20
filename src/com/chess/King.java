package com.chess;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class King implements Piece {
    private static final int STEPS = 1;
    private Position position;

    King(Position position) {
        this.position = position;
    }

    @Override
    public List<Position> possibleMoves() {
        List<Position> listOfPositions = new ArrayList<>();

        listOfPositions.addAll(Arrays.asList(
                position.moveHorizontalForward(STEPS),
                position.moveHorizontalBackward(STEPS),
                position.moveVerticalUp(STEPS),
                position.moveVerticalDown(STEPS)));

        listOfPositions.addAll(position.moveDiagonally(STEPS));

        return listOfPositions;
    }

}
