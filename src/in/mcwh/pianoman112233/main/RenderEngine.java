package in.mcwh.pianoman112233.main;


import in.mcwh.pianoman112233.gui.Gui;
import in.mcwh.pianoman112233.guis.SplashScreen;

import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class RenderEngine extends BasicGame {
	public boolean isFullscreen=false;
	Gui gui=new SplashScreen();
	GameContainer ccontainer;
	public RenderEngine(String title, int swidth, int sheight) {
		super(title);
	}

	@Override
	public void render(GameContainer container, Graphics g)
			throws SlickException {
		gui.render(container, g);
	}

	@Override
	public void init(GameContainer container) throws SlickException {
		// TODO Auto-generated method stub
		Resources.load();
	}

	@Override
	public void update(GameContainer container, int delta)
			throws SlickException {
		this.ccontainer = container;
		gui.update(container, delta);
	}
	
	public void setGUI(Gui g){
		this.gui=g;
		g.init(ccontainer);
	}
}
