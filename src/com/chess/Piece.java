package com.chess;

import java.util.List;

public interface Piece {
    int MAX_LIMIT = 8;

    List<Position> possibleMoves();
}
