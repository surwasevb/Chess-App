package com.chess;

import java.util.ArrayList;
import java.util.List;

public class Rook implements Piece {

    private Position position;

    Rook(Position position) {
        this.position = position;
    }

    @Override
    public List<Position> possibleMoves() {
        List<Position> listOfPositions = new ArrayList<>();

        for (int i = 1; i <= MAX_LIMIT; i++) {
            if (i != position.getVertical()) {
                listOfPositions.add(new Position(position.getHorizontal(), i));
            }

            if (i != position.getHorizontal()) {
                listOfPositions.add(new Position(i, position.getVertical()));
            }
        }

        return listOfPositions;
    }


}
