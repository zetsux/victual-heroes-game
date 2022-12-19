package vh.object;

import java.awt.Rectangle;
import static vh.helper.Constants.StallsClass.*;

public class Stall {
	
	private int x, y, id, stallType, CDTick, stallDamage;
	private Rectangle stallBound;
	private float stallRange, stallCooldown;
	private float stallSize;
	private int grade;
	
	public Stall(int x, int y, int id, int type) {
		this.x = x;
		this.y = y;
		this.id = id;
		this.stallType = type;
		this.stallSize = 48;
		this.stallBound = new Rectangle(x, y, (int)stallSize, (int)stallSize);
		this.grade = 1;
		
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
	
	public void upgradeStall() {
		this.grade++;
		
		stallDamage += (stallDamage/5);
		stallRange += (stallRange/5);
		stallCooldown -= (stallCooldown/5);
		
		switch (stallType) {
		case PUKIS:
			if (grade == 2) stallDamage += 3;
			else stallDamage += 5;
			break;
		
		case BAKSO:
			if (grade == 2) stallDamage += (stallDamage/10);
			else stallDamage += (stallDamage/4);
			break;
			
		case ESCAMPUR:
			if (grade == 2) stallCooldown -= (stallCooldown/10);
			else stallCooldown -= (stallCooldown/4);
			break;
			
		case GEPREK:
			if (grade == 2) stallRange += (stallRange/10);
			else stallRange += (stallRange/4);
			break;
		}
	}
	
	private void setDefaultDmg() {
		stallDamage = vh.helper.Constants.StallsClass.getDefaultDamage(stallType);
		
	}

	private void setDefaultRange() {
		stallRange = vh.helper.Constants.StallsClass.getDefaultRange(stallType);
		
	}

	private void setDefaultCooldown() {
		stallCooldown = vh.helper.Constants.StallsClass.getDefaultCooldown(stallType);
		
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
	
	public int getGrade() {
		return grade;
	}
	
}
