package javagame;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

import org.newdawn.slick.SlickException;

public class CorpsCommander extends Unit{

	public CorpsCommander(String bgn, String nn, String div, String co, String aff, int bgr, int tr, int x, int y) throws SlickException {
		super(bgn, div, co, aff, bgr, tr, 3, x, y);
	}
	
	//commanders can move, rest, or inspire nearby troops by raising their morale 
	public void displayActions() {
		//TODO
	}
		
	//the commander inspires a brigade under his command, raising their moral significantly
	public void action1(Unit targ) {
		//TODO
	}
	
	//unused for now
	public void action2(Unit targ) {
		//TODO
	}
}
