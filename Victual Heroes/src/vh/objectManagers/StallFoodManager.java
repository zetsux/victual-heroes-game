package vh.objectManagers;

import java.awt.Graphics;
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
	private BufferedImage[] foodImages;
	private int foodId = 0;
	
	public StallFoodManager (Playing playing) {
		this.playing = playing;
		importing();
	}
	
	private void importing() {
		
		BufferedImage foodAtlas = LoadSave.getFoodAtlas();
		this.foodImages = new BufferedImage[3];
		
		for (int i = 0; i < 3; i++) {
			foodImages[i] = foodAtlas.getSubimage(16*i, 0, 16, 16);
		}
		
//		BufferedImage esCampurTemp = null;
//		InputStream is;
//		
//		try {
//			is = LoadSave.class.getClassLoader().getResourceAsStream("es campur projectile.png");
//			esCampurTemp = ImageIO.read(is);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		projectile_Images[ESCAMPUR] = esCampurTemp;
	}
	
	public void newFood(Stall s, Hungries e) {
		int type = getFoodType(s);
		int damage = getDefaultDamage(type);
		
		int xDistance = (int) Math.abs(s.getX() - e.getX());
		int yDistance = (int) Math.abs(s.getY() - e.getY());
		int totalDistance = xDistance + yDistance;
		
		float xProportion = (float) xDistance/ totalDistance;
		//float yProportion = 1.0f - xProportion;
				
		float xSpeed = xProportion * vh.helper.Constants.TowerProjectiles.getSpeed(s.getStallType());
		float ySpeed = vh.helper.Constants.TowerProjectiles.getSpeed(s.getStallType()) - xSpeed;
	
		if (s.getX() > e.getX()) {
			xSpeed = -xSpeed;
		}
		if (s.getY() > e.getY()) {
			ySpeed = -ySpeed;
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
			case WOOD :
				return WOODS;
		}
		return 0;
	}

	public void update() {
		for (StallFood p : foods) {
			if (p.isActive()) {
				p.move();
				if (isFoodHitEnemy(p)) {
					p.setActive(false);
				}else {
					// nothing for now
				}
			}
		}
	}
	
	private boolean isFoodHitEnemy(StallFood p) {
		for (Hungries e : playing.getHungriesManager().getAllHungries()) {
			if (e.getBound().contains(p.getPosition())) {
					e.attacked(p.getFoodDamage());
					return true;
			}
		}
		return false;
	}

	public void draw(Graphics g) {
		for (StallFood p : foods) {
			if (p.isActive())
				g.drawImage(foodImages[p.getFoodType()], (int) p.getPosition().getX(), (int) p.getPosition().getY(), null);
		}
	}

}
