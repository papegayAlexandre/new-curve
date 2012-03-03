package models;

import java.awt.Point;
import java.util.ArrayList;

import org.newdawn.slick.Color;

public class Map {

	private int width;
	private int height;
	private ArrayList<Player> players;

	public Map(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public void loadPlayers() {
		players = new ArrayList<Player>();
		players.add(new Player("Gregor", Color.blue, getSafePos(), 0));
		players.add(new Player("Furfm", Color.green, getSafePos(), 230));
	}

	public void movePlayers(int delta) {
		for (int i = 0; i < players.size(); i++) {
			players.get(i).move(delta);
		}
	}

	public Point getSafePos() {
		int x = (int) Math.round(Math.random() * width);
		int y = (int) Math.round(Math.random() * height);
		Player p;
		for (int i = 0; i < players.size(); i++) {
			p = players.get(i);
			while (p.getX() == x && p.getY() == y) {
				x = (int) Math.round(Math.random() * width);
				y = (int) Math.round(Math.random() * height);
				i = 0;
			}
		}
		return new Point(x, y);
	}

	public ArrayList<Player> getPlayers() {
		return players;
	}

}
