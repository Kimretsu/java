package pl.edu.wit.chess.piece;

import static pl.edu.wit.chess.piece.icon.iconfinder.IconFinderFactory.PAWN;
import static pl.edu.wit.chess.piece.icon.iconfinder.IconFinderFactory.createIconFinderIcon;

public class Pawn extends Piece {

    public Pawn(PieceColor color) {
        super(createIconFinderIcon(color, PAWN));
    }
}
