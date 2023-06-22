package pl.edu.wit.chess;

import pl.edu.wit.chess.ui.GameBoard;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                () -> new GameBoard()
                        .showBoard()
        );
    }
}
