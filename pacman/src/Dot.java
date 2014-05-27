import java.applet.Applet;
import java.awt.*;
/**
 * Created with IntelliJ IDEA.
 * User: robert_williams
 * Date: 5/20/14
 * Time: 12:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class Dot{
    private int x;
    private int y;

    public Dot(int xx, int yy){
        x = xx;
        y = yy;
    }

    public void draw(Graphics2D g2){
        g2.setColor(Color.WHITE);
        g2.fillOval(x,y, 10, 10);
        g2.fillOval(x + 20, y + 20, 20, 20 );


    }
}