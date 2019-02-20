package com.chess;

import java.util.ArrayList;
import java.util.List;

public class Queen implements Piece {
    private Rook rook;
    private Bishop bishop;

    Queen(Position position) {
        this.rook = new Rook(position);
        this.bishop = new Bishop(position);
    }

    @Override
    public List<Position> possibleMoves() {
        List<Position> positions = new ArrayList<>();

        positions.addAll(rook.possibleMoves());
        positions.addAll(bishop.possibleMoves());

        return positions;
    }
}
