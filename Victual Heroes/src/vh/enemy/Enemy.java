package vh.enemy;

import java.awt.Rectangle;
import static vh.helper.Constants.Direction.*;

public abstract class Enemy {
	
	private float x, y;
	private Rectangle enemyBound;
	private int hp;
	private int id;
	private int type;
	private int lastDir;
	
	public Enemy(float x, float y, int id, int type) {
		this.x = x;
		this.y = y;
		this.id = id;
		this.type = type;
		this.lastDir = -1;
		
		enemyBound = new Rectangle((int)x , (int)y , 16, 16);
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
		return hp;
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
}
