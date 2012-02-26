package models;

import org.newdawn.slick.Color;

public class Player {

	private String name;
	private Color color;
	private int x;
	private int y;
	
	public Player(String name, Color color) {
		setName(name);
		setColor(color);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}


}
