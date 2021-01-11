package day17;

import java.util.List;

public class ChessBoard {
    private ChessPiece[][] chessBoard = new ChessPiece[8][8];

    public ChessBoard(ChessPiece[][] chessBoard) {
        this.chessBoard = chessBoard;
    }

    public void print() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(chessBoard[i][j]);
            }
            System.out.println();
        }
    }
}
