import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ChristmasTree {

  public static void mainDraw(Graphics g) {

    //Ask user for the detail level
    Scanner scanner = new Scanner(System.in);
    System.out.println("On a scale from 1 to 10 - how big is the christmas tree of your dreams?");
    int size = scanner.nextInt();
    System.out.println("How much decoration do you want to put on your christmas tree?");
    int level = scanner.nextInt();

    int triangleHeight = (int) Math.round(WIDTH * Math.sqrt(3.0) / 2.0);
    Point A = new Point(0, triangleHeight);
    Point B = new Point(WIDTH / 2, 0);
    Point C = new Point(WIDTH, triangleHeight);

    for (int i = 0; i < size; i++) {
      makeTriangleOwn(level, g, A, B, C);

      A.x += 0.1 * WIDTH;
      A.y += triangleHeight / 2;
      B.x -= 0.1 * WIDTH;
      B.y += triangleHeight / 2;
      C.x *= 0.1 * WIDTH;
      C.y *= triangleHeight / 2;
      WIDTH *= 0.9;
      triangleHeight = (int) Math.round(WIDTH * Math.sqrt(3.0) / 2.0);
    }
  }

  private static void makeTriangleOwn(int level, Graphics g, Point A, Point B, Point C) {

    if (level == 1) {
      Polygon p = new Polygon();
      p.addPoint(A.x, A.y);
      p.addPoint(B.x, B.y);
      p.addPoint(C.x, C.y);
      g.fillPolygon(p);
    } else {
      Point A1 = midpoint(A, B);
      Point B1 = midpoint(B, C);
      Point C1 = midpoint(A, C);

      makeTriangleOwn(level - 1, g, A, A1, C1);
      makeTriangleOwn(level - 1, g, A1, B, B1);
      makeTriangleOwn(level - 1, g, C1, B1, C);

    }
  }



  public static Point midpoint(Point p1, Point p2) {
    return new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
  }

  //    Don't touch the code below
  static int WIDTH = 1080;
  static int HEIGHT = 1080;

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
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      mainDraw(g);

    }
  }

}

