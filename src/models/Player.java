package models;

import java.awt.Point;
import java.util.ArrayList;

import org.newdawn.slick.Color;

public class Player {

	private String name;
	private Color color;
	private int x;
	private int y;
	/** int between 0 and 360 (degrees) */
	private int orientation;

	private double speed = 1.5;

	private ArrayList<Point> trail = new ArrayList<Point>();

	public Player(String name, Color color, Point pos, int orientation) {
		setName(name);
		setColor(color);
		setX(pos.x);
		setY(pos.y);
		setOrientation(orientation);
	}

	public void move(int delta) {
		int xThrust = 0, yThrust = 0;

		trail.add(new Point(getX(), getY()));

		if (orientation <= 90) {
			xThrust = 90 - orientation;
			yThrust = orientation;
		} else if (orientation <= 180) {
			xThrust = 180 - orientation;
			yThrust = 90 - orientation;
		} else if (orientation <= 270) {
			xThrust = 180 - orientation;
			yThrust = orientation - 270;
		} else if (orientation <= 359) {
			xThrust = orientation - 360;
			yThrust = orientation - 270;
		}
		setX((int) Math.round(getX() + (xThrust * speed * delta / 1000f)));
		setY((int) Math.round(getY() + (yThrust * speed * delta / 1000f)));
	}

	public String toString() {
		StringBuilder sb = new StringBuilder(10);
		sb.append(getName()).append(" (").append(getColor()).append("): ")
				.append(getX()).append("/").append(getY()).append(" => ")
				.append(getOrientation());
		return sb.toString();
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

	public int getOrientation() {
		return orientation;
	}

	public void setOrientation(int orientation) {
		while (orientation < 0 || orientation > 359) {
			orientation = orientation < 0 ? orientation + 360
					: orientation - 360;
		}
		this.orientation = orientation;
	}

	public ArrayList<Point> getTrail() {
		return trail;
	}

}
