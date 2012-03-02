package views;

import java.util.ArrayList;

import models.Map;
import models.Player;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Ellipse;
import org.newdawn.slick.geom.Rectangle;

public class PlayingField {
	private Map map;

	public PlayingField(Map map) {
		this.map = map;
	}
	
	// TODO proper map handling
	public void drawMap(Graphics g) {
		Rectangle simpleMap = new Rectangle(0, 0, 800, 600);
		Rectangle simpleMap2 = new Rectangle(10, 10, 780, 580);
		g.setColor(Color.red);
		g.fill(simpleMap);
		g.setColor(Color.black);
		g.fill(simpleMap2);
	}
	
	public void draw(Graphics g) {
		drawPlayers(g);
	}
	
	public void drawPlayers(Graphics g) {
		ArrayList<Player> players = map.getPlayers();
		for (int i = 0; i < players.size(); i++) {
			Ellipse pEll = new Ellipse(players.get(i).getX(), players.get(i).getY(), 1, 1);
			g.setColor(players.get(i).getColor());
			g.fill(pEll);
		}
	}

}
