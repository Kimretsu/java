package pl.edu.wit.chess.piece;

import static pl.edu.wit.chess.piece.icon.iconfinder.IconFinderFactory.ROOK;
import static pl.edu.wit.chess.piece.icon.iconfinder.IconFinderFactory.createIconFinderIcon;

public class Rook extends Piece {

    public Rook(PieceColor color) {
        super(createIconFinderIcon(color, ROOK));
    }
}
