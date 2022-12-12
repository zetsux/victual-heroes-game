package vh.object;

import java.awt.Rectangle;

public class Tower {
	
	private int x, y, id, towerType, CDTick, towerDamage;
	private Rectangle towerBound;
	private float towerRange, towerCooldown;
	private float towerSize;
	
	public Tower(int x, int y, int id, int type) {
		this.x = x;
		this.y = y;
		this.id = id;
		this.towerType = type;
		this.towerSize = 48;
		this.towerBound = new Rectangle(x, y, (int)towerSize, (int)towerSize);
		setDefaultDmg();
		setDefaultRange();
		setDefaultCooldown();
	}
	
	public void update() {
		CDTick++;
	}
	
	public boolean isCooldown() {
		return CDTick >= towerCooldown;
	}

	public void resetCooldown() {
		CDTick = 0;
		
	}
	
	private void setDefaultDmg() {
		towerDamage = vh.helper.Constants.Towers.getDefaultDamage(towerType);
		
	}

	private void setDefaultRange() {
		towerRange = vh.helper.Constants.Towers.getDefaultRange(towerType);
		
	}

	private void setDefaultCooldown() {
		towerCooldown = vh.helper.Constants.Towers.getDefaultCooldown(towerType);
		
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
	
	public float getTowerSize() {
		return towerSize;
	}

	public Rectangle getBound() {
		return towerBound;
	}

	public float getTowerDamage() {
		return towerDamage;
	}

	public float getTowerRange() {
		return towerRange;
	}

	public float getTowerCooldown() {
		return towerCooldown;
	}	
	
}
