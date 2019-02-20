package com.chess;

import java.util.ArrayList;
import java.util.List;

class Position {

    private final int MAX_LIMIT = 8;
    private final int MIN_LIMIT = 1;

    private int horizontal;
    private int vertical;

    Position(int horizontal, int vertical) {
        this.horizontal = horizontal;
        this.vertical = vertical;
    }

    @Override
    public boolean equals(Object o) {
        Position position = (Position) o;
        return horizontal == position.horizontal &&
                vertical == position.vertical;
    }

    int getHorizontal() {
        return horizontal;
    }

    int getVertical() {
        return vertical;
    }

    Position moveVerticalUp(int steps) {
        return (vertical + steps) <= MAX_LIMIT ? new Position(horizontal, vertical + steps) : this;
    }

    Position moveVerticalDown(int steps) {
        return (vertical - steps) >= MIN_LIMIT ? new Position(horizontal, vertical - steps) : this;
    }

    Position moveHorizontalForward(int steps) {
        return (horizontal + steps) <= MAX_LIMIT ? new Position(horizontal + steps, vertical) : this;
    }

    Position moveHorizontalBackward(int steps) {
        return (horizontal - steps) >= MIN_LIMIT ? new Position(horizontal - steps, vertical) : this;
    }

    List<Position> moveDiagonally(int steps) {
        List<Position> positions = new ArrayList<>();

        if (horizontal + steps <= MAX_LIMIT && vertical - steps >= MIN_LIMIT) {
            positions.add(new Position(horizontal + steps, vertical - steps));
        }

        if (horizontal - steps >= MIN_LIMIT && vertical + steps <= MAX_LIMIT) {
            positions.add(new Position(horizontal - steps, vertical + steps));
        }

        if (horizontal - steps >= MIN_LIMIT && vertical - steps >= MIN_LIMIT) {
            positions.add(new Position(horizontal - steps, vertical - steps));
        }

        if (horizontal + steps <= MAX_LIMIT && vertical + steps <= MAX_LIMIT) {
            positions.add(new Position(horizontal + steps, vertical + steps));
        }

        return positions;
    }

}
