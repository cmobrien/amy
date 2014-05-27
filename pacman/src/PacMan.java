import java.applet.Applet;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: robert_williams
 * Date: 5/15/14
 * Time: 10:47 AM
 * To change this template use File | Settings | File Templates.
 */
public class PacMan extends Rectangle {

    private int v, dir;
    private Board b;

    public PacMan(int xx, int yy, int vel, Board board){
        x = xx;
        y = yy;
        v = vel;
        dir = 0;
        b = board;
        width = 34;
        height = 34;
    }
    
    public boolean clear() {
    	return true; 
    }

    public void drawOpen(Graphics2D g2){
        
    	g2.setColor(Color.BLACK);
    	g2.fillRect(x, y, width, height);
    	g2.setColor(Color.YELLOW);

    	if (dir == 0) {
    		g2.fillArc(x, y, width, height, 45, 270);
    	} else if (dir == 1) {
    		g2.fillArc(x, y, width, height, 135, 270);
    	} else if (dir == 2){
    		g2.fillArc(x, y, width, height, 225, 270);
    	} else if (dir == 3){
    		g2.fillArc(x, y, width, height, 315, 270);
    	}

    }

    public void drawClosed(Graphics2D g2){
    	g2.setColor(Color.BLACK);
        g2.fillRect(x, y, width, height);
        g2.setColor(Color.YELLOW);
        g2.fillOval(x, y, width, height);
        g2.setColor(Color.BLACK);
    }



    public void setLocation(){ //0 = right, 1 = up, 2 = left, 3 = down
    	// Moving off the left side of the board, need to loop around
    	if (dir == 2 && x < 0) {
    		if (x < -width) {
    			x = 578;
    		} else {
    			x -= v;
    		}
    	// Moving off the right side of the board, need to loop around
    	} else if (dir == 0 && x > 580) {
    		if (x > 580 + width) {
    			x = -32;
    		} else {
    			x += v;
    		}
    	// Just a normal move
    	} else {
    		// Only move if the board allows it
    		if (dir == 0 && !b.intersects(new Rectangle(x + v, y, width, height))) {
    			x += v;
    		} else if (dir == 1 && !b.intersects(new Rectangle(x, y - v, width, height))) {
    			y -= v;
    		} else if (dir == 2 && !b.intersects(new Rectangle(x - v, y, width, height))) {
    			x -= v;
    		} else if (dir == 3 && !b.intersects(new Rectangle(x, y + v, width, height))) {
    			y += v;
    		}
    	}
    }

    public void setDir(int a) {
    	// Only change direction if we're in the board
    	if (x > 0 && x < 580) {
    		// Update the direction if the board allows it
    		if (a == 0 && !b.intersects(new Rectangle(x + v, y, width, height))) {
    			dir = 0;
    		} else if (a == 1 && !b.intersects(new Rectangle(x, y - v, width, height))) {
    			dir = 1;
    		} else if (a == 2 && !b.intersects(new Rectangle(x - v, y, width, height))) {
    			dir = 2;
    		} else if (a == 3 && !b.intersects(new Rectangle(x, y + v, width, height))) {
    			dir = 3;
    		}
    	}
    }

}
