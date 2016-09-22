package javagame;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Cavalry extends Unit{

	public Cavalry(String bgn, String nn, String div, String co, String aff, int bgr, int tr, int x, int y) throws SlickException {
		super(bgn, div, co, aff, bgr, tr, 5, x, y);
	}
	
	//Cavarly can move, rest, charge the enemy, or harass hostile troops
	public void displayActions() {
		//TODO
	}
	
	//the cavalry detachment charges and enemy position and will either take it or be repelled
	public void action1(Unit targ) {
		//TODO
	}
	
	//the cavalry harasses the enemy by firing carbines from horseback, doing little damage but significantly reducing morale
	public void action2(Unit targ) {
		//TODO
	}
}
