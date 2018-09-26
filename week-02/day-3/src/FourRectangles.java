import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.
        for (int i = 0; i < 4; i++) {
            int x = (int) (Math.random() * WIDTH);
            int y = (int) (Math.random() * HEIGHT);
            int r = (int) (Math.random() * 256);
            int g = (int) (Math.random() * 256);
            int b = (int) (Math.random() * 256);
            SHAKEIT(graphics, x, y, (int) (Math.random() * (WIDTH-x+1)), (int) (Math.random() * (HEIGHT-y+1)), r, g, b);
            // to plus 1 ve (WIDTH-x+1) tam je aby to nemohla byt 0 (pak by to byla primka. Pokud padne maximum tak to vyjde presne na velikost WIDTH
        }
    }
    public static void SHAKEIT (Graphics tadaa, int x, int y, int s, int t, int r, int g, int b) {
        tadaa.setColor(new Color(r,g,b,255));
        tadaa.drawRect(x, y, s, t);
    }
    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }
    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}