import javax.swing.*;

public class TurtleTest {
  public static void main (String[] args) {
    JFrame frame = new JFrame();
    frame.getContentPane().add (new TurtlePanel());
    frame.pack();
    frame.setVisible(true);
    
    //Ends the process upon closing the window.
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
