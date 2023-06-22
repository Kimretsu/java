package pl.edu.wit.chess.piece;

import static pl.edu.wit.chess.piece.icon.iconfinder.IconFinderFactory.QUEEN;
import static pl.edu.wit.chess.piece.icon.iconfinder.IconFinderFactory.createIconFinderIcon;

public class Queen extends Piece {

    public Queen(PieceColor color) {
        super(createIconFinderIcon(color, QUEEN));
    }
}
