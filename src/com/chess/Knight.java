package com.chess;

import java.util.ArrayList;
import java.util.List;

class Knight implements Piece {

    private static final int TWO = 2;
    private static final int HALF = 1;
    private Position position;

    Knight(Position position) {
        this.position = position;
    }

    @Override
    public List<Position> possibleMoves() {
        List<Position> listOfPositions = new ArrayList<>();

        listOfPositions.add(position.moveHorizontalForward(TWO).moveVerticalUp(HALF));
        listOfPositions.add(position.moveHorizontalForward(TWO).moveVerticalDown(HALF));

        listOfPositions.add(position.moveHorizontalBackward(TWO).moveVerticalUp(HALF));
        listOfPositions.add(position.moveHorizontalBackward(TWO).moveVerticalDown(HALF));

        listOfPositions.add(position.moveVerticalUp(TWO).moveHorizontalForward(HALF));
        listOfPositions.add(position.moveVerticalUp(TWO).moveHorizontalBackward(HALF));

        listOfPositions.add(position.moveVerticalDown(TWO).moveHorizontalForward(HALF));
        listOfPositions.add(position.moveVerticalDown(TWO).moveHorizontalBackward(HALF));

        return listOfPositions;
    }

}
