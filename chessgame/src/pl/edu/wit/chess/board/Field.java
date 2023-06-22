package pl.edu.wit.chess.board;

import pl.edu.wit.chess.piece.Piece;

import javax.swing.*;
import java.awt.*;

public class Field extends JPanel {
    private final FieldColor color;

    Field(int x, int y) {
        this.color = (x + y) % 2 == 0 ? FieldColor.WHITE : FieldColor.BLACK;
        setPreferredSize(new Dimension(100, 100));
        setBackground(color.toSwingColor());
        add(new JLabel(String.valueOf(x + y * 8)));

    }


    FieldColor getColor() {
        return color;
    }

    void placePiece(Piece piece) {
        removeAll();
        add(piece);
        revalidate();
        repaint();

    }
}