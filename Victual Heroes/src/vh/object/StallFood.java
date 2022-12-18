package vh.object;

import java.awt.geom.Point2D;

public class StallFood {
	
	private Point2D.Float position;
	private int id, foodType, foodDamage;
	private float xSpeed, ySpeed;
	private boolean active = true;
	
	public StallFood(float x, float y, float xSpeed, float ySpeed, int id, int foodDamage, int foodType) {
		this.position = new Point2D.Float(x,y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
		this.id = id;
		this.foodDamage = foodDamage;
		this.foodType = foodType;
	}
	
	public void recookFood(float x, float y, float xSpeed, float ySpeed) {
		this.position = new Point2D.Float(x,y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
		this.active = true;
	}
	
	public int getFoodDamage() {
		return foodDamage;
	}

	public void move() {
		position.x += xSpeed;
		position.y += ySpeed;
	}

	public Point2D.Float getPosition() {
		return position;
	}

	public void setPosition(Point2D.Float position) {
		this.position = position;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFoodType() {
		return foodType;
	}

	public void setFoodType(int foodType) {
		this.foodType = foodType;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
}
