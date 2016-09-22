package javagame;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Artillery extends Unit{
	
	public Artillery(String bgn, String nn, String div, String co, String aff, int bgr, int tr, int x, int y) throws SlickException {
		super(bgn, div, co, aff, bgr, tr, 2, x, y); 
	}
	
	//Artillery can move, rest, limber (if limbered), unlimber (if limbered), switch ammo types, fire a barrage, or provide supporting fire
	public void displayActions() {
		//TODO
	}
	
	//The battery fires a barrage using one of 3 types of ammo
	public void action1(Unit targ) {
		//TODO
	}
	
	//The battery toggles between a limbered and unlimbered state
	public void action2(Unit targ) {
		//TODO
	}
}
