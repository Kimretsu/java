package pl.edu.wit.chess.board;

import pl.edu.wit.chess.piece.Bishop;
import pl.edu.wit.chess.piece.King;
import pl.edu.wit.chess.piece.Knight;
import pl.edu.wit.chess.piece.Pawn;
import pl.edu.wit.chess.piece.Piece;
import pl.edu.wit.chess.piece.PieceColor;
import pl.edu.wit.chess.piece.Queen;
import pl.edu.wit.chess.piece.Rook;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {

    public Board() {
        super(new GridLayout(8, 8));
        init();
    }


    public void startGame() {
        for (int x = 0; x < 8; x++) {
            placePieces(PieceColor.WHITE, x);
            placePieces(PieceColor.BLACK, x);
        }
        refresh();
    }

    public void clean() {
        for (int i = 0; i < getComponentCount(); i++) {
//            Field component = ((Field) getComponent(i));
            Container component = (Container) getComponent(i);
            component.removeAll();
        }
    }

    public void refresh() {
        revalidate();
        repaint();
    }

    public void move(String from, String to) {
        System.out.println("move from " + from + " to " + to);
    }

    Field getField(int x, int y) {
        return (Field) getComponent(x + y * 8);
    }

    private void placePieces(PieceColor color, int x) {
        try {
// ustawienie pionków
            int y = color == PieceColor.WHITE ? 6 : 1;
            getField(x, y).placePiece(new Pawn(color));
// wybór figury na podstawie pozycji x

            Piece piece = switch (x) {
                case 0, 7 -> new Rook(color);
                case 1, 6 -> new Knight(color);
                case 2, 5 -> new Bishop(color);
                case 3 -> new Queen(color);
                case 4 -> new King(color);
                default -> throw new IllegalPiecePositionException(x);
            };

// ustawienie figur
            y = color == PieceColor.WHITE ? 7 : 0;
            getField(x, y).placePiece(piece);
        } catch (Exception ex) {
            ex.printStackTrace();
// TODO: show alert;
// znajdz to w dokumentacji javy w domu!(java swing dialog?) Field getField(String value)
//  (Field) getComponent (int); np::36
//getField (x i y ) - x = 4 i y =4
//return null;
// można wypisać o która figurę chodzi w ramach opisu
// na dialogu. to znaczy podać jej kolor i pozycję.
// dla bardziej zaawansowanych -> można zmienić kod w
// taki sposób żeby dialog pojawiał się tylko raz dla
// wszystkich błędów
        }
    }

    private void init() {
        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                Field field = new Field(x, y);
                add(field);
            }
        }
    }

}