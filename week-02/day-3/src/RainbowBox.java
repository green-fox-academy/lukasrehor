import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBox {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.
        int[] size = {320,270,220,170,120,70,20};
        Color[] barva = {Color.red,Color.green,Color.cyan,Color.blue,Color.orange,Color.pink,Color.white};
        for (int i = 0; i < 7; i++) {
            paintsquares(graphics, size[i], barva[i]);
        }
    }
    public static void paintsquares (Graphics tadaa, int size, Color barva) {
        tadaa.setColor(barva);
        tadaa.fillRect((WIDTH/2)-(size/2),(HEIGHT/2)-(size/2), size, size);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

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