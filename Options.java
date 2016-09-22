package javagame;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Options extends BasicGameState{
	Input input;
	Button fullScreenButton;
	Button resolution;
	public Options(int state) {
		
	}
	
	//initiate variables used in this state
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
		input = gc.getInput();
		fullScreenButton = new Button(620, 230, 100 , 28, gc);
		resolution = new Button(620, 270 ,100 ,28 , gc );
	}
	//update data needed in this state
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		if (fullScreenButton.isClicked()) {	
			Game.fullScreen = true;
		}
		if (fullScreenButton.isClicked()) {	
			
		}
		
	}
	
	//render objects on screen
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
		g.drawRect(620, 370 + 195/2, 100, 28); 
		g.drawRect(620 + 340, 270, 100, 28);
	}
	
	public int getID() {
		return 2;
	}
}
