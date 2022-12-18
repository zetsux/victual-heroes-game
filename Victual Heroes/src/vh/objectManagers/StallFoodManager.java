package vh.objectManagers;

import java.awt.Graphics;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Float;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import vh.helper.Constants.Enemies;
import vh.hungries.Hungries;
import vh.helper.LoadSave;
import vh.object.Stall;
import vh.object.StallFood;
import vh.scene.Playing;
import static vh.helper.Constants.Towers.*;
import static vh.helper.Constants.TowerProjectiles.*;

public class StallFoodManager {
	
	private Playing playing;
	private ArrayList<StallFood> foods = new ArrayList<>();
	private BufferedImage[] foodImages, explosionImages;
	private int foodId = 0;
	private ArrayList<Explosion> explosions = new ArrayList<>();
	
	public StallFoodManager (Playing playing) {
		this.playing = playing;
		importing();
	}
	
	private void importing() {
		
		BufferedImage foodAtlas = LoadSave.getFoodAtlas();
		this.foodImages = new BufferedImage[4];
		
		for (int i = 0; i < 4; i++) {
			foodImages[i] = foodAtlas.getSubimage(16*i, 0, 16, 16);
		}
		
		importAnimation();
	}
	
	public void importAnimation() {
		BufferedImage bombAtlas = LoadSave.getExplosionAtlas();
		explosionImages = new BufferedImage[10];
		
		for (int i = 0 ; i < 10; i++) {
			explosionImages[i] = bombAtlas.getSubimage(i*32, 0, 32, 32);
		}
	}
	
	
	public void newFood(Stall s, Hungries h) {
		int type = getFoodType(s);
		int damage = getDefaultDamage(type);
		
		int xDistance = (int) Math.abs(s.getX() - h.getX());
		int yDistance = (int) Math.abs(s.getY() - h.getY());
		int totalDistance = xDistance + yDistance;
		
		float xProportion = (float) xDistance/ totalDistance;
		//float yProportion = 1.0f - xProportion;
				
		float xSpeed = xProportion * vh.helper.Constants.TowerProjectiles.getSpeed(s.getStallType());
		float ySpeed = vh.helper.Constants.TowerProjectiles.getSpeed(s.getStallType()) - xSpeed;
	
		if (s.getX() > h.getX()) {
			xSpeed = -xSpeed;
		}
		if (s.getY() > h.getY()) {
			ySpeed = -ySpeed;
		}
		
		for (StallFood f : foods) {
			if (!f.isActive() && f.getFoodType() == type) {
				f.recookFood((s.getX() + s.getStallSize()/2), (s.getY() + s.getStallSize()/2), xSpeed, ySpeed);
				return;
			}
		}
		
		foods.add(new StallFood((s.getX() + s.getStallSize()/2), (s.getY() + s.getStallSize()/2), xSpeed, ySpeed, foodId++ , damage,  type));
		
	}
	
	private int getFoodType(Stall s) {
		switch(s.getStallType()) {
			case PUKIS :
				return P_PUKIS;
			case BAKSO :
				return P_BAKSO;
			case ESCAMPUR :
				return P_ESCAMPUR;
			case GEPREK :
				return P_GEPREK;
		}
		return 0;
	}

	public void update() {
		for (StallFood f : foods) {
			if (f.isActive()) {
				f.move();
				if (isFoodHitEnemy(f)) {
					f.setActive(false);
					if(f.getFoodType() == P_BAKSO) {
						explosions.add(new Explosion(f.getPosition()));
						explodeAOE(f);
					}
				} else if (isFoodOutside(f)) {
					f.setActive(false);
				}
			}
		}
		
		for (Explosion ex : explosions) {
			if (ex.getIndex() < 7) ex.update();
		}
	}

	private void explodeAOE(StallFood f) {
		for (Hungries h : playing.getHungriesManager().getAllHungries()) {
			if (h.isHungry()) {
				float radius = 40.0f;
				float xDist = Math.abs(f.getPosition().x - h.getX());
				float yDist = Math.abs(f.getPosition().y - h.getY());
				float rDist = (float) Math.hypot(xDist, yDist);
				
				if (rDist <= radius) {
					h.fed(f.getFoodDamage());
				}
			}
		}
		
	}

	private boolean isFoodHitEnemy(StallFood f) {
		for (Hungries h : playing.getHungriesManager().getAllHungries()) {
			if (h.isHungry() && h.getBound().contains(f.getPosition())) {
				h.fed(f.getFoodDamage());
				if (f.getFoodType() == P_ESCAMPUR) {
					h.slowed();
				} else if (f.getFoodType() == P_GEPREK) {
					h.burned();
				}
				
				return true;
			}
		}
		return false;
	}
	
	private boolean isFoodOutside(StallFood f) {
		if (f.getPosition().x >= 0 && f.getPosition().x <= 1024 && f.getPosition().y >= 0 && f.getPosition().y <= 576)
			return false;
		
		return true;
	}

	public void draw(Graphics g) {
		
		for (StallFood f : foods) {
			if (f.isActive())
				g.drawImage(foodImages[f.getFoodType()], (int) f.getPosition().getX() - 16, (int) f.getPosition().getY() - 16, null);
		}
		
		drawExplosions(g);
	}
	
	public class Explosion {
		
		private Point2D.Float explosionPos;
		private int explosionTick = 0, explosionIndex = 0;
		
		public Explosion(Point2D.Float pos) {
			this.explosionPos = pos;
		}
		
		public void update() {
			explosionTick++;
			if (explosionTick >= 5) {
				explosionTick = 0;
				explosionIndex++;
			}
		}
		
		public Point2D.Float getPosition(){
			return explosionPos;
		}
		
		public int getIndex(){
			return explosionIndex;
		}
	}

	private void drawExplosions(Graphics g) {
		for (Explosion ex : explosions) {
			if (ex.getIndex() < 7) {
				g.drawImage(explosionImages[ex.getIndex()], (int) ex.getPosition().x - 32, (int) ex.getPosition().y - 32, null);
			}
		}
	}
	
	public void resetFoods() {
		foods.clear();
		explosions.clear();
		foodId = 0;
	}
}
