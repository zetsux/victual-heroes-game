package vh.scene;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Random;

import javax.imageio.ImageIO;

import vh.main.GameMain;
import vh.sound.Sound;
import vh.ui.Button;
import vh.ui.ButtonBar;

import static vh.main.GameStates.*;

public class MainMenu extends GameScene implements SceneMethods {

	private BufferedImage mainMenu;
	private BufferedImage mainMenuIMG;
	private Random rand;
	private Button playingButton, aboutButton, quitButton; 
	private GameMain game;
	
	public MainMenu(GameMain game) {
		super(game);
		this.game = game;
		
		importImg();
		this.mainMenu = mainMenuIMG;
		this.rand = new Random();
		initializeButton();
	}
	
	private void initializeButton() {

		int x = 1024;
		int y = 676;
		
		int buttonWidth = 100;
		int buttonHeight = 30;
		
		playingButton = new Button("Play", ((x / 2) - (2 *(buttonWidth / 5))) , (2 * (y / 5)), buttonWidth, buttonHeight, 0);
		aboutButton = new Button("About", ((x / 2) - (2 *(buttonWidth / 5))), (3 * (y / 5)), buttonWidth, buttonHeight, 1);
		quitButton = new Button("Quit", ((x / 2) - (2 *(buttonWidth / 5))), (4 * (y / 5)), buttonWidth, buttonHeight, 2);
	}

	@Override
	public void render(Graphics g) {
		
		g.drawImage(mainMenu, 0, 0, null);
		
		drawButtons(g);
	}
	
	private void drawButtons(Graphics g) {
		
		playingButton.draw(g);
		aboutButton.draw(g);
		quitButton.draw(g);
	}

	private void importImg() {
			
		InputStream is = getClass().getResourceAsStream("/MainMenu.png");
		try {
			this.mainMenuIMG = ImageIO.read(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void mouseClicked(int x, int y) {

		if(playingButton.getBounds().contains(x, y)) {
			game.stopMusic();
			game.playMusic(1);
			setGameState(PLAYING);
		}
		
		else if(aboutButton.getBounds().contains(x, y)) {
			game.stopMusic();
			game.playMusic(4);
			setGameState(ABOUT);
		}

		else if(quitButton.getBounds().contains(x, y)) {
			System.exit(1);
		}
		
	}

	public void mouseMoved(int x, int y) {
		playingButton.setMouseOverButton(false);
		aboutButton.setMouseOverButton(false);
		quitButton.setMouseOverButton(false);
		if(playingButton.getBounds().contains(x, y)) {
			playingButton.setMouseOverButton(true);
		}
		
		else if(aboutButton.getBounds().contains(x, y)) {
			aboutButton.setMouseOverButton(true);
		}
		
		else if(quitButton.getBounds().contains(x, y)) {
			quitButton.setMouseOverButton(true);
		}
	}

	public void mousePressed(int x, int y) {
		if(playingButton.getBounds().contains(x, y)) {
			playingButton.setMousePressedButton(true);
		}
		
		else if(aboutButton.getBounds().contains(x, y)) {
			aboutButton.setMousePressedButton(true);
		}
		
		else if(quitButton.getBounds().contains(x, y)) {
			quitButton.setMousePressedButton(true);
		}
		
	}

	@Override
	public void mouseReleased(int x, int y) {
		playingButton.resetMouseState();
		aboutButton.resetMouseState();
		quitButton.resetMouseState();
	}

	@Override
	public void keyTyped(int n) {	
	}
	
	
}
