package day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece[][] chessFigures = initClearChessBord();
        kramnikKasparov2000Game(chessFigures);
        ChessBoard chessBoard = new ChessBoard(chessFigures);
        chessBoard.print();
    }

    public static ChessPiece[][] initClearChessBord() {
        ChessPiece[][] chessPieces = new ChessPiece[8][8];
        for (ChessPiece[] chessLine : chessPieces) {
            Arrays.fill(chessLine, ChessPiece.EMPTY);
        }
        return chessPieces;
    }

    public static void kramnikKasparov2000Game(ChessPiece[][] cb) {
        cb[0][0] = cb[0][5] = ChessPiece.ROOK_BLACK;
        cb[1][1] = cb[7][5] = ChessPiece.ROOK_WHITE;
        cb[2][0] = cb[1][4]= cb[1][5]= cb[1][7] = cb[2][6] = ChessPiece.PAWN_BLACK;
        cb[6][0] = cb[0][6] = cb[4][4] = cb[5][5] = cb[6][5] = cb[6][7] = ChessPiece.PAWN_WHITE;
        cb[2][2] = ChessPiece.KNIGHT_BLACK;
        cb[0][6] = ChessPiece.KING_BLACK;
        cb[7][6] = ChessPiece.KING_WHITE;
        cb[3][0] = ChessPiece.QUEEN_BLACK;
        cb[3][3] = cb[5][4] = ChessPiece.BISHOP_WHITE;
        cb[4][3] = ChessPiece.BISHOP_BLACK;
        cb[6][3] = ChessPiece.QUEEN_WHITE;
    }
}
