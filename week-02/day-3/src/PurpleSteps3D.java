import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3D {
    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps-3d/r4.png]

        /* WORKING SOLUTION 1, draws black squares and smaller filled squares inside, not over them
        int position = 10;
        int side = 10;
        for (int i = 0; i < 6; i++) {
            makesquare(graphics, side, position);
            position = (side + position);
            side = side + 10;

    public static void makesquare (Graphics tadaa, int side, int position) {
        tadaa.setColor(Color.black);
        tadaa.drawRect(position,position, side, side);
        tadaa.setColor(Color.magenta);
        tadaa.fillRect(position+1,position+1,side-1,side-1);
        }*/

        // this one places black squares over filled magenta squares
        int coordinates = 10;
        int size = 10;
        for (int i = 0; i < 6; i++) {
            graphics.setColor(Color.magenta);       // nakresli fialovej
            graphics.fillRect(coordinates, coordinates, size, size);
            graphics.setColor(Color.black);         // placne pres nej cernej bez vyplne = prekryje ho
            graphics.drawRect(coordinates, coordinates, size, size);
            coordinates += size;
            size += 10;
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