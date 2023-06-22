package pl.edu.wit.chess.board;

import java.awt.*;

enum FieldColor {
    WHITE(255, 206, 158), BLACK(209, 139, 71);

    private final Color color;

    FieldColor(int r, int g, int b) {
        color = new Color(r, g, b);
    }

    Color toSwingColor() {
        return color;
    }
}
