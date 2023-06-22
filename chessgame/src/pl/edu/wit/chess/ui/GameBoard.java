package pl.edu.wit.chess.ui;

import pl.edu.wit.chess.board.Board;

import javax.swing.*;

public class GameBoard extends JFrame {

    private final GameMenu gameMenu;
    private final Board board;

    public GameBoard() {
        setupFrame();
        board = new Board();
        gameMenu = new GameMenu(board);
        add(board);
        setJMenuBar(gameMenu);
    }

    public void showBoard() {
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void setupFrame() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
    }
}
