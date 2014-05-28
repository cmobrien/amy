import javax.swing.*;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

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

    private int score;

   // Ghost1 gh = new Ghost1(100, 100, 2, Color.BLUE);
    Board b = new Board();
    Ghost1 gh = new Ghost1(100, 105, 2, Color.RED, b);
    PacMan p = new PacMan(23, 23, 5, b);
    List<Dot> dots;


    public void init(){
        setFocusable(true);
        keys = new boolean[120];
        addKeyListener(this);
        t = new Timer(50, this);
        t.start();
        lives = 3;
        dots = generateDots(b);
        score = 0;
        
        
    }
    
    public List<Dot> generateDots(Board b) {
    	List<Dot> dots = new ArrayList<Dot>();
    	for (int i = 30; i < 550; i += 20) {
    		for (int j = 30; j < 610; j += 20) {
    			Dot d = new Dot(i, j);
    			if (!b.intersects(d)) {
    				dots.add(d);
    			}
    		}
    	}
    	return dots;
    }

    public void paint(Graphics g){
        setBackground(Color.BLACK);
        resize(580, 670);
        Graphics2D g2 = (Graphics2D) g;
        ((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(27, 65, 193));
        for(int i = 0; i < b.getWalls().size(); i++){
        	g2.fill(b.getWalls().get(i));
        }

        for (Dot d: dots) {
        	d.draw(g2);
        }
        
        gh.draw(g2);
        if(open)
            p.drawOpen(g2);
        else
            p.drawClosed(g2);
        
        g2.setColor(Color.WHITE);
        g.setFont(new Font("TimesRoman", Font.BOLD, 18)); 
        g2.drawString("SCORE: " + score, 100, 660);
        g2.drawString("LIVES: " + lives, 400, 660);
        if (lives == 0) {
        	g2.setFont(new Font("TimesRoman", Font.PLAIN, 60));
        	g2.drawString("GAME OVER", 150,300);
        	p.x = 1000;
        	p.y = 1000;
        }
    }

    public void actionPerformed(ActionEvent e){
    	
    	for (Dot d: dots) {
    		if (d.eatIfPossible(p)) {
    			score += 20;
    		}
    	}

    	
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
        gh.setLocation();
        
        int a = gh.chooseDir(p);
        gh.setDir(a);
        
        if(p.intersects(gh)) {
        	//p = null;
        	lives -= 1;
        	p.x = 23;
        	p.y = 23;
        	
        }
        
        	
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



