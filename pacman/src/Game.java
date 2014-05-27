import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: robert_williams
 * Date: 5/15/14
 * Time: 11:05 AM
 * To change this template use File | Settings | File Templates.
 */
public class Game extends Applet implements ActionListener, KeyListener{
    Timer t;
    private int counter, lives;
    private boolean open;
    private boolean[] keys;

    PacMan p = new PacMan(30, 30, 5);
    Ghost1 gh = new Ghost1(100, 100, 2, Color.BLUE);
    private ArrayList<Rectangle> walls;

    public void init(){
        setFocusable(true);
        keys = new boolean[120];
        addKeyListener(this);
        t = new Timer(50, this);
        t.start();
        lives = 3;
        
        walls = new ArrayList<Rectangle>();
        //walls.add(new Rectangle(0, 0, 1425, 850));
        walls.add(new Rectangle(625, 350, 175, 100));

        walls.add(new Rectangle(375, 50, 675, 750));

        walls.add(new Rectangle(425, 100, 75, 50));
        walls.add(new Rectangle(550, 100, 100, 50));
        walls.add(new Rectangle(775, 100, 100, 50));
        walls.add(new Rectangle(925, 100, 75, 50));

        walls.add(new Rectangle(375, 275, 125, 100));
        walls.add(new Rectangle(375, 425, 125, 100));
        walls.add(new Rectangle(925, 275, 125, 100));
        walls.add(new Rectangle(925, 425, 125, 100));

        walls.add(new Rectangle(425, 200, 75, 25));

        walls.add(new Rectangle(925, 200, 75, 25));

        walls.add(new Rectangle(550, 200, 25, 175));
        walls.add(new Rectangle(625, 200, 175, 25));
        walls.add(new Rectangle(850, 200, 25, 175));
        walls.add(new Rectangle(700, 50, 25, 100));

        walls.add(new Rectangle(575, 275, 75, 25));
        walls.add(new Rectangle(775, 275, 75, 25));
        walls.add(new Rectangle(700, 225, 25, 75));

        walls.add(new Rectangle(625, 500, 175, 25));
        walls.add(new Rectangle(700, 525, 25, 75));
        walls.add(new Rectangle(550, 425, 25, 100));
        walls.add(new Rectangle(850, 425, 25, 100));

        walls.add(new Rectangle(550, 575, 100, 25));
        walls.add(new Rectangle(775, 575, 100, 25));

        walls.add(new Rectangle(375, 650, 50, 25));
        walls.add(new Rectangle(1000, 650, 50, 25));

        walls.add(new Rectangle(425, 575, 75, 25));
        walls.add(new Rectangle(925, 575, 75, 25));

        walls.add(new Rectangle(925, 600, 25, 75));
        walls.add(new Rectangle(475, 600, 25, 75));

        walls.add(new Rectangle(550, 650, 25, 75));
        walls.add(new Rectangle(850, 650, 25, 75));

        walls.add(new Rectangle(425,725, 225, 25));
        walls.add(new Rectangle(775,725, 225, 25));

        walls.add(new Rectangle(625, 650, 175, 25));
        walls.add(new Rectangle(700, 675, 25, 75));
        
        
    }

    public void paint(Graphics g){
        setBackground(Color.BLACK);
        resize(1600,850);
        Graphics2D g2 = (Graphics2D)g;
        ((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.black);
        g2.setColor(new Color(27, 65, 193));
        for(int i = 0; i < walls.size(); i++){
            if(i!= 1)
                g2.fill(walls.get(i));
            else
                g2.draw(walls.get(i));
        }




        gh.draw(g2);



        if(open)
            p.drawOpen(g2);
        else
            p.drawClosed(g2);


    }

    public void actionPerformed(ActionEvent e){

        if(keys[KeyEvent.VK_RIGHT]){
            p.setDir(0);
        }
        if(keys[KeyEvent.VK_UP]){
            p.setDir(1);
        }
        if(keys[KeyEvent.VK_LEFT]){
            p.setDir(2);
        }
        if(keys[KeyEvent.VK_DOWN]){
            p.setDir(3);
        }


        counter ++;
        if(counter%4 == 0)
            open = !open;
        p.move();
        gh.move();
        if(p.intersects(gh))
            p = null;

        repaint();
    }

    public void keyPressed(KeyEvent e)
    {
        if(e.getKeyCode() >= 120)
            e.consume();
        else
            try { keys[e.getKeyCode()] = true; }
            catch (ArrayIndexOutOfBoundsException outbounds)
            {e.consume();}
        repaint();
    }

    public void keyReleased(KeyEvent e)
    {
        keys[e.getKeyCode()] = false;
        repaint();
    }
    public void keyTyped(KeyEvent e)
    {
        if(e.getKeyCode() >= 120)
            e.consume();
        else
            try { keys[e.getKeyCode()] = true; }
            catch (ArrayIndexOutOfBoundsException outbounds)
            {e.consume();}
        repaint();
    }
}



