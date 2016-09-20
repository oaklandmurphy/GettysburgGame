package javagame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Game extends StateBasedGame{
	
	//declares all of the name related variables
	public static final String gameName = "Battle of Gettysburg";
	public static final String gameVersion = "1.0";
	public static final String gameTitle = gameName + " (" + gameVersion + ")";
	
	//declare game states
	public static final int MENU = 0;
	public static final int BATTLE = 1;
	
	public Game(String gamename) {
		super(gamename);
		this.addState(new Menu(MENU));
		this.addState(new Battle(BATTLE));
	}
	
	public void initStatesList(GameContainer gc) throws SlickException {
		this.getState(MENU).init(gc, this);
		this.getState(BATTLE).init(gc, this);
		
		this.enterState(MENU);
	}
	
	public static void main(String[] args) {
		AppGameContainer appgc;
		
		try {
			appgc = new AppGameContainer(new Game(gameTitle));
			appgc.setDisplayMode(1280, 720, false);
			appgc.start();
		}catch(SlickException e) {
			e.printStackTrace();
		}
	}

}
