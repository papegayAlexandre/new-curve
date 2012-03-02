package views;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Rectangle;

public class PlayingField {
	
	//TODO proper map handling
	public void draw(Graphics g) {
		Rectangle simpleMap = new Rectangle(0, 0, 800, 600);
		Rectangle simpleMap2 = new Rectangle(10, 10, 780, 580);
		g.setColor(Color.red);
		g.fill(simpleMap);
		g.setColor(Color.black);
		g.fill(simpleMap2);
	}

}
