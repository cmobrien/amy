import java.awt.*;
/**
 * Created with IntelliJ IDEA.
 * User: robert_williams
 * Date: 5/20/14
 * Time: 12:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class Ghost1 extends SISprite{
    private int dir, v;
    private Color c;

    public Ghost1(int xx, int yy, int vel, Color col){
        super(xx, yy, 3, 3, 0, 0);
        v = vel;
        dir = 0;
        c = col;
    }

    public void draw(Graphics2D g2){

        g2.setColor(Color.BLACK);

        g2.drawRect(x, y, 3, 3);

        g2.setColor(c);
        g2.fillRect((int)(this.getX()) + 12, (int)(this.getY()) - 9, 12, 3 );
        g2.fillRect((int)(this.getX()) + 6, (int)(this.getY()) - 6, 24, 3);
        g2.fillRect((int)(this.getX()) + 3, (int)(this.getY()) - 3, 30, 3);
        g2.fillRect((int)(this.getX()) + 9, (int)(this.getY()), 3, 3);
        g2.fillRect((int)(this.getX()) + 12, (int)(this.getY()), 3, 33);
        g2.fillRect((int)(this.getX()) + 15, (int)(this.getY()), 3, 27);
        g2.fillRect((int)(this.getX()) + 18, (int)(this.getY()), 3, 3);
        g2.fillRect((int)(this.getX()) + 27, (int)(this.getY()), 9, 3);
        g2.fillRect((int)(this.getX()) - 3, (int)(this.getY()) + 9, 3, 24);
        g2.fillRect((int)(this.getX()), (int)(this.getY()) + 12, 3, 18);
        g2.fillRect((int)(this.getX()) + 3, (int)(this.getY()) + 15, 3, 12);
        g2.fillRect((int)(this.getX()) + 6, (int)(this.getY()) + 15, 3, 15);
        g2.fillRect((int)(this.getX()) + 9, (int)(this.getY()) + 12, 3, 21);


        g2.fillRect((int)(this.getX()) + 18, (int)(this.getY()) + 12, 3, 15);
        g2.fillRect((int)(this.getX()) + 21, (int)(this.getY()) + 15, 6, 18);
        g2.fillRect((int)(this.getX()) + 27, (int)(this.getY()) + 12, 3, 18);

        g2.fillRect((int)(this.getX()) + 30, (int)(this.getY()) + 3, 3, 24);
        g2.fillRect((int)(this.getX()) + 33, (int)(this.getY()) + 3, 3, 27);
        g2.fillRect((int)(this.getX()) + 36, (int)(this.getY()) + 9, 3, 24);

        g2.setColor(Color.blue);

        g2.fillRect((int)(this.getX()), (int)(this.getY()) + 6, 6, 6);
        g2.fillRect((int)(this.getX()) + 18, (int)(this.getY()) + 6, 6, 6);

        g2.setColor(Color.white);

        g2.fillRect((int)(this.getX()) + 3, (int)(this.getY()), 6, 3);
        g2.fillRect((int)(this.getX()), (int)(this.getY()) + 3, 12, 3);
        g2.fillRect((int)(this.getX()) + 6, (int)(this.getY()) + 6, 6, 6);
        g2.fillRect((int)(this.getX()) + 3, (int)(this.getY()) + 12, 6, 3);

        g2.fillRect((int)(this.getX()) + 21, (int)(this.getY()), 6, 3);
        g2.fillRect((int)(this.getX()) + 18, (int)(this.getY()) + 3, 12, 3);
        g2.fillRect((int)(this.getX()) + 24, (int)(this.getY()) + 6, 6, 6);
        g2.fillRect((int)(this.getX()) + 21, (int)(this.getY()) + 12, 6, 3);




    }

    public void move(){ //0 = right, 1 = up, 2 = left, 3 = down
        if(dir == 0)
            x += v;
        if(dir == 1)
            y -= v;
        if(dir == 2)
            x -= v;
        if(dir == 3)
            y += v;
    }

    public void setDir(int a){
        dir = a;
    }

}