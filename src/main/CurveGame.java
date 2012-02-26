package main;

import java.util.ArrayList;
import org.newdawn.slick.Color;

import models.Player;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;

public class CurveGame extends BasicGame {
	private ArrayList<Player> players = new ArrayList<Player>();

	public CurveGame() {
		super("NewCurve");
	}

	@Override
	public void init(GameContainer container) throws SlickException {
		Rectangle simpleMap = new Rectangle(0, 0, 800, 600);
		
		//TODO: Replace with proper player menu
		players.add(new Player("Gregor", Color.blue));
		for (int i = 0; i < players.size(); i++) {
			players.get(i);
		}
	}

	@Override
	public void update(GameContainer container, int delta)
			throws SlickException {
		
	}
	@Override
	public void render(GameContainer arg0, Graphics arg1) throws SlickException {
		
	}



	/**
	 * @param args
	 * @throws SlickException 
	 */
	public static void main(String[] args) throws SlickException {
		AppGameContainer game = new AppGameContainer(new CurveGame());
		game.setDisplayMode(800, 600, false);
		game.start();
	}

}
