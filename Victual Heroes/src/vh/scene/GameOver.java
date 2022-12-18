package vh.scene;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import vh.main.GameMain;
import vh.ui.Button;

import static vh.main.GameStates.*;

public class GameOver extends GameScene implements SceneMethods {
	
	private Button retryButton, menuButton;
	private GameMain game;

	public GameOver(GameMain game) {
		super(game);
		
		this.game = game;
		initializeButtons();
	}

	private void initializeButtons() {

		int x = 1024;
		int y = 676;
		
		int buttonWidth = 130;
		int buttonHeight = 30;
		
		retryButton = new Button("Retry", ((x / 2) - (2 *(buttonWidth / 5))) , (3 * (y / 5)), buttonWidth, buttonHeight, 0);
		menuButton = new Button("Menu", ((x / 2) - (2 *(buttonWidth / 5))), (4 * (y / 5)), buttonWidth, buttonHeight, 1);
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillRect(0, 0, 1024, 676);
		
		retryButton.draw(g);
		menuButton.draw(g);
		
		g.setColor(new Color(255, 76, 48));
		g.fillRect(200, 50, 640, 230);
		
		g.setColor(Color.BLACK);
		g.drawRect(199, 49, 641, 231);
		
		g.setFont(new Font("Helvetica", Font.BOLD, 100));
		g.drawString("Game Over", 252, 160);
		
		g.setFont(new Font("Helvetica", Font.BOLD, 50));
		g.setColor(Color.CYAN);
		g.drawString("Score : 100", 382, 245);
	}
	
	private void retryGame() {
		game.getPlaying().resetGame();
		setGameState(PLAYING);
	}

	@Override
	public void mouseClicked(int x, int y) {
		if (retryButton.getBounds().contains(x, y)) {
			retryGame();
		} else if (menuButton.getBounds().contains(x, y)) {
			game.getPlaying().resetGame();
			setGameState(MENU);
		}
	}

	@Override
	public void mouseMoved(int x, int y) {
		retryButton.setMouseOverButton(false);
		menuButton.setMouseOverButton(false);
		
		if (retryButton.getBounds().contains(x, y)) {
			retryButton.setMouseOverButton(true);
		} else if (menuButton.getBounds().contains(x, y)) {
			menuButton.setMouseOverButton(true);
		}
	}

	@Override
	public void mousePressed(int x, int y) {
		if (retryButton.getBounds().contains(x, y)) {
			retryButton.setMousePressedButton(true);
		} else if (menuButton.getBounds().contains(x, y)) {
			menuButton.setMousePressedButton(true);
		}
	}

	@Override
	public void mouseReleased(int x, int y) {
		retryButton.resetMouseState();
		menuButton.resetMouseState();
	}

	@Override
	public void keyTyped(int n) {
		
	}
}
