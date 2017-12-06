


import javax.swing.*;

        import java.awt.*;

        import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LineInTheMiddle {

  public static void mainDraw(Graphics g){

    //  draw a red horizontal line to the canvas' middle.
    //  draw a green vertical line to the canvas' middle.


    g.setColor(Color.WHITE);
    g.drawLine(WIDTH / 2, 0, WIDTH / 2, HEIGHT);
    g.drawLine(0, HEIGHT / 2, WIDTH, HEIGHT / 2);

  }

  //    Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  static int WindowWidth = WIDTH;
  static int WindowHeight = HEIGHT + 23;




  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WindowWidth, WindowHeight));
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
      this.setBackground(Color.BLACK);
    }
  }

}