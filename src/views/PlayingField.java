package views;

import java.awt.Point;
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
		drawMap(g);
		drawPlayers(g);
	}

	public void drawPlayers(Graphics g) {
		ArrayList<Player> players = map.getPlayers();
		ArrayList<Point> trail = null;
		Player pl;
		Ellipse pEll;
		Point p;
		for (int i = 0; i < players.size(); i++) {
			pl = players.get(i);
			trail = pl.getTrail();
			for (int j = 0; trail != null && j < trail.size(); j++) {
				p = trail.get(j);
				pEll = new Ellipse(p.x, p.y, 2, 2);
				g.setColor(pl.getColor());
				g.fill(pEll);
			}
		}
	}

}
