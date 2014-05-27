import java.applet.Applet;
import java.awt.*;
/**
 * Created with IntelliJ IDEA.
 * User: robert_williams
 * Date: 5/20/14
 * Time: 1:00 PM
 * To change this template use File | Settings | File Templates.
 */

public abstract class SISprite extends Rectangle {
    private int vx, vy;

    public SISprite(int xx, int yy, int ww, int hh, int vxx, int vyy){
        super(xx, yy, ww, hh);
        vx = vxx;
        vy = vyy;

    }

    public abstract void draw(Graphics2D g2);

    public void move(Applet applet){
        x += vx;
        y += vy;
    }
    public void move(int dx, int dy, Applet applet){
        x += dx;
        y += dy;
    }

    public void changeVx(){
        vx = -vx;
    }



}
