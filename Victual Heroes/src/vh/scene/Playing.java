package vh.scene;

import java.awt.Graphics;
import java.util.Random;

import vh.objectManagers.EnemyManager;
import vh.objectManagers.MapTileManager;
import vh.helper.LevelBuilder;
import vh.main.GameMain;

public class Playing extends GameScene implements SceneMethods {

	private int[][] level, level2, level3;
	private MapTileManager tileManager;
	private EnemyManager enemyManager;
	private Random rand;
	
	public Playing(GameMain game) {
		super(game);
		
		level = LevelBuilder.getBackLayer();
		level2 = LevelBuilder.getEnemyPath();
		level3 = LevelBuilder.getTowerPath();
		tileManager = new MapTileManager();
		enemyManager = new EnemyManager(this);
		rand = new Random();
	}

	public void update() {
		updateTick();
		enemyManager.update();
	}
	
	@Override
	public void render(Graphics g) {

		drawMap(g);
		enemyManager.draw(g);
	}

	private void drawMap(Graphics g) {
		
		for (int y = 0; y < level.length; y++) {
			for (int x = 0; x < level[y].length; x++) {
				
				// First Layer
				int id = level[y][x];
				g.drawImage(tileManager.getMap(id-1), x * 16, y * 16, null);
				
				// Second Layer
				int id2 = level2[y][x];
				g.drawImage(tileManager.getMap(id2-1), x * 16, y * 16, null);
				
				// Third Layer
				int id3 = level3[y][x];
				g.drawImage(tileManager.getMap(id3-1), x * 16, y * 16, null);
			}
		}
	}
	
	public int getTileType(int x, int y) {
		int xPos = x/16, yPos = y/16;
		
		if (xPos < 0 || xPos > 63 || yPos < 0 || yPos > 35) {
			return 0;
		}
		
		int id = level2[yPos][xPos];
		return tileManager.getTile(id).getTileType();
	}

	@Override
	public void mouseClicked(int x, int y) {
		enemyManager.addEnemy(x, y, rand.nextInt(0, 7));
		
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
	
	@Override
	public void keyTyped(int n) {
		enemyManager.addEnemy(n);
	}
}