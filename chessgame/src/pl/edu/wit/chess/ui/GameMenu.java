package pl.edu.wit.chess.ui;

import pl.edu.wit.chess.board.Board;

import javax.swing.*;
import java.awt.event.ActionListener;

class GameMenu extends JMenuBar {
    private final Board board;

    public GameMenu(Board board) {
        this.board = board;
        JMenu file = createMenu("File");
        createMenuItem(file, "New Game", (event) -> {
            board.clean();
            board.startGame();
        });
        createMenuItem(file, "Clean game", (event) -> {
            board.clean();
            board.refresh();
        });

        JMenu simulate = createMenu("Simulate");
        createMenuItem(simulate, "Start simulation", (event) -> {
            board.clean();
            board.startGame();
            new Thread(() -> {
                try {
                    move("e2", "e4");
                    move("e7", "e5");
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }).start();
        });
    }

    private void move(String from, String to) throws InterruptedException {
        board.move(from, to);
        synchronized (this) {
            wait(1000);
        }
    }

    private JMenu createMenu(String name) {
        JMenu menu = new JMenu(name);
        add(menu);
        return menu;
    }

    private void createMenuItem(JMenu parent, String name, ActionListener listener) {
        JMenuItem menuItem = new JMenuItem(name);
        menuItem.addActionListener(listener);
        parent.add(menuItem);
    }
}

