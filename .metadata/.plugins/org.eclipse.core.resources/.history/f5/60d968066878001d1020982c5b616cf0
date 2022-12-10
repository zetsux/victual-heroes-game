package vh.objectManagers;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

import vh.enemy.Baldman;
import vh.enemy.Enemy;
import vh.enemy.Greenman;
import vh.enemy.Mohawkman;
import vh.enemy.Orangeman;
import vh.enemy.Policeman;
import vh.enemy.Purpleman;
import vh.enemy.Yellowman;
import vh.helper.LoadSave;
import vh.scene.Playing;
import static vh.helper.Constants.Direction.*;
import static vh.helper.Constants.Tiles.*;
import static vh.helper.Constants.Enemies.*;

public class EnemyManager {
	
	private final int ENEMYTOTAL = 7;
	private Playing playing;
	private BufferedImage[] enemyImages;
	private ArrayList<Enemy> enemies = new ArrayList<>();
	private Random rand;
//	private float speed = 2f;
	
	private int startX = 0;
	private int startY = 10;
	
	private int endX = 58;
	private int endY = 31;
	
	private int HPBarWidth = 32;
	
	public EnemyManager(Playing plyng) {
		this.playing = plyng;
		this.enemyImages = new BufferedImage[ENEMYTOTAL];
		this.rand = new Random();
//		addEnemy(0, 10*16);
		loadEnemyImages();
	}
	
	private void loadEnemyImages() {
		BufferedImage enemyAtlas = LoadSave.getEnemyAtlas();
		enemyImages[0] = enemyAtlas.getSubimage(0, 16*4, 16, 16);
		enemyImages[1] = enemyAtlas.getSubimage(16*4, 0, 16, 16);
		enemyImages[2] = enemyAtlas.getSubimage(16*8, 0, 16, 16);
		enemyImages[3] = enemyAtlas.getSubimage(0, 0, 16, 16);
		enemyImages[4] = enemyAtlas.getSubimage(16*4, 16*4, 16, 16);
		enemyImages[5] = enemyAtlas.getSubimage(16*8, 16*4, 16, 16);
		enemyImages[6] = enemyAtlas.getSubimage(16*12, 16*4, 16, 16);
	}
	
	public void addEnemy(int x, int y, int enemyType) {
		
		switch (enemyType) {
		case BALD :
			enemies.add(new Baldman(x, y, 0, BALD));
			break;
		case YELLOW :
			enemies.add(new Yellowman(x, y, 0, YELLOW));
			break;
		case POLICE :
			enemies.add(new Policeman(x, y, 0, POLICE));
			break;
		case ORANGE :
			enemies.add(new Orangeman(x, y, 0, ORANGE));
			break;
		case PURPLE :
			enemies.add(new Purpleman(x, y, 0, PURPLE));
			break;
		case MOHAWK :
			enemies.add(new Mohawkman(x, y, 0, MOHAWK));
			break;
		case GREEN :
			enemies.add(new Greenman(x, y, 0, GREEN));
			break;
		}
	}
	
	public void addEnemy(int enemyType) {
		int x = startX*16, y = startY*16;
		
		switch (enemyType) {
		case BALD :
			enemies.add(new Baldman(x, y, 0, BALD));
			break;
		case YELLOW :
			enemies.add(new Yellowman(x, y, 0, YELLOW));
			break;
		case POLICE :
			enemies.add(new Policeman(x, y, 0, POLICE));
			break;
		case ORANGE :
			enemies.add(new Orangeman(x, y, 0, ORANGE));
			break;
		case PURPLE :
			enemies.add(new Purpleman(x, y, 0, PURPLE));
			break;
		case MOHAWK :
			enemies.add(new Mohawkman(x, y, 0, MOHAWK));
			break;
		case GREEN :
			enemies.add(new Greenman(x, y, 0, GREEN));
			break;
		}
	}

	public void update() {
		for (Enemy e : enemies) {
			if (e.isAlive()) 
				enemyMove(e);
		}
	}
	
	public void enemyMove(Enemy e) {
		if (e.getLastDir() == -1) moveNewDirection(e);
		float speed = getSpeed(e.getType());
		
		int newX = (int) (e.getX() + getSpeedX(e.getLastDir(), e.getType()));
		int newY = (int) (e.getY() + getSpeedY(e.getLastDir(), e.getType()));
		
		if (getTileType(newX, newY) == ENEMYROAD) {
			e.move(speed, e.getLastDir());
		}
		
		else if (isEnd(e)) {
			e.setDead();
		}
		
		else {
			moveNewDirection(e);
		}
	}

	private void moveNewDirection(Enemy e) {
		int direction = e.getLastDir();
		float speed = getSpeed(e.getType());
		int xPos = (int) (e.getX()/16), yPos = (int) (e.getY()/16);
		
		fixEnemyOffset(e, direction, xPos, yPos);
		
		if (isEnd(e)) {
			e.setDead();
			return;
		}
		
		if (direction == LEFT || direction == RIGHT) {
			int newY = (int) (e.getY() + getSpeedY(UP, e.getType()));
			if (getTileType((int) e.getX(), newY) == ENEMYROAD) {
				e.move(speed, UP);
			} else {
				e.move(speed, DOWN);
			}
		}
		
		else {
			int newX = (int) (e.getX() + getSpeedX(RIGHT, e.getType()));
			if (getTileType(newX, (int) e.getY()) == ENEMYROAD) {
				e.move(speed, RIGHT);
			} else {
				e.move(speed, LEFT);
			}
		}
		
	}

	private void fixEnemyOffset(Enemy e, int direction, int xPos, int yPos) {
		
		switch(direction) {
		case RIGHT :
			if (xPos < 64) xPos++;
			break;
		case DOWN :
			if (yPos < 36) yPos++;
			break;
		}
		
		e.setPos(xPos * 16, yPos * 16);
		
	}

	private boolean isEnd(Enemy e) {
		
		if (e.getX() == endX * 16 && e.getY() == endY * 16) return true;
		return false;
	}

	private int getTileType(int newX, int newY) {
		return playing.getTileType(newX, newY);
	}

	private float getSpeedX(int direction, int eType) {
		float speed = getSpeed(eType);
		if (direction == LEFT) {
			return -speed;
		}
		
		else if (direction == RIGHT) {
			return speed + 16;
		}
		
		else {
			return 0;
		}
	}
	
	private float getSpeedY(int direction, int eType) {
		float speed = getSpeed(eType);
		if (direction == UP) {
			return -speed;
		}
		
		else if (direction == DOWN) {
			return speed + 16;
		}
		
		else {
			return 0;
		}
	}

	public void draw(Graphics g) {
		for (Enemy e : enemies) {
			if (e.isAlive()) {
				drawEnemy(e, g);
				drawHPBar(e, g);
			}
		}
	}

	private void drawHPBar(Enemy e, Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect((int)e.getX() - ((HPBarWidth-16)/2) - 1, (int) e.getY() - 4, HPBarWidth + 2, 5);
		g.setColor(Color.RED);
		g.fillRect((int)e.getX() - ((HPBarWidth-16)/2), (int) e.getY() - 3, getHPBarWidth(e), 3);
		
	}
	
	private int getHPBarWidth (Enemy e) {
		return (int) (HPBarWidth * e.getHealthBar());
	}

	private void drawEnemy(Enemy e, Graphics g) {
		g.drawImage(enemyImages[e.getType()], (int)e.getX(), (int)e.getY(), null);
	}
	
	public ArrayList<Enemy> getEnemies(){
		return enemies;
	}
	
	public Enemy getEnemy(Enemy e) {
		return e;
	}
}