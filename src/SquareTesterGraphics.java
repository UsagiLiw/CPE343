import java.io.*;
import java.util.*;
/**
 *   Test program to create and display squares.
 *
 *   Created by Sally Goldin, 9 August
 *   Modified to use IOUtils.java - 19 Jan 2020
 *
 */
public class SquareTesterGraphics
{
    /** Keep hold of the last square we created so we can move
     * it using the mouse.
     */
    protected static Square latestSquare = null; 


   /* Main method first creates the viewer. Then it
    * asks for coordinates, creates new triangles, and displays them. 
    * Then prints the perimetr and area as well.
    */
   public static void main(String arguments[])
      {
      boolean bContinue = true;
      FigureViewer viewer = new FigureViewer();
      viewer.pack();
      viewer.setVisible(true);
 
      while (bContinue)
         {
		 int x,y;    /* coordinates of upper left point of square */
		 int length; /* length of one side */
		 x = IOUtils.getInteger("Enter x for upper left point (negative to exit): ");
		 if (x < 0)
		 {
			 bContinue = false;
		 }
	 	 else
		{
	    y = IOUtils.getInteger("Enter y for upper left point: ");
	    length = IOUtils.getInteger("Length of each side of square: ");
	    latestSquare = new Square(x,y,length);
	    viewer.drawSquare(latestSquare,false);
	    double perim = latestSquare.calcPerimeter();
	    System.out.println("Perimeter is " + perim);
	    double area = latestSquare.calcArea();
	    System.out.println("Area is " + area + "\n\n");

	    System.out.println("-----------------------------");
	    String move = IOUtils.getString("Want to move the square (Y/N)?");
	    if (move.startsWith("Y"))
		{
		x = IOUtils.getInteger("New X: ");    
		y = IOUtils.getInteger("New Y: ");
		latestSquare.setX(x);
		latestSquare.setY(y);
		viewer.clear();
		try 
		{
		    Thread.sleep(1000); // Wait for clear to complete
		}
		catch (InterruptedException ie)
		{
		}
		viewer.drawSquare(latestSquare,true);
		} 
	    System.out.println("-----------------------------\n");
	    }
	 }   
      System.exit(0);
      }

}
