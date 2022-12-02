package vh.scene;

import vh.main.GameMain;

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
}
