package controllers;

import java.util.ArrayList;

import models.Player;

import org.newdawn.slick.Input;
import org.newdawn.slick.InputListener;

public class GameController implements InputListener {

	private ArrayList<Player> players;
	
	public GameController(ArrayList<Player> players) {
		this.players = players;
	}
	
	@Override
	public void mouseClicked(int arg0, int arg1, int arg2, int arg3) {
		
	}

	@Override
	public void mouseDragged(int arg0, int arg1, int arg2, int arg3) {
		
	}

	@Override
	public void mouseMoved(int arg0, int arg1, int arg2, int arg3) {
		
	}

	@Override
	public void mousePressed(int arg0, int arg1, int arg2) {
		
	}

	@Override
	public void mouseReleased(int arg0, int arg1, int arg2) {
		
	}

	@Override
	public void mouseWheelMoved(int arg0) {
		
	}

	@Override
	public void inputEnded() {
		
	}

	@Override
	public void inputStarted() {
		
	}

	@Override
	public boolean isAcceptingInput() {
		return false;
	}

	@Override
	public void setInput(Input arg0) {
		
	}

	@Override
	public void keyPressed(int key, char c) {
		System.out.println(key);
		if(key == Input.KEY_LEFT) {
			for (int i = 0; i < players.size(); i++) {
				players.get(i).setOrientation(players.get(i).getOrientation() + 10);
			}
		}
	}

	@Override
	public void keyReleased(int key, char c) {
		System.out.println(key);
	}

	@Override
	public void controllerButtonPressed(int arg0, int arg1) {
		
	}

	@Override
	public void controllerButtonReleased(int arg0, int arg1) {
		
	}

	@Override
	public void controllerDownPressed(int arg0) {
		
	}

	@Override
	public void controllerDownReleased(int arg0) {
		
	}

	@Override
	public void controllerLeftPressed(int arg0) {
		
	}

	@Override
	public void controllerLeftReleased(int arg0) {
		
	}

	@Override
	public void controllerRightPressed(int arg0) {
		
	}

	@Override
	public void controllerRightReleased(int arg0) {
		
	}

	@Override
	public void controllerUpPressed(int arg0) {
		
	}

	@Override
	public void controllerUpReleased(int arg0) {
		
	}

}
