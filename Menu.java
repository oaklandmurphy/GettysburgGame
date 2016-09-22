package javagame;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Menu extends BasicGameState{
	Image title;
	boolean readyToPlay;
	boolean readyToOptions;
	boolean readyToQuit;
	public Menu(int state) {
		
	}
	
	//initiate variables used in this state
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
		title = new Image("res/Title.jpg");
	}
	//update data needed in this state
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		int xpos = Mouse.getX();
		int ypos = Mouse.getY();
		Input input = gc.getInput();
		if (xpos >= 620 && xpos <= 700 && ypos >= 230 && ypos <= 258) { readyToPlay = true; } else { readyToPlay = false; }
		if (xpos >= 620 && xpos <= 700 && ypos >= 145 && ypos <= 173) { readyToQuit = true; } else { readyToQuit = false; }
		if (xpos >= 588 && xpos <= 748 && ypos >= 195 && ypos <= 223) { readyToOptions = true; } else { readyToOptions = false; }
		if (input.isMouseButtonDown(0)) {
			if (readyToPlay == true) {
					sbg.enterState(1);
			}
			if (readyToOptions == true) {
				sbg.enterState(2);
			}
			if (readyToQuit == true) {
				//This will close the program
			}
		}
	}
	
	//render objects on screen
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
		g.drawImage(title, 340, 195/2);
		if (readyToPlay == true) { } else { //g.drawRect(280 + 340, 370 + 195/2, 100, 28); 
		}
		if (readyToOptions == true) { } else { //g.drawRect(588, 411 + 195/2, 160, 28); 
		}
		if (readyToQuit == true) { } else { //g.drawRect(620, 452 + 195/2, 100, 28); 
		}
	}
	
	public int getID() {
		return 0;
	}
}
