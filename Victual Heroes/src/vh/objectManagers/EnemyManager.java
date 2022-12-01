package vh.objectManagers;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

import vh.enemy.Enemy;
import vh.helper.LoadSave;
import vh.scene.Playing;

public class EnemyManager {
	
	private final int ENEMYTOTAL = 4;
	private Playing playing;
	private BufferedImage[] enemyImages;
	private ArrayList<Enemy> enemies = new ArrayList<>();
	private Random rand;
	
	public EnemyManager(Playing plyng) {
		this.playing = plyng;
		this.enemyImages = new BufferedImage[ENEMYTOTAL];
		this.rand = new Random();
		addEnemy(1*48, 4*48);
		loadEnemyImages();
	}
	
	private void loadEnemyImages() {
		BufferedImage enemyAtlas = LoadSave.getSpriteAtlas();
		enemyImages[0] = enemyAtlas.getSubimage(0, 48*2, 48, 48);
		enemyImages[1] = enemyAtlas.getSubimage(48*3, 48*2, 48, 48);
		enemyImages[2] = enemyAtlas.getSubimage(48*6, 48*2, 48, 48);
		enemyImages[3] = enemyAtlas.getSubimage(48*9, 48*2, 48, 48);
		
	}
	
	public void addEnemy(int x, int y) {
		int idx = rand.nextInt(0, 4);
		enemies.add(new Enemy(x, y, 0, idx));
	}

	public void update() {
		for (Enemy e : enemies) {
			e.move(0.5f, 0);
		}
	}
	
	public void draw(Graphics g) {
		for (Enemy e : enemies) {
			drawEnemy(e, g);
		}
	}

	private void drawEnemy(Enemy e, Graphics g) {
		g.drawImage(enemyImages[e.getType()], (int)e.getX(), (int)e.getY(), null);
	}
}