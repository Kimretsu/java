package pl.edu.wit.chess.piece;

import javax.swing.*;
import java.awt.*;

public abstract class Piece extends JLabel {


    public Piece(PieceColor color) {
    }

    public Piece(Icon icon) {
        super(icon);
        setPreferredSize(new Dimension(90, 90));
    }
}
