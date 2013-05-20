package in.mcwh.pianoman112233.gui;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public abstract class Gui {
	public abstract void init(GameContainer gc);
	public abstract void update(GameContainer gc, int delta);
	public abstract void render(GameContainer gc, Graphics g);
}
