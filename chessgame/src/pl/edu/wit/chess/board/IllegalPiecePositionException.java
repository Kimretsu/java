package pl.edu.wit.chess.board;

public class IllegalPiecePositionException extends RuntimeException {
    public IllegalPiecePositionException(int x) {
        super("Nie prawidłowa pozycja ustawienia figury na x: " + x);
    }
}
