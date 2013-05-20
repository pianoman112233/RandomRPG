package in.mcwh.pianoman112233.guis;

import in.mcwh.pianoman112233.gui.Gui;
import in.mcwh.pianoman112233.main.RenderEngine;
import in.mcwh.pianoman112233.main.Resources;
import in.mcwh.pianoman112233.main.ZombieRPG;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;

public class SplashScreen extends Gui {

	public double speed = 0.01;
	float timer=0;
	boolean splash=true;
	int splashval=0;
	public static Color bgcol=new Color(230,230,230);
	@Override
	public void render(GameContainer gc, Graphics g) {
		// TODO Auto-generated method stub	
		
		if(!splash){
			g.setBackground(bgcol);//nice fade effects :)
		}

		if(!ZombieRPG.re.isFullscreen){
			g.scale(0.75f, 0.8f);
			g.drawImage(Resources.splashscreens.get(splashval), 0, 0);
			g.scale(1f, 1f);}
		else{
			g.drawImage(Resources.splashscreens.get(splashval), 0, 0);
		}
	}
	@Override
	public void update(GameContainer gc, int delta) {
		int midPoint=gc.getWidth()/2;
		
		if(splash){
			if(Resources.splashscreens.get(splashval).getAlpha()<=1){
				if(Resources.splashscreens.get(splashval)!=null){
					Resources.splashscreens.get(splashval).setAlpha((float) (Resources.splashscreens.get(splashval).getAlpha()+speed));
				}
			}else{
				timer=timer+delta;
			}
			if(timer/2000>=1){//1000 == 1 second
				splash=false;
			}
		}else{
			if(Resources.splashscreens.get(splashval).getAlpha()>=0){
				if(Resources.splashscreens.get(splashval)!=null){
					Resources.splashscreens.get(splashval).setAlpha((float) (Resources.splashscreens.get(splashval).getAlpha()-speed));
				}
			}else{
				if(splashval!=Resources.splashscreens.size()-1){
					splash=true;
					timer=0;
					splashval++;
				}else{
					//ZombieRPG.re.gui = new MainMenu();
				}
			}
		}
	}
	@Override
	public void init(GameContainer gc) {
		// TODO Auto-generated method stub
		
	}
}


