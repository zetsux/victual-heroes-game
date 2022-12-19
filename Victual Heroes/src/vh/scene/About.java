package vh.scene;

import static vh.main.GameStates.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import vh.helper.LoadSave;
import vh.main.GameMain;
import vh.ui.Button;

public class About extends GameScene implements SceneMethods {
	
	private Button backButton;
	private BufferedImage bgImage;
	private GameMain game;

	public About(GameMain game) {
		super(game);
		this.game = game;
		initializeButton();
		
		this.bgImage = LoadSave.getAboutBackground();
	}
	
	private void initializeButton() {

		int x = 1024;
		int y = 576;
		
		int buttonWidth = 100;
		int buttonHeight = 30;
		
		backButton = new Button("← Back", 0, 0, buttonWidth, buttonHeight, 0);
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(bgImage, 0, 0, null);
		
		g.setColor(new Color(50, 51, 52, 127));
		g.fillRect(80, 50, 864, 576);
		
		g.setColor(new Color(255, 255, 255, 180));
		g.drawRect(80, 50, 864, 576);
		
		g.setColor(Color.WHITE);
		g.setFont(new Font("Helvetica", Font.BOLD, 40));
		g.drawString("About Game : ", 397, 140);
		g.drawString("Created by : ", 397, 470);
		
		g.setFont(new Font("Helvetica", Font.BOLD, 18));
		g.drawString("Victual Heroes is a Tower Defense Based game with Indonesian Cuisine as the main theme.", 107, 200);
		g.drawString("We mainly introduced Indonesian food with such excitement in tower defense game,", 107, 230);
		g.drawString("which is aiming more exposure for every player to know all about Indonesian cuisine.", 107, 260);
		g.drawString("Victual Heroes offers a playful and entertaining gameplay to make a better gaming experience.", 107, 290);
		g.drawString("With such features, we cover a lot of fun aspect that will satisfy our player's hunger for", 107, 320);
		g.drawString("entertainment in the uniqueness of a game.", 107, 350);
		
		g.drawString("[ Refrein ] ", 470, 520);
		g.drawString("- Kevin Nathanael H. / 5025211140", 367, 550);
		g.drawString("- Frederick Hidayat / 5025211152", 367, 580);
		
		drawButtons(g);
	}

	private void drawButtons(Graphics g) {
		backButton.draw(g);
		drawButtonFb(g, backButton);
	}

	@Override
	public void mouseClicked(int x, int y) {
		if(backButton.getBounds().contains(x, y)) {
			setGameState(MENU);
		}
	}

	@Override
	public void mouseMoved(int x, int y) {
		backButton.setMouseOverButton(false);
		if(backButton.getBounds().contains(x, y)) {
			backButton.setMouseOverButton(true);
		}
		
	}

	@Override
	public void mousePressed(int x, int y) {
		if(backButton.getBounds().contains(x, y)) {
			setGameState(MENU);
		}	
	}

	@Override
	public void mouseReleased(int x, int y) {
		backButton.resetMouseState();
	}

	@Override
	public void keyTyped(int n) {
		// TODO Auto-generated method stub
		
	}

}
