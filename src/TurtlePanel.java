import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class TurtlePanel extends JPanel {


  
/**
   * Instance variables
   * 
   * At least a single instance of a Turtle for drawing
   * 
   */
  private Turtle t;

    // Constructors:
 
  /**
   * Create a new TurtlePanel with a new Turtle initialized
   * to a heading and location
   * 
   */  
  public TurtlePanel() {
    t = new Turtle(0,0,0);
  }

  /**
   * the paintComponent method is automatically called by the
   * system in order to draw the screen.
   * Careful!  This method might be repeatedly called by the
   * system, so your turtle must be initialized anew at the
   * beginning of this method.  If not, the repeated 
   * execution of this method will start with whatever the
   * Turtle's state is on the previous execution.
   */ 
  public void paintComponent (Graphics g) {
    /**
     * PaintComponent must in turn call PaintComponent on the
     * parent (super) JPanel class
     */ 
    super.paintComponent(g);
    
  /**
   * Here is example code to initialize the Turtle t. The constructor
   * created the Turtle, but it is not enough to have the constructor
   * set the Turtle's initial state. It must be initialized on
   * (possibly) repeated executions of paintComponent.
   */      
    t.setHeading(90);
    t.setx(0);
    t.sety(0);

      /**
   * Code to move the Turtle and draw the Turtle's path should be placed here.
   * 
   */
    TurtleDrawings.Circle(g, t, 20, 20);
    //TurtleDrawings.Spiral(g, t, 20, 20);
    //TurtleDrawings.SpiralIncreasing(g, t, 4);
    //TurtleDrawings.SpiralSquare(g, t, 70);
    //TurtleDrawings.Square(g, t, 70);
    }
  

    /**
   * getPreferredSize and getMinimumSize are both mandatory and used by
   * the system.  You can use these to set the size of the visual
   * TurtlePanel, in this case 400x400 pixels.
   */ 
  public Dimension getPreferredSize () {
    return new Dimension(400,400);
  }
  
  public Dimension getMinimumSize () {
    return this.getPreferredSize();
  }
}
