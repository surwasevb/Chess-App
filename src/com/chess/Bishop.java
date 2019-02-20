package com.chess;

import java.util.ArrayList;
import java.util.List;

public class Bishop implements Piece {

    private Position position;

    Bishop(Position position) {
        this.position = position;
    }

    @Override
    public List<Position> possibleMoves() {
        List<Position> list = new ArrayList<>();

        for (int i = 1; i <= MAX_LIMIT; i++) {
            list.addAll(position.moveDiagonally(i));
        }

        return list;
    }
}
