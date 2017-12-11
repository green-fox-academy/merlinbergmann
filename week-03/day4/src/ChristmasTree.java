import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ChristmasTree {

  public static void mainDraw(Graphics g) {

    //Ask user for the size of the tree
    Scanner scanner = new Scanner(System.in);
    System.out.println("On a scale from 1 to 10 - " +
            "how big is the christmas tree of your dreams?");
    int size = scanner.nextInt();

    // establish the tree trunk!

    int initialHeight = HEIGHT - 75;
    int triangleWidth = WIDTH / 2;
    int triangleHeight = (int) (Math.round(triangleWidth * Math.sqrt(3.0) / 2.0));


    Point A = new Point(0, initialHeight);
    Point B = new Point(triangleWidth / 2, initialHeight - triangleHeight);
    Point C = new Point(triangleWidth, initialHeight);


    for (int i = 0; i < size; i++) {
      Color color = new Color(1, 117, 6);
      makeTree(size, g, A, B, C, color);
      makeDecoration(size, g, A, B, C, color);

      A.y -= triangleHeight * 0.7;
      A.x += (triangleWidth - triangleWidth * 0.7) / 2;
      B.y -= triangleHeight * 0.4;
      C.y -= triangleHeight * 0.7;
      C.x -= (triangleWidth - triangleWidth * 0.7) / 2;

      triangleWidth *= 0.7;
      triangleHeight = (int)(Math.round(triangleWidth *
              Math.sqrt(3.0) / 2.0));
    }
  }

  private static void setTrunk(int size, Graphics g) {
    Color trunkColor = new Color(50, 37, 3);
    g.setColor(trunkColor);
    g.drawRect(WIDTH / 2 - size, HEIGHT, size * 2, size * 5);
  }

  private static void makeTree
          (int size, Graphics g,
           Point A, Point B, Point C, Color color) {
    color = new Color(1, 117, 6);
    g.setColor(color);
    Polygon p = new Polygon();
    p.addPoint(A.x, A.y);
    p.addPoint(B.x, B.y);
    p.addPoint(C.x, C.y);
    g.fillPolygon(p);
  }

  private static void makeDecoration
          (int size, Graphics g,
           Point A, Point B, Point C, Color color) {

    if (size == 1) {
      color = Color.getHSBColor((float)(Math.random()), 1, 1);
      g.setColor(color);
      Polygon p = new Polygon();
      p.addPoint(A.x, A.y);
      p.addPoint(B.x, B.y);
      p.addPoint(C.x, C.y);
      g.fillPolygon(p);

    } else {

      Point A1 = midpoint(A, B);
      Point B1 = midpoint(B, C);
      Point C1 = midpoint(A, C);

      makeDecoration(size - 1, g, A, A1, C1, color);
      makeDecoration(size - 1, g, A1, B, B1, color);
      makeDecoration(size - 1, g, C1, B1, C, color);

    }
  }



  public static Point midpoint(Point p1, Point p2) {
    return new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
  }

  //    Don't touch the code below
  static int WIDTH = 600;
  static int HEIGHT = 880;

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

