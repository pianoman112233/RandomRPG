package in.mcwh.pianoman112233.main;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.io.File;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

public class ZombieRPG {
	public static boolean inDev=true;
	public static int width = 1000;
	public static int height = 600;
	public static String game_name="Zombie RPG";
	public static AppGameContainer app;
	
	static GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
	public static int swidth = gd.getDisplayMode().getWidth();
	public static int sheight = gd.getDisplayMode().getHeight();
	public static RenderEngine re = new RenderEngine(game_name, swidth, sheight);
	
	public static void main(String[] args) throws SlickException {
        app = new AppGameContainer(re);
        app.setVSync(true);
        app.setDisplayMode(width, height, false);
        //app.setDisplayMode(screenwidth, screenheight, false);
        app.setResizable(false);
        app.setShowFPS(true);
        app.start();
	}

}
