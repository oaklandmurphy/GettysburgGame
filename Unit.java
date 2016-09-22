package javagame;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public abstract class Unit {
	//image for menu purposes
	Image icon;
	
	//image used on the game board
	Image sprite;
	
	//keep track of position
	int xpos;
	int ypos;
	
	//identification variables
	String brigGeneralName;
	String division;
	String corps;
	String affiliation;
	
	//Game play Variables
	int troops;
	int movement;
	int brigGeneralRating;
	int morale;
	int effectiveness;
	Promotion[] promotions;
	
	public Unit(String bgn, String div, String co, String aff, int bgr, int tr, int move, int x, int y/*, Promotion[] promos*/) throws SlickException {
		brigGeneralName = bgn;
		division = div;
		corps = co;
		affiliation = aff;
		
		troops = tr;
		movement = move;
		morale = 100;
		brigGeneralRating = bgr;
		
		xpos = x;
		ypos = y;
		
		//promotions = promos;
		
		sprite = new Image("res/temp.png");
		
	}
	//setters and getters
	public int getTroops() {
		return troops;
	}
	public void setTroops(int health) {
		this.troops = health;
	}
	public Image getImage() {
		return sprite;
	}
	public int getXpos() {
		return xpos;
	}
	public int getYpos() {
		return ypos;
	}
	public void setXpos(int x) {
		xpos = x;
	}
	public void setYpos(int y) {
		ypos = y;
	}
	
	//unit will move one tile in the specified direction 
	public void Move(int direction) {
		//TODO
	}
	
	//unit will move a number of tiles to the desired tile
	public void pathTo(int x, int y) {
		//TODO
	}
	
	//if a unit does not perform an action during this turn, then it rests and regenerates some morale based on its brigadier general's quality
	public void rest() {
		if (morale < 100) {
			morale += brigGeneralRating * 5;
		}
		
		if (morale > 100) {
			morale = 100;
		}
	}
	
	//displays the icon, unit strength, unit name and other useful info on the board
	public void displayInfo() {
		//TODO
	}
	
	//Abstract methods
	
	//displays the actions that can be taken by a unit
	public abstract void displayActions();
	
	//the unit performs its primary attack type (ex; infantry fires a volley, canons fire a barrage)
	public abstract void action1(Unit targ);
	
	//the unit performs its secondary attack type
	public abstract void action2(Unit targ);
	
	
}