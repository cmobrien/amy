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

    Ghost1 gh = new Ghost1(100, 100, 2, Color.BLUE);
    Board b = new Board();

    PacMan p = new PacMan(23, 23, 5, b);


    public void init(){
        setFocusable(true);
        keys = new boolean[120];
        addKeyListener(this);
        t = new Timer(50, this);
        t.start();
        lives = 3;
        
    }

    public void paint(Graphics g){
        setBackground(Color.BLACK);
        resize(580,640);
        Graphics2D g2 = (Graphics2D)g;
        ((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //g2.setColor(Color.black);
        g2.setColor(new Color(27, 65, 193));
        for(int i = 0; i < b.makeboard().size(); i++){
            //if(i!= 1)
                g2.fill(b.makeboard().get(i));
            //else
              //  g2.draw(b.makeboard().get(i));
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

        p.setLocation();
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



