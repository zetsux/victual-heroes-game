package vh.scene;

import java.awt.Graphics;

import ObjectManagers.MapTileManager;
import helper.LevelBuilder;
import vh.main.GameMain;

public class Playing extends GameScene implements SceneMethods {

	private int[][] level;
	private MapTileManager tileManager;
	
	public Playing(GameMain game) {
		super(game);
		
		level = LevelBuilder.getLevel();
		tileManager = new MapTileManager();
	}

	@Override
	public void render(Graphics g) {

		for (int i = 0; i < level.length; i++) {
			for (int j = 0; j < level[i].length; j++) {
				int id = level[i][j];
				g.drawImage(tileManager.getMap(id), j * 16, i * 16, null);
			}
		}
	}

	@Override
	public void mouseClicked(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(int x, int y) {
		// TODO Auto-generated method stub
		
	}

}
