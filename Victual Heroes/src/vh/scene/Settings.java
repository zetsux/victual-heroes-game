package vh.scene;

import java.awt.Color;
import java.awt.Graphics;

import vh.main.GameMain;

public class Settings extends GameScene implements SceneMethods {

	public Settings(GameMain game) {
		super(game);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, 640, 640);
		g.setColor(Color.BLACK);
		g.drawString("SETTINGS TAB", 320, 320);
	}

}
