import javax.swing.*;

import java.awt.*;

import static java.awt.Frame.getFrames;
import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FractalSquares {
    public static void mainDraw(Graphics graphics) {
        int size = WIDTH;
        int x1 = size/3;
        int y = 0;
        drawItDammit(graphics, x1, y, size);
    }
    public static void drawItDammit(Graphics drawIt, int x1, int y, int size) {
        drawIt.drawLine(x1,0,x2,size);
        drawIt.drawLine();
        drawIt.drawLine();
        drawIt.drawLine();
    }











    /*  int noOfLoops = 5;
        int a = WIDTH / 3;
        int b = (WIDTH / 3) * 2;
        drawLine(graphics, noOfLoops, a, b);
    }
    public static void drawLine(Graphics square, int loops, int a, int b) {
        if (loops == 0) {
        square.drawLine(0, a, WIDTH, a);
        square.drawLine(0, b, WIDTH, b);
        square.drawLine(a, 0, a, HEIGHT);
        square.drawLine(b, 0, b, HEIGHT);
        } else {
            drawLine(square,loops-1, a, b );
            square.drawLine((a/3)*4,0,(a/3)*4,a);
            square.drawLine((a/3)*5,0,(a/3)*5,a);
            square.drawLine(a,a/3,b,a/3);
            square.drawLine(a,(a/3)*2,b,(a/3)*2);
        }
    }*/

    // Don't touch the code below
    static int WIDTH = 300;
    static int HEIGHT = 300;

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