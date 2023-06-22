package pl.edu.wit.chess.piece;

import static pl.edu.wit.chess.piece.icon.iconfinder.IconFinderFactory.KNIGHT;
import static pl.edu.wit.chess.piece.icon.iconfinder.IconFinderFactory.createIconFinderIcon;

public class Knight extends Piece {

    public Knight(PieceColor color) {
        super(createIconFinderIcon(color, KNIGHT));
    }
}
