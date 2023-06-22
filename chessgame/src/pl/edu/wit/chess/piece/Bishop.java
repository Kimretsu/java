package pl.edu.wit.chess.piece;

import pl.edu.wit.chess.piece.icon.iconfinder.IconFinderFactory;

public class Bishop extends Piece {

    public Bishop(PieceColor color) {
        super(IconFinderFactory.createIconFinderIcon(color, IconFinderFactory.BISHOP));
    }
}
