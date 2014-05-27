import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.util.ArrayList;



public class Board {
	private ArrayList<Rectangle> walls;
	Graphics g;
	public Board() {
		makeboard();
	}
	 
	public ArrayList<Rectangle> makeboard() {
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
        
        
        return walls;
	}

}
