package vh.scene;

import vh.main.GameMain;

public class GameScene {

	private GameMain game;
	
	public GameScene(GameMain game) {
		this.game = game;
	}
	
	public GameMain getGame() {
		return game;
	}
}
