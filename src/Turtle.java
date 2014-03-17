/**
 * A turtle for a turtle graphics system.
 */

import java.lang.*;

public class Turtle {

  /**
   * Instance variables
   */
	public int heading;
	public double xcoord;
	public double ycoord;
	public int dist;

  // Constructors:
 
  /**
   * Create a new Turtle with heading due north (0 degrees), and 
   * position at the origin (0,0)
   */  
  public Turtle() {
	  setHeading(90);
	  setx(0);
	  sety(0);
  }

  /**
   * Create a new Turtle with specified heading and position
   */ 
  public Turtle (double inith,double x, double y) {
	  setHeading(inith);
	  setx(x);
	  sety(y);
  }

  /**
   * Create a new Turtle with specified heading and 
   * position at the origin (0,0)
   */ 
  public Turtle (double inith) {
	  setHeading(inith);
	  setx(0);
	  sety(0);
  }

  /**
   * Create a new Turtle with heading due north (0 degrees) and 
   * specified position
   */ 
  public Turtle (double x, double y) {
	  setHeading(90);
	  setx(x);
	  sety(y);
  }

  // Commands:

  /**
   * Reset the turtle to x x-coordinate position. 
   */ 
  public void setx (double x) {
	  xcoord = x + 200;
  }

  /**
   * Reset the turtle to y y-coordinate position. 
   */ 
  public void sety (double y) {
	  ycoord = y + 200;
  }  
  
    /**
   * Reset the turtle to tHeading. 
   */ 
  public void setHeading (double tHeading) {
	  heading = (int) (tHeading % 360);
  }

  
  /**
   * Turn right offset degrees. The turtle heading is changed but the
   * turtle position stays the same.  
   * offset can be any positive or negative value.  
   * The calculation is done % 360 degrees.
   * rt is exactly the opposite of lt.
   */ 
  public void rt (int offset) {
	  heading = (int) ((heading + offset) % 360);
	  if (heading < 0)
		  heading = heading + 360;
	  if (heading <= 90)
		  heading = 90 - heading;
	  else if (heading <= 180)
		  heading = heading - 90;
	  else if (heading <= 270)
		  heading = 270 - heading;
	  else
		  heading = heading - 270;
  }

  /**
   * Turn left offset degrees. The turtle heading is changed but the
   * turtle position stays the same.  
   * offset can be any positive or negative value.  
   * The calculation is done % 360 degrees.
   * lt is exactly the opposite of rt.
   */
  public void lt (int offset) {
	  heading = (heading - offset) % 360;
	  if (heading < 0)
		  heading = heading + 360;
  }

  /**
   * Move forward dist steps.  fd is exactly the opposite of bk.  The turtle position
   * is changed but the turtle heading stays the same.
   */  
  public void fd (double dist) {
	  xcoord = Math.cos(Math.toRadians(heading)) * dist + xcoord;
	  ycoord = ycoord - Math.sin(Math.toRadians(heading)) * dist;
	  
	  System.out.println(xcoord);
  }
 
  /**
   * Move backward dist steps.  bk is exactly the opposite of fd.  The turtle position
   * is changed but the turtle heading stays the same.
   */   
  public void bk (double dist) {
	  xcoord = (int) (xcoord - Math.cos(Math.toRadians(heading)) * dist);
	  ycoord = (int) (ycoord - Math.sin(Math.toRadians(heading)) * dist);
  }

  // Queries:

  /**
   * Current heading of this turtle in degrees, 0 to < 360, with 0 due north.
   */ 
  public double heading () {
    return heading;
  }

  /**
   * Current x position of the turtle.
   */ 
  public double xcor () {
    return xcoord;
  }

  /**
   * Current y position of the turtle.
   */ 
  public double ycor () {
    return ycoord;
  }
  
  
}
