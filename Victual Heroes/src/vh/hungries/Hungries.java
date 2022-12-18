package vh.hungries;

import java.awt.Rectangle;
import java.util.Random;

import vh.objectManagers.HungriesManager;

import static vh.helper.Constants.Direction.*;

public abstract class Hungries {
	protected HungriesManager hungriesManager;
	private float x, y;
	private Rectangle hungriesBound;
	private int hunger;
	private int maxhunger;
	private int id;
	private int type;
	private int capCount;
	private int lastDir;
	private boolean hungry;
	protected int slowedTickLimit = 120;
	protected int slowedTick = slowedTickLimit;
	protected int burnedTickLimit = 240;
	protected int burnedTick = burnedTickLimit;
	private Random rand;
	private int slowedIndex, slowedIndexTick = 0;
	private int burnedIndex, burnedIndexTick = 0;
	private final int burnDmg = 5;
	
	public Hungries(float x, float y, int id, int type, HungriesManager hungriesManager) {
		this.x = x;
		this.y = y;
		this.id = id;
		this.type = type;
		this.lastDir = -1;
		this.hungry = true;
		this.hungriesManager = hungriesManager;
		this.rand = new Random();
		
		slowedIndex = rand.nextInt(0, 4);
		burnedIndex = rand.nextInt(0, 4);
		
		hungriesBound = new Rectangle((int)x - 16 , (int)y - 16, 48, 48);
		setHungriesAttr();
	}
	
	private void setHungriesAttr() {
		hunger = vh.helper.Constants.Enemies.getHunger(type);
		maxhunger = hunger;
		capCount = vh.helper.Constants.Enemies.getCapacityCount(type);
	}

	public void move(float speed, int direction) {
		
		lastDir = direction;
		
		// move is updated every update, so 60 UPS
		if (slowedTick < slowedTickLimit) {
			slowedTick++;
			slowedIndexTick++;
			if (slowedIndexTick >= 30) {
				slowedIndexTick = 0;
				if (slowedIndex >= 3) slowedIndex = 0;
				else slowedIndex++;
			}
			speed *= 0.33f;
		}
		
		if (burnedTick < burnedTickLimit) {
			burnedTick++;
			burnedIndexTick++;
			if (burnedIndexTick >= 30) {
				burnedIndexTick = 0;
				this.fed((float) this.maxhunger*burnDmg/100);
				if (burnedIndex >= 3) burnedIndex = 0;
				else burnedIndex++;
			}
		}
		
		switch (direction) {
		case LEFT :
			this.x -= speed;
			break;
		case UP :
			this.y -= speed;
			break;
		case RIGHT :
			this.x += speed;
			break;
		case DOWN :
			this.y += speed;
			break;
		}
		
		updateEnemyHitBox();
	}
	
	private void updateEnemyHitBox() {
		hungriesBound.x = (int) x - 16;
		hungriesBound.y = (int) y - 16;
	}

	public float getHungerBar() {
		return hunger/(float)maxhunger;
	}
	
	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public Rectangle getBound() {
		return hungriesBound;
	}

	public int getHunger() {
		return hunger;
	}

	public int getId() {
		return id;
	}

	public int getType() {
		return type;
	}

	public int getLastDir() {
		return lastDir;
	}

	public void setPos(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void fed(float feedEffect) {
		this.hunger -= feedEffect;
		if (this.hunger <= 0) {
			this.hungry = false;
			hungriesManager.giveMoney(type);
		}
	}
	
	public boolean isHungry() {
		return hungry;
	}
	
	public void setSatisfied() {
		hungry = false;
	}

	public void slowed() {
		slowedTick = 0;
	}
	
	public void burned() {
		burnedTick = 0;
		burnedIndexTick = 0;
	}
	
	public boolean isSlowed() {
		return slowedTick < slowedTickLimit;
	}
	
	public boolean isBurned() {
		return burnedTick < burnedTickLimit;
	}
	
	public int getSlowedIndex() {
		return slowedIndex;
	}
	
	public int getBurnedIndex() {
		return burnedIndex;
	}
	
	public int getCapacityCount() {
		return capCount;
	}
}
