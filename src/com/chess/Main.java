package com.chess;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int x, y;
        String pieceName;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter chess piece name \n 1. Pawn \n 2. Rook \n 3. Bishop \n 4. Knight \n 5. Queen \n 6. King");
        pieceName = scanner.next();

        System.out.println("Enter Horizontal Co-ordinate");
        x = scanner.nextInt();

        System.out.println("Enter Vertical Co-ordinate");
        y = scanner.nextInt();

        Position position = new Position(x, y);

        switch (pieceName.toUpperCase()) {
            case "PAWN":
                printCoordinates(new Pawn(position).possibleMoves());
                break;
            case "ROOK":
                printCoordinates(new Rook(position).possibleMoves());
                break;
            case "BISHOP":
                printCoordinates(new Bishop(position).possibleMoves());
                break;
            case "KNIGHT":
                printCoordinates(new Knight(position).possibleMoves());
                break;
            case "QUEEN":
                printCoordinates(new Queen(position).possibleMoves());
                break;
            case "KING":
                printCoordinates(new King(position).possibleMoves());
                break;
            default:
                System.out.println("Illegal piece name");
        }
    }

    static void printCoordinates(List<Position> positions) {
        System.out.println("Possible Moves");
        positions.forEach(it -> System.out.println("[" + it.getHorizontal() + "," + it.getVertical() + "]"));
    }
}
