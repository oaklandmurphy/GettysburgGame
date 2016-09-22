package javagame;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public abstract class Promotion {
	Discipline discipline = new Discipline();
	
	
	public static Promotion[] standardInfantry = new Promotion[1];
	standardInfantry[0] = discipline;
	
	public abstract void effect(Unit unit);
	
}
