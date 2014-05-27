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
        width = 40;
        height = 40;
    }
    
    public boolean clear() {
    	return true; 
    }

    public void drawOpen(Graphics2D g2){

    if(dir == 0){
        g2.setColor(Color.BLACK);
        g2.fillRect(x-5, y-5, 50, 50);
        
        g2.setColor(Color.YELLOW);
        g2.fillArc(x, y, 40, 40, 45, 270);

        }


    if(dir == 1){
        g2.setColor(Color.BLACK);
        g2.fillRect(x-5, y-5, 50, 50);
        g2.setColor(Color.YELLOW);
        g2.fillArc(x, y, 40, 40, 135, 270);

        }

    if(dir == 2){
        g2.setColor(Color.BLACK);
        g2.fillRect(x-5, y-5, 50, 50);
        g2.setColor(Color.YELLOW);
        g2.fillArc(x, y, 40, 40, 225, 270);

        }

    if(dir == 3){
        g2.setColor(Color.BLACK);
        g2.fillRect(x-5, y-5, 50, 50);
        g2.setColor(Color.YELLOW);
        g2.fillArc(x, y, 40, 40, 315, 270);

        }

    }

    public void drawClosed(Graphics2D g2){

        if(dir == 0){
            g2.setColor(Color.BLACK);
            g2.fillRect(x-5, y-5, 50, 50);
            g2.setColor(Color.YELLOW);
            g2.fillOval(x, y, 40, 40);
            g2.setColor(Color.BLACK);
            g2.drawLine(x+40, y+20, x+20, y+20);
        }

        if(dir == 1){
            g2.setColor(Color.BLACK);
            g2.fillRect(x-5, y-5, 50, 50);
            g2.setColor(Color.YELLOW);
            g2.fillOval(x, y, 40, 40);
            g2.setColor(Color.BLACK);
            g2.drawLine(x+20, y, x+20, y+20);
        }

        if(dir == 2){
            g2.setColor(Color.BLACK);
            g2.fillRect(x-5, y-5, 50, 50);
            g2.setColor(Color.YELLOW);
            g2.fillOval(x, y, 40, 40);
            g2.setColor(Color.BLACK);
            g2.drawLine(x, y+20, x+20, y+20);
        }

        if(dir == 3){
            g2.setColor(Color.BLACK);
            g2.fillRect(x-5, y-5, 50, 50);
            g2.setColor(Color.YELLOW);
            g2.fillOval(x, y, 40, 40);
            g2.setColor(Color.BLACK);
            g2.drawLine(x+20, y+40, x+20, y+20);
        }
    }



    public void setLocation(){ //0 = right, 1 = up, 2 = left, 3 = down
    	System.out.println(b.intersects(this));
        if(dir == 0)
        	if (!b.intersects(new Rectangle(x + v, y, 40, 40))) {
        		x += v;
        	}
        if(dir == 1)
        	if (!b.intersects(new Rectangle(x, y - v, 40, 40))) {
        		y -= v;
        	}
        if(dir == 2)
        	if (!b.intersects(new Rectangle(x - v, y,40, 40))) {
        		x -= v;
        	}
        if(dir == 3)
        	if (!b.intersects(new Rectangle(x, y + v, 40, 40))) {
        		y += v;
        	}
    }

    public void setDir(int a){
        dir = a;
    }

}
