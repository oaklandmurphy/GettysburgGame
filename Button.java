package javagame;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Button {
	int xpos;
	int ypos;
	int width;
	int height;
	Input input;
	public Button(int x, int y, int width, int height, GameContainer gc) {
		xpos = x;
		ypos = y;
		this.width = width;
		this.height = height;
		input = gc.getInput();
	}
	public boolean isHovered() {
		if (Mouse.getX() >= xpos && Mouse.getX() <= xpos + width && Mouse.getY() >= ypos && Mouse.getY() <= ypos + height) { 
			return true; 
			}
		return false;
	}
	public boolean isClicked() {
		if (isHovered()) {
			if (input.isMouseButtonDown(0)) {
				return true;
			}
		}
		return false;
	}
}
