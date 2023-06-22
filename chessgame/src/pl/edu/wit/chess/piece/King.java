package pl.edu.wit.chess.piece;

import static pl.edu.wit.chess.piece.icon.iconfinder.IconFinderFactory.KING;
import static pl.edu.wit.chess.piece.icon.iconfinder.IconFinderFactory.createIconFinderIcon;

public class King extends Piece {

    public King(PieceColor color) {
        super(createIconFinderIcon(color, KING));
    }
}
