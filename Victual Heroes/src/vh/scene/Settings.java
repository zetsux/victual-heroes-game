package vh.scene;

import static vh.main.GameStates.MENU;
import static vh.main.GameStates.setGameState;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import javax.sound.sampled.FloatControl;

import vh.helper.LoadSave;
import vh.main.GameMain;
import vh.sound.Sound;
import vh.ui.Button;

public class Settings extends GameScene implements SceneMethods {
	
	private Button backButton, muteButton;
	private BufferedImage bgImage;
	
	private Rectangle barBound;
	
	private int xVolume = 335 + 180;
	
	private Sound sound;

	public Settings(GameMain game, Sound sound) {
		super(game);
		initializeButton();
		
		this.bgImage = LoadSave.getSettingsBackground();
		this.barBound = new Rectangle(335, 310, 360, 20);
		this.sound = sound;
	}
	
	private void initializeButton() {

		int x = 1024;
		int y = 576;
		
		int buttonWidth = 100;
		int buttonHeight = 40;
		
		backButton = new Button("← Back", 0, 0, buttonWidth, buttonHeight, 5);
		muteButton = new Button("Mute", ((x / 2) - (2 *(buttonWidth / 5)) - 5), (4 * (y / 5)) - 40, buttonWidth, buttonHeight, 6);
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(bgImage, 0, 0, null);
		
		g.setColor(new Color(20, 21, 22, 220));
		g.fillRect(265, 170, 500, 350);
		
		g.setColor(new Color(255, 255, 255, 180));
		g.drawRect(265, 170, 500, 350);
		
		drawVolumeBar(g);
		drawButtons(g);
	}
	
	private void drawVolumeBar(Graphics g) {
		g.setColor(new Color(253, 204, 13));
		g.fillRect(315, 300, 400, 40);
		
		g.setColor(Color.BLACK);
		g.fillRect(335, 310, 360, 20);
		
		g.setColor(Color.WHITE);
		g.setFont(new Font("Helvetica", Font.BOLD, 50));
		g.drawString("Volume Bar", 375, 250);

		g.setColor(new Color(50, 82, 123));
		g.fillOval(xVolume - 25, 320 - 25, 50, 50);
		
		g.setColor(new Color(251, 252, 246));
		g.fillOval(xVolume - 18, 320 - 18, 36, 36);
		
		g.setColor(Color.WHITE);
		g.drawOval(xVolume - 25, 320 - 25, 50, 50);
	}

	private void drawButtons(Graphics g) {
		backButton.draw(g);
		drawButtonFb(g, backButton);
		muteButton.draw(g);
		drawButtonFb(g, muteButton);
	}
	
	private void changeVolume(int x) {
		xVolume = x;
		sound.setMinusVolume((float) (60 - ((float) (x - 335)/360)*60));
	}
	
	private void muteVolume() {
		sound.changeMuted();
		muteButton.changeMuted();
	}

	@Override
	public void mouseClicked(int x, int y) {
		if(backButton.getBounds().contains(x, y)) {
			setGameState(MENU);
		} else if (barBound.getBounds().contains(x, y)) {
			changeVolume(x);
		} else if (muteButton.getBounds().contains(x, y)) {
			muteVolume();
		}
	}

	@Override
	public void mouseMoved(int x, int y) {
		backButton.setMouseOverButton(false);
		muteButton.setMouseOverButton(false);
		
		if (backButton.getBounds().contains(x, y)) {
			backButton.setMouseOverButton(true);
		} else if (muteButton.getBounds().contains(x, y)) {
			muteButton.setMouseOverButton(true);
		}
		
	}

	@Override
	public void mousePressed(int x, int y) {
		if(backButton.getBounds().contains(x, y)) {
			backButton.setMousePressedButton(true);
		} else if (barBound.getBounds().contains(x, y)) {
			changeVolume(x);
		} else if (muteButton.getBounds().contains(x, y)) {
			muteButton.setMousePressedButton(true);
		}
	}

	@Override
	public void mouseReleased(int x, int y) {
		backButton.resetMouseState();
		muteButton.resetMouseState();
	}
	
	public void mouseDragged(int x, int y) {
		if (barBound.getBounds().contains(x, y)) {
			changeVolume(x);
		}
	}

	@Override
	public void keyTyped(int n) {
		// TODO Auto-generated method stub
		
	}
}
