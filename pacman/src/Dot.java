import java.applet.Applet;
import java.awt.*;
/**
 * Created with IntelliJ IDEA.
 * User: robert_williams
 * Date: 5/20/14
 * Time: 12:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class Dot extends Rectangle {
    private boolean eaten;

    public Dot(int xx, int yy){
        x = xx;
        y = yy;
        width = 20;
        height = 20;
    }

    public void draw(Graphics2D g2){
    	if (!eaten) {
    		g2.setColor(Color.WHITE);
    		g2.fillOval(x + 8, y + 8, 6, 6);
    	}
    }
    
    public boolean eatIfPossible(PacMan p) {
    	if (!eaten && p.x + 7 == x && p.y + 7 == y) {
    		eaten = true;
    		return true;
    	}
    	return false;
    }
}