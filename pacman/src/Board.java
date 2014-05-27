import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.util.ArrayList;



public class Board {

	public ArrayList<Rectangle> walls;
	Rectangle main;
	
	public Board() {
		makeboard();
		
	}
	 
	public ArrayList<Rectangle> makeboard() {
		walls = new ArrayList<Rectangle>();

		/**
        //walls.add(new Rectangle(0, 0, 1425, 850));
        walls.add(new Rectangle(625, 350, 175, 100));
        // the boarder
      //  walls.add(new Rectangle(375, 50, 675, 750));

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
        walls.add(new Rectangle(700, 675, 25, 75)); **/
		walls.add(new Rectangle(220, 260, 140, 80));
		walls.add(new Rectangle(60, 60, 60, 40));
		walls.add(new Rectangle(160, 60, 80, 40));
		walls.add(new Rectangle(340, 60, 80, 40));
		walls.add(new Rectangle(460, 60, 60, 40));
		walls.add(new Rectangle(20, 200, 100, 80));
		walls.add(new Rectangle(20, 320, 100, 80));
		walls.add(new Rectangle(460, 200, 100, 80));
		walls.add(new Rectangle(460, 320, 100, 80));
		walls.add(new Rectangle(60, 140, 60, 20));
		walls.add(new Rectangle(460, 140, 60, 20));
		walls.add(new Rectangle(160, 140, 20, 140));
		walls.add(new Rectangle(220, 140, 140, 20));
		walls.add(new Rectangle(400, 140, 20, 140));
		walls.add(new Rectangle(280, 20, 20, 80));
		walls.add(new Rectangle(180, 200, 60, 20));
		walls.add(new Rectangle(340, 200, 60, 20));
		walls.add(new Rectangle(280, 160, 20, 60));
		walls.add(new Rectangle(220, 380, 140, 20));
		walls.add(new Rectangle(280, 400, 20, 60));
		walls.add(new Rectangle(160, 320, 20, 80));
		walls.add(new Rectangle(400, 320, 20, 80));
		walls.add(new Rectangle(160, 440, 80, 20));
		walls.add(new Rectangle(340, 440, 80, 20));
		walls.add(new Rectangle(20, 500, 40, 20));
		walls.add(new Rectangle(520, 500, 40, 20));
		walls.add(new Rectangle(60, 440, 60, 20));
		walls.add(new Rectangle(460, 440, 60, 20));
		walls.add(new Rectangle(460, 460, 20, 60));
		walls.add(new Rectangle(100, 460, 20, 60));
		walls.add(new Rectangle(160, 500, 20, 60));
		walls.add(new Rectangle(400, 500, 20, 60));
		walls.add(new Rectangle(60, 560, 180, 20));
		walls.add(new Rectangle(340, 560, 180, 20));
		walls.add(new Rectangle(220, 500, 140, 20));
		walls.add(new Rectangle(280, 520, 20, 60));
		
		walls.add(new Rectangle(0, 0, 20, 280));
		walls.add(new Rectangle(0, 320, 20, 320));
		walls.add(new Rectangle(20, 0, 540, 20));
		walls.add(new Rectangle(560, 0, 20, 280));
		walls.add(new Rectangle(560, 320, 20, 320));
		walls.add(new Rectangle(20, 620, 540, 20));

        
        
        return walls;
	}
	
	public boolean intersects(Rectangle r) {
		for (Rectangle wall: walls) {
			if (wall.intersects(r)) {
				return true;
			}
		}
		return false;
	}

}
