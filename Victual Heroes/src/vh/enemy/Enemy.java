package vh.enemy;

import java.awt.Rectangle;
import static vh.helper.Constants.Direction.*;

public abstract class Enemy {
	
	private float x, y;
	private Rectangle enemyBound;
	private int HP;
	private int maxHP;
	private int id;
	private int type;
	private int lastDir;
	private boolean alive;
	
	public Enemy(float x, float y, int id, int type) {
		this.x = x;
		this.y = y;
		this.id = id;
		this.type = type;
		this.lastDir = -1;
		this.alive = true;
		
		enemyBound = new Rectangle((int)x - 16 , (int)y - 16, 48, 48);
		setEnemyHP();
	}
	
	private void setEnemyHP() {
		HP = vh.helper.Constants.Enemies.getEnemyHP(id);
		maxHP = HP;
	}

	public void move(float speed, int direction) {
		
		lastDir = direction;
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
		enemyBound.x = (int) x - 16;
		enemyBound.y = (int) y - 16;
	}

	public float getHealthBar() {
		return HP/(float)maxHP;
	}
	
	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public Rectangle getBound() {
		return enemyBound;
	}

	public int getHp() {
		return HP;
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

	public void attacked(float hurtDamage) {
		this.HP--;
		if (this.HP <= 0) this.alive = false;
	}
	
	public boolean isAlive() {
		return alive;
	}
	
	public void setDead() {
		alive = false;
	}
}
