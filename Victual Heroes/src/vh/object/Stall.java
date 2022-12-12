package vh.object;

import java.awt.Rectangle;

public class Stall {
	
	private int x, y, id, stallType, CDTick, stallDamage;
	private Rectangle stallBound;
	private float stallRange, stallCooldown;
	private float stallSize;
	
	public Stall(int x, int y, int id, int type) {
		this.x = x;
		this.y = y;
		this.id = id;
		this.stallType = type;
		this.stallSize = 48;
		this.stallBound = new Rectangle(x, y, (int)stallSize, (int)stallSize);
		setDefaultDmg();
		setDefaultRange();
		setDefaultCooldown();
	}
	
	public void update() {
		CDTick++;
	}
	
	public boolean isCooldown() {
		return CDTick >= stallCooldown;
	}

	public void resetCooldown() {
		CDTick = 0;
		
	}
	
	private void setDefaultDmg() {
		stallDamage = vh.helper.Constants.Towers.getDefaultDamage(stallType);
		
	}

	private void setDefaultRange() {
		stallRange = vh.helper.Constants.Towers.getDefaultRange(stallType);
		
	}

	private void setDefaultCooldown() {
		stallCooldown = vh.helper.Constants.Towers.getDefaultCooldown(stallType);
		
	}

	public int getStallType() {
		return this.stallType;
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
	
	public float getStallSize() {
		return stallSize;
	}

	public Rectangle getBound() {
		return stallBound;
	}

	public float getStallDamage() {
		return stallDamage;
	}

	public float getStallRange() {
		return stallRange;
	}

	public float getStallCooldown() {
		return stallCooldown;
	}	
	
}
