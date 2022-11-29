package vh.scene;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Random;

import javax.imageio.ImageIO;

import vh.main.GameMain;
import vh.ui.Button;
import static vh.main.GameStates.*;

public class MainMenu extends GameScene implements SceneMethods {

	private BufferedImage map;
	private BufferedImage sprite;
	private BufferedImage mapIMG;
	private BufferedImage spriteIMG;
	private Random rand;
	private Button playingButton, settingButton, quitButton; 
	
	private ArrayList<BufferedImage> sprites = new ArrayList<>();
	
	public MainMenu(GameMain game) {
		super(game);
		importImg();
		this.map = mapIMG;
		this.sprite = spriteIMG;
		loadSprites();
		this.rand = new Random();
		initializeButton();
	}

	private void initializeButton() {
		
		playingButton = new Button("Play", 300, 100, 100, 30);
		settingButton = new Button("Settings", 300, 200, 100, 30);
		quitButton = new Button("Quit", 300, 300, 100, 30);
	}

	@Override
	public void render(Graphics g) {
		
		drawButtons(g);
		/*
		g.drawImage(map, 0, 0, null);
		g.drawImage(sprites.get(0), 0, 0, null);
		for (int i = 0 ; i < 16 ; i++) {
			for (int j = 0 ; j < 9; j++){
				g.drawImage(sprites.get(getRX()), i*40, j*40, null);
			}
		}
		*/
	}
	
	private void drawButtons(Graphics g) {
		
		playingButton.draw(g);
		settingButton.draw(g);
		quitButton.draw(g);
	}

	private void importImg() {
		InputStream is = getClass().getResourceAsStream("/croppedmap.jpeg");
		try {
			this.mapIMG = ImageIO.read(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		is = getClass().getResourceAsStream("/marioatlas.png");
		try {
			this.spriteIMG = ImageIO.read(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void loadSprites() {
		for (int i = 0 ; i < 14 ; i++)
		{
			for (int j = 0 ; j < 5 ; j++)
			{
				sprites.add(sprite.getSubimage(i*17, j*29, 17, 29));
			}
		}
	}
	
	private int getRX() {
		return rand.nextInt(14);
	}
	
	private int getRY() {
		return rand.nextInt(5);
	}

	public void mouseClicked(int x, int y) {

		if(playingButton.getBounds().contains(x, y)) {
			setGameState(PLAYING);
		}
		
	}

	public void mouseMoved(int x, int y) {
		// TODO Auto-generated method stub
		playingButton.setMouseOverButton(false);
		if(playingButton.getBounds().contains(x, y)) {
			playingButton.setMouseOverButton(true);
		}
	}

	public void mousePressed(int x, int y) {
		
		//playingButton.setMouseOverButton(false);
		if(playingButton.getBounds().contains(x, y)) {
			playingButton.setMousePressedButton(true);
		}
		
	}

	@Override
	public void mouseReleased(int x, int y) {
		// TODO Auto-generated method stub
		playingButton.resetMouseState();;
	}

}
