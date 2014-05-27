import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.util.ArrayList;
import java.util.List;



public class Board {

	public ArrayList<Rectangle> walls;
	Rectangle main;
	
	public Board() {
		makeboard();
		
	}
	 
	public void makeboard() {
		walls = new ArrayList<Rectangle>();
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
	}
	
	public List<Rectangle> getWalls() {
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
