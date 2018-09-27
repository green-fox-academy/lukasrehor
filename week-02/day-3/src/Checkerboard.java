import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        int oddEven = 1;
        for (int i = 0; i < 300; i += 20) {
            for (int j = 0; j < 300; j += 40) {
                if (oddEven %2 == 0) {
                    graphics.drawRect(j, i, 20, 20);
                    graphics.fillRect(j + 20, i, 20, 20);
                } else {
                    graphics.fillRect(j, i, 20, 20);
                    graphics.drawRect(j + 20, i, 20, 20);
                }
            }
            oddEven++;
        }
    }
    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}