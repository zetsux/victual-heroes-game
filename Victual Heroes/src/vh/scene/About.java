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
		
		g.setColor(Color.WHITE);
		g.setFont(new Font("Helvetica", Font.BOLD, 20));
		g.drawString("About Game : ", 467, 200);
		g.drawString("A Tower Defense based game with Indonesian Cuisine as the main theme.", 167, 230);
		g.drawString("With Cuisine Heroes as the bla bla bla bla anjir bingung gatau la..", 167, 260);
		g.drawString("Mohon bantuannya fred, aku bingung hehe, semangat :))", 167, 290);
		g.drawString("Created By : ", 467, 500);
		g.drawString("- Kevin Nathanael H. / 5025211140", 367, 530);
		g.drawString("- Frederick Hidayat / 5025211152", 367, 560);
		drawButtons(g);
	}

	private void drawButtons(Graphics g) {
		backButton.draw(g);
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
			game.stopMusic();
			game.playMusic(0);
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
