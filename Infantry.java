package javagame;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Infantry extends Unit{
	
	public Infantry(String bgn, String nn, String div, String co, String aff, int bgr, int tr, int x, int y) throws SlickException {
		super(bgn, div, co, aff, bgr, tr, 3, x, y);
	}
	
	//infantry can move, rest, fire a volley, or charge the enemy
	public void displayActions() {
		//TODO
	}
	
	//the infantry brigade engages in volley fire with the enemy
	public void action1(Unit targ) {
		//TODO
	}
	
	//the brigade charges a hostile position and will either take it or be repelled
	public void action2(Unit targ) {
		//TODO
	}
	
}
