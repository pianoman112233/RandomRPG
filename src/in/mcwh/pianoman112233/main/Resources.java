package in.mcwh.pianoman112233.main;

import org.newdawn.slick.BigImage;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

import java.awt.Font;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.newdawn.slick.TrueTypeFont;
import org.newdawn.slick.util.ResourceLoader;

public class Resources {
	public static Image splashscreen;
	public static Image mainmenu;
	public static TrueTypeFont mainFont;
	public static List<Image> splashscreens=new ArrayList<Image>();
	public static void load() throws SlickException{
		splashscreens.add(new Image("res/gui/Logo.png"));
		for(int i=0;i<splashscreens.size();i++){
			splashscreens.get(i).setAlpha(0);
		}
		mainmenu = new Image("res/gui/MainMenu.png");
		//shadow = new Image("res/entitys/shadow.png");
		//tileset = new SpriteSheet("res/world/mariotiles.png", 32, 32);

		try {
			InputStream inputStream = ResourceLoader.getResourceAsStream("res/Fonts/Cartoon_Regular.ttf");
			Font awtFont2 = Font.createFont(Font.TRUETYPE_FONT, inputStream);
			awtFont2 = awtFont2.deriveFont(53f); // set font size
			mainFont = new TrueTypeFont(awtFont2, false);

		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}


