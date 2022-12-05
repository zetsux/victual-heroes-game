package vh.object;

import java.awt.Rectangle;

public class Tower {
	
	private int x, y, id, towerType;
	private Rectangle towerBound;
	
	public Tower(int x, int y, int id, int type) {
		this.x = x;
		this.y = y;
		this.id = id;
		this.towerType = type;
		this.towerBound = new Rectangle(x, y, 48, 48);
	}
	
	public int getTowerType() {
		return this.towerType;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getId() {
		return id;
	}
	
	public Rectangle getBound() {
		return towerBound;
	}
}
