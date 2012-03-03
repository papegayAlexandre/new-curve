package main;

import models.Map;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

import controllers.GameController;
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
		map = new Map(800, 600);
		map.loadPlayers();
		pField = new PlayingField(map);
		GameController gc = new GameController(map.getPlayers());
		container.getInput().addPrimaryListener(gc);
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
