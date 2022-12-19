package vh.scene;

import java.awt.Color;
import java.awt.Graphics;

import vh.main.GameMain;
import vh.ui.Button;

public class GameScene {

	private GameMain game;
	protected int animationIdx;
	protected int animationSpd = 25;
	protected int tick;
	
	public GameScene(GameMain game) {
		this.game = game;
	}
	
	public GameMain getGame() {
		return game;
	}
	
	protected void updateTick() {
		tick++;
		if (tick >= animationSpd) {
			tick = 0;
			animationIdx++;
			if (animationIdx == 4) animationIdx = 0;
		}
	}
	
	protected void drawButtonFb(Graphics g, Button b) {
		if (b.isOver()) {
			g.setColor(Color.WHITE);
		} 
		
		else {
			g.setColor(Color.BLACK);
		}
		
		g.drawRect(b.x, b.y, b.width, b.height);
		
		if (b.isPressed()) {
			g.setColor(Color.WHITE);
			g.drawRect(b.x + 1, b.y + 1, b.width - 2, b.height - 2);
			g.drawRect(b.x + 2, b.y + 2, b.width - 4, b.height - 4);
		}
	}
}
