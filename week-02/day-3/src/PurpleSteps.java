import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps/r3.png]
        int position = 10;
        for (int i = 0; i < 20; i++) {
            int side = 12;
            makesquare(graphics, side, position);
            position = side + position;
        }
        /*
        JEDNODUSSI RESENI bez funkce. V puvodnim se neprekryvaji, ale kresli cerny a do nej mensi fialovy.
        int size = 10;
        for (int i = 0; i < 200; i += 10) {
            graphics.setColor(Color.magenta);       // nakresli fialovej
            graphics.fillRect(i, i, size, size);
            graphics.setColor(Color.black);         // placne pres nej cernej bez vyplne = prekryje ho
            graphics.drawRect(i, i, size, size);
        }*/
    }
    public static void makesquare (Graphics tadaa, int side, int position) {
        tadaa.setColor(Color.black);
        tadaa.drawRect(position,position, side, side);
        tadaa.setColor(Color.magenta);
        tadaa.fillRect(position+1,position+1,side-1,side-1);
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