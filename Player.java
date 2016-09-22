package javagame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.lwjgl.input.Mouse;

public class Player {
	public static int mouseX = Mouse.getX();
	public static int mouseY = Game.windowHeight - Mouse.getY();
}
