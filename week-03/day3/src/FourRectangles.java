import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

  public static void mainDraw(Graphics graphics){
    // draw four different size and color rectangles.

    graphics.setColor(Color.GREEN);
    graphics.fillRect(0, 0, 10, 10);

    graphics.setColor(Color.RED);
    graphics.fillRect(10, 10, 20, 20);

    graphics.setColor(Color.BLUE);
    graphics.fillRect(30, 30, 60, 60);

    graphics.setColor(Color.YELLOW);
    graphics.fillRect(90, 90, 180, 180);

  }

  //    Don't touch the code below
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
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}