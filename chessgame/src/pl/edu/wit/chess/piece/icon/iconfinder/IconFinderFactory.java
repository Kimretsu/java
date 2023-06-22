package pl.edu.wit.chess.piece.icon.iconfinder;

import pl.edu.wit.chess.piece.PieceColor;

import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public final class IconFinderFactory {

    public final static String PAWN = "chess-pawn-512.png";
    public final static String BISHOP = "chess-bishop-512.png";
    public final static String KING = "chess-king-512.png";
    public final static String KNIGHT = "chess-knight-512.png";
    public final static String QUEEN = "chess-queen-512.png";
    public final static String ROOK = "chess-rook-512.png";

    private final static Map<String, ImageIcon> IMAGES = new HashMap<>();

    private IconFinderFactory() {
    }

    public static Icon createIconFinderIcon(PieceColor color, String fileName) {
        String url = createUrl(fileName, color);
        return IMAGES.computeIfAbsent(url, IconFinderFactory::getIconFinderIcon);
    }

    private static ImageIcon getIconFinderIcon(String url) {
        try {
            System.out.println("Getting image for url " + url);
            Image scaledImage = new ImageIcon(new URL(url))
                    .getImage()
                    .getScaledInstance(60, 60, Image.SCALE_SMOOTH);

            return new ImageIcon(scaledImage);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    private static String createUrl(String fileName, PieceColor color) {
        String colorValue = color == PieceColor.WHITE ? "font-awesome-regular-1" : "font-awesome-solid";
        return new StringBuilder("https://cdn3.iconfinder.com/data/icons/")
                .append(colorValue)
                .append("/512/")
                .append(fileName)
                .toString();
    }

}
