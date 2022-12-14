package vh.scene;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.util.Random;

import vh.objectManagers.HungriesManager;
import vh.objectManagers.MapTileManager;
import vh.objectManagers.StallFoodManager;
import vh.objectManagers.StallManager;
import vh.objectManagers.WaveManager;
import vh.objectManagers.StallFoodManager;
import vh.ui.ButtonBar;
import vh.helper.LevelBuilder;
import vh.hungries.Hungries;
import vh.main.GameMain;
import vh.object.Stall;

import static vh.helper.Constants.Tiles.*;

public class Playing extends GameScene implements SceneMethods {

	private int[][] level, level2, level3;
	
	private ButtonBar buttonBar;
	
	private MapTileManager tileManager;
	private HungriesManager hungriesManager;
	private StallManager stallManager;
	private StallFoodManager foodManager;
	private WaveManager waveManager;
	private Random rand;
	
	private Stall curStall;
	
	private int xMouse, yMouse;
	
	public Playing(GameMain game) {
		super(game);
		
		level = LevelBuilder.getBackLayer();
		level2 = LevelBuilder.getEnemyPath();
		level3 = LevelBuilder.getTowerPath();
		tileManager = new MapTileManager();
		hungriesManager = new HungriesManager(this);
		stallManager = new StallManager(this);
		foodManager = new StallFoodManager(this);
		waveManager = new WaveManager(this);
		rand = new Random();
		buttonBar = new ButtonBar(0, 576, 1024, 100, this);
	}

	public void update() {
		updateTick();
		hungriesManager.update();
		stallManager.update();
		foodManager.update();
	}
	
	@Override
	public void render(Graphics g) {
		drawMap(g);
		buttonBar.draw(g);
		hungriesManager.draw(g);
		stallManager.draw(g);
		foodManager.draw(g);
		
		drawCurStall(g);
		if (curStall != null) drawStallTileMarker(g);
	}

	private void drawStallTileMarker(Graphics g) {
		g.setColor(Color.WHITE);
		g.drawRect(xMouse, yMouse, 48, 48);
	}

	private void drawCurStall(Graphics g) {
		if (curStall != null) g.drawImage(stallManager.getStallImages()[curStall.getStallType()], xMouse, yMouse, null);
		
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
	
	public void setCurStall(Stall curStall) {
		this.curStall = curStall;
		
	}

	private Stall getStallIntersect(int x, int y) {
		return stallManager.getStallIntersect(new Rectangle(x, y, 48, 48));
	}
	
	private boolean notForStall(int x, int y) {
		for (int i = 0 ; i < 3 ; i++) {
			for (int j = 0 ; j < 3 ; j++) {
				if (cannotPutStall(x+(i*16), y+(j*16))) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	private Stall getStallOn(int x, int y) {
		return stallManager.getStallOn(x, y);
	}

	private boolean isStallSpot(int x, int y) {
		int tileId = level3[y/16][x/16];
		int tileType = tileManager.getTile(tileId).getTileType();
		
		return tileType == TOWERSPOT;
	}
	
	private boolean cannotPutStall(int x, int y) {
		int tileId = level2[y/16][x/16];
		int tileType = tileManager.getTile(tileId).getTileType();
		
		return tileType == ENEMYROAD || tileType == BLOCKED;
	}
	
	public void feedEnemy(Stall s, Hungries h) {
		foodManager.newFood(s, h);
		
	}
	
	public void mouseClicked(MouseEvent event) {
		if(event.getButton() == MouseEvent.BUTTON3) {
			curStall = null;
		}
	}
	
	@Override
	public void mouseClicked(int x, int y) {
		if (y >= 576) {
			buttonBar.displayTower(null);
			buttonBar.mouseClicked(x, y);
		} else if (curStall != null && isStallSpot(xMouse, yMouse) && getStallIntersect(xMouse, yMouse) == null && !notForStall(xMouse, yMouse)) {
			stallManager.addStall(curStall, xMouse, yMouse);
			curStall = null;
		} else if (curStall == null) {
			Stall s = getStallOn(xMouse, yMouse);
			buttonBar.displayTower(s);
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
		hungriesManager.addHungries(n);
	}
	
	public StallManager getStallManager() {
		return stallManager;
	}
	
	public HungriesManager getHungriesManager() {
		return hungriesManager;
	}

	public WaveManager getWaveManager() {
		return waveManager;
	}

	public void setWaveManager(WaveManager waveManager) {
		this.waveManager = waveManager;
	}
}