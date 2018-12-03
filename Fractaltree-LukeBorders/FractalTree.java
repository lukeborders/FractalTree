/**
 * Draws a fractal tree
 */
import java.awt.*;
import java.applet.*;

public class FractalTree extends Applet {
    Graphics g;
    
	/**
	* @param x the x-coordinate of the "trunk" to draw
	* @param y the y-coordinate of the "trunk" to draw
	* @param l the length of the branch to draw
	* @param angle the angle at which to draw the "trunk", in radians
	**/
    public void drawTree(int x, int y, int l, double angle) {
	    if (l <= 3) 
		{ 
			return; 
		}
	    else {
	        //draw the "trunk"
			int xEnd = (int)(x+l*Math.cos(angle)+0.5); //the end of the trunk
			int yEnd = (int)(y+l*Math.sin(angle)+0.5); //the end of the trunk
	        g.drawLine(x, y, xEnd, yEnd);
			
	        //TODO: make recursive calls to draw "branches"
			drawTree(xEnd,yEnd,l-25,angle + 0.7);
			drawTree(xEnd,yEnd,l-25,angle - 0.7);
			drawTree(xEnd,yEnd,l-50,angle + 1);
			drawTree(xEnd,yEnd,l-50,angle - 1);
			drawTree(xEnd,yEnd,l-40,angle + 0.5);
			drawTree(xEnd,yEnd,l-40,angle - 0.5);
			drawTree(xEnd,yEnd,l-50,angle + 1);
			drawTree(xEnd,yEnd,l-50,angle - 1);
			drawTree(xEnd,yEnd,l-25,angle + 0.4);
			drawTree(xEnd,yEnd,l-25,angle - 0.4);
	    }
    }

    public void paint(Graphics gr) {
        g = gr;
        setVisible(true);
        g.setColor(Color.red);
	    drawTree(400, 800, 200, -1*Math.PI/2);
		
		
	}
}

