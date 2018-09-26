import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Draw 3 lines with that function. Use loop for that.
        graphics.setColor(Color.red);       //for fun..
        for (int i = 0; i < 3; i++) {
            funkce(graphics, (int) (Math.random() * WIDTH), (int) (Math.random() * HEIGHT));
        }
    }
    public static void funkce (Graphics tadaa, int x, int y) {
        tadaa.drawLine(x, y, WIDTH/2, HEIGHT/2);
    }
    /* nebo do mainDraw na pevno misto intervalu s randomem - nastav x a y, spust funkci, nastav dalsi, spust funkci...
    int x = 30;
    int y = 80;
    funkce(graphics, x, y);

    x = 50;
    y = 0;
    funkce(graphics, x, y);

    x = 130;
    y = 200;
    funkce(graphics, x, y);
    */
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