package main;

import java.util.ArrayList;
import org.newdawn.slick.Color;

import models.Map;
import models.Player;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;

import views.PlayingField;

public class CurveGame extends BasicGame {
	private PlayingField pField;
	private Map map;

	public CurveGame() {
		super("NewCurve");
	}

	@Override
	public void init(GameContainer container) throws SlickException {
		//TODO: Replace with proper map loading
		pField = new PlayingField(map);
		
		map = new Map(800, 600);
		map.loadPlayers();
	}

	@Override
	public void update(GameContainer container, int delta)
			throws SlickException {
		map.movePlayers(delta);
	}

	@Override
	public void render(GameContainer arg0, Graphics g) throws SlickException {
		pField.draw(g);
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
