package javagame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import java.util.ArrayList;

public class Battle extends BasicGameState {
	public Battle(int state) {
		
	}
	
	//initiate variables used in this state
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
		ArrayList soldier = new ArrayList();
		ArrayList tiles = new ArrayList();
		soldier.add(new Unit(100,100,100,100,100,100, gc));
	}
	
	//update data needed in this state
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		
	}
	
	//render objects on screen
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
		
	}
	
	public int getID() {
		return 1;
	}
}
