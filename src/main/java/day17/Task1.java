package day17;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<ChessPiece> chessList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            if ((i < 4)) {
                chessList.add(ChessPiece.PAWN_WHITE);
            } else {
                chessList.add(ChessPiece.ROOK_BLACK);
            }
        }
        for(ChessPiece cp : chessList) {
            System.out.print("" + cp + " ");
        }
    }
}