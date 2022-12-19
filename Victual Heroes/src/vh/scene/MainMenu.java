package vh.scene;

import java.awt.Color;
import java.awt.Font;
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
	private Button playingButton, aboutButton, quitButton, settingsButton; 
	private GameMain game;
	
	private int highestScore;
	
	public MainMenu(GameMain game) {
		super(game);
		this.game = game;
		
		importImg();
		this.mainMenu = mainMenuIMG;
		this.rand = new Random();
		
		refreshHighestScore();
		
		initializeButton();
	}
	
	private void initializeButton() {

		int x = 1024;
		int y = 676;
		
		int buttonWidth = 100;
		int buttonHeight = 40;
		
		playingButton = new Button("Play", ((x / 2) - (2 *(buttonWidth / 5))) , (3 * (y / 7)), buttonWidth, buttonHeight, 0);
		settingsButton = new Button("Settings", ((x / 2) - (2 *(buttonWidth / 5))), (4 * (y / 7)), buttonWidth, buttonHeight, 1);
		aboutButton = new Button("About", ((x / 2) - (2 *(buttonWidth / 5))), (5 * (y / 7)), buttonWidth, buttonHeight, 2);
		quitButton = new Button("Quit", ((x / 2) - (2 *(buttonWidth / 5))), (6 * (y / 7)), buttonWidth, buttonHeight, 3);
	}

	@Override
	public void render(Graphics g) {
		
		g.drawImage(mainMenu, 0, 0, null);
		
		g.setColor(Color.YELLOW);
		g.fillRect(15, 30, 305, 60);
		
		g.setColor(Color.BLACK);
		g.drawRect(15, 30, 305, 60);
		
		if (highestScore < 10) {
			g.setFont(new Font("Helvetica", Font.BOLD, 34));
			g.drawString("Highest Score : " + highestScore, 28, 72);
		} else if (highestScore < 100) {
			g.setFont(new Font("Helvetica", Font.BOLD, 32));
			g.drawString("Highest Score : " + highestScore, 28, 71);
		} else if (highestScore < 1000) {
			g.setFont(new Font("Helvetica", Font.BOLD, 30));
			g.drawString("Highest Score : " + highestScore, 28, 70);
		} else if (highestScore < 10000) {
			g.setFont(new Font("Helvetica", Font.BOLD, 28));
			g.drawString("Highest Score : " + highestScore, 28, 70);
		} else if (highestScore < 100000) {
			g.setFont(new Font("Helvetica", Font.BOLD, 27));
			g.drawString("Highest Score : " + highestScore, 24, 69);
		} else if (highestScore < 1000000) {
			g.setFont(new Font("Helvetica", Font.BOLD, 26));
			g.drawString("Highest Score : " + highestScore, 26, 69);
		} else if (highestScore < 10000000) {
			g.setFont(new Font("Helvetica", Font.BOLD, 25));
			g.drawString("Highest Score : " + highestScore, 25, 69);
		} else if (highestScore < 100000000) {
			g.setFont(new Font("Helvetica", Font.BOLD, 24));
			g.drawString("Highest Score : " + highestScore, 25, 69);
		} else if (highestScore < 1000000000) {
			g.setFont(new Font("Helvetica", Font.BOLD, 23));
			g.drawString("Highest Score : " + highestScore, 22, 68);
		}
		
		drawButtons(g);
	}
	
	private void drawButtons(Graphics g) {
		
		playingButton.draw(g);
		drawButtonFb(g, playingButton);
		aboutButton.draw(g);
		drawButtonFb(g, aboutButton);
		quitButton.draw(g);
		drawButtonFb(g, quitButton);
		settingsButton.draw(g);
		drawButtonFb(g, settingsButton);
	}

	private void importImg() {
			
		InputStream is = getClass().getResourceAsStream("/MainMenu.png");
		try {
			this.mainMenuIMG = ImageIO.read(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void refreshHighestScore() {
		this.highestScore = game.readHighScore();
	}

	public void mouseClicked(int x, int y) {

		if(playingButton.getBounds().contains(x, y)) {
			game.stopMusic();
			game.playMusic(1);
			setGameState(PLAYING);
		}
		
		else if(aboutButton.getBounds().contains(x, y)) {
			setGameState(ABOUT);
		}
		
		else if(settingsButton.getBounds().contains(x, y)) {
			setGameState(SETTINGS);
		}

		else if(quitButton.getBounds().contains(x, y)) {
			System.exit(1);
		}
	}

	public void mouseMoved(int x, int y) {
		playingButton.setMouseOverButton(false);
		aboutButton.setMouseOverButton(false);
		quitButton.setMouseOverButton(false);
		settingsButton.setMouseOverButton(false);
		
		if(playingButton.getBounds().contains(x, y)) {
			playingButton.setMouseOverButton(true);
		}
		
		else if(aboutButton.getBounds().contains(x, y)) {
			aboutButton.setMouseOverButton(true);
		}
		
		else if(settingsButton.getBounds().contains(x, y)) {
			settingsButton.setMouseOverButton(true);
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
		
		else if(settingsButton.getBounds().contains(x, y)) {
			settingsButton.setMousePressedButton(true);
		}
		
		else if(quitButton.getBounds().contains(x, y)) {
			quitButton.setMousePressedButton(true);
		}
		
	}

	@Override
	public void mouseReleased(int x, int y) {
		playingButton.resetMouseState();
		aboutButton.resetMouseState();
		settingsButton.resetMouseState();
		quitButton.resetMouseState();
	}

	@Override
	public void keyTyped(int n) {	
	}
}
