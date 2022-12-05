package vh.scene;

import java.awt.Graphics;
import java.util.Random;

import vh.objectManagers.EnemyManager;
import vh.objectManagers.MapTileManager;
import vh.objectManagers.TowerManager;
import vh.ui.ButtonBar;
import vh.helper.LevelBuilder;
import vh.main.GameMain;
import vh.object.Tower;

import static vh.helper.Constants.Tiles.*;

public class Playing extends GameScene implements SceneMethods {

	private int[][] level, level2, level3;
	
	private ButtonBar buttonBar;
	
	private MapTileManager tileManager;
	private EnemyManager enemyManager;
	private TowerManager towerManager;
	private Random rand;
	
	private Tower curTower;
	
	private int xMouse, yMouse;
	
	public Playing(GameMain game) {
		super(game);
		
		level = LevelBuilder.getBackLayer();
		level2 = LevelBuilder.getEnemyPath();
		level3 = LevelBuilder.getTowerPath();
		tileManager = new MapTileManager();
		enemyManager = new EnemyManager(this);
		towerManager = new TowerManager(this);
		rand = new Random();
		buttonBar = new ButtonBar(0, 576, 1024, 100, this);
	}

	public void update() {
		updateTick();
		enemyManager.update();
		towerManager.update();
	}
	
	@Override
	public void render(Graphics g) {
		drawMap(g);
		buttonBar.draw(g);
		enemyManager.draw(g);
		towerManager.draw(g);
		drawCurTower(g);
	}

	private void drawCurTower(Graphics g) {
		if (curTower != null) g.drawImage(towerManager.getTowerImages()[curTower.getTowerType()], xMouse, yMouse, null);
		
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
	
	public void setCurTower(Tower curTower) {
		this.curTower = curTower;
		
	}

	private Tower getTowerOn(int x, int y) {
		return towerManager.getTowerOn(x, y);
	}

	private boolean isTowerSpot(int x, int y) {
		int tileId = level3[y/16][x/16];
		int tileType = tileManager.getTile(tileId).getTileType();
		
		return tileType == TOWERSPOT;
	}
	
	@Override
	public void mouseClicked(int x, int y) {
		if (y >= 576) {
			buttonBar.mouseClicked(x, y);
		} else if (curTower != null && isTowerSpot(xMouse, yMouse) && getTowerOn(xMouse, yMouse) == null) {
			towerManager.addTower(curTower, xMouse, yMouse);
			curTower = null;
		} else {
			Tower t = getTowerOn(xMouse, yMouse);
			buttonBar.displayTower(t);
		}
		
	}

	@Override
	public void mouseMoved(int x, int y) {
		if (y >= 576) {
			buttonBar.mouseMoved(x, y);
		} else {
			xMouse = (x/16) * 16;
			yMouse = (y/16) * 16;
		}
		
	}

	@Override
	public void mousePressed(int x, int y) {
		if (y >= 576) {
			buttonBar.mousePressed(x, y);
		}
		
	}

	@Override
	public void mouseReleased(int x, int y) {
		if (y >= 576) {
			buttonBar.mouseReleased(x, y);
		}
		
	}
	
	@Override
	public void keyTyped(int n) {
		enemyManager.addEnemy(n);
	}
	
	public TowerManager getTowerManager() {
		return towerManager;
	}
}