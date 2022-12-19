package vh.scene;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.FileWriter;
import java.io.IOException;

import vh.helper.LoadSave;
import vh.main.GameMain;
import vh.ui.Button;

import static vh.main.GameStates.*;

public class GameOver extends GameScene implements SceneMethods {
	
	private Button retryButton, menuButton;
	private GameMain game;
	private int score, highScore, scoreOffset, highScoreOffset;
	
	private BufferedImage gameOverBg;

	public GameOver(GameMain game) {
		super(game);
		
		this.game = game;
		this.gameOverBg = LoadSave.getGameOverBackground();
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
		g.drawImage(gameOverBg, 0, 0, null);
		
		retryButton.draw(g);
		drawButtonFb(g, retryButton);
		menuButton.draw(g);
		drawButtonFb(g, menuButton);
		
		g.setColor(new Color(50, 51, 52, 127));
		g.fillRect(200, 50, 640, 280);
		
		g.setColor(new Color(255, 255, 255, 180));
		g.drawRect(199, 49, 641, 281);
		
		g.setColor(new Color(255, 255, 255, 240));
		g.setFont(new Font("Helvetica", Font.BOLD, 100));
		g.drawString("Game Over", 252, 160);
		
		g.setFont(new Font("Helvetica", Font.BOLD, 50));
		g.setColor(Color.CYAN);
		
		g.drawString("Score : " + score, 412 - (12*scoreOffset), 245);
		
		if (score > highScore) {
			g.setColor(Color.GREEN);
			g.drawString("(New High Score!!)", 302, 305);
			
		} else {
			g.setColor(Color.YELLOW);
			g.drawString("High Score : " + highScore, 352 - (13*highScoreOffset), 305);
		}
	}
	
	public void setScore() {
		this.score = (game.getPlaying().getHungriesManager().getSatisfiedCount()*100) + 
				(game.getPlaying().getButtonBar().getMoney());
	}
	
	public void setHighScore() {
		this.highScore = game.readHighScore();
	}
	
	public void setOffsets() {
		scoreOffset = -1;
		highScoreOffset = -1;
		
		int tmp = score;
		while (tmp > 0) {
			tmp /= 10;
			scoreOffset++;
		}
		
		tmp = highScore;
		while (tmp > 0) {
			tmp /= 10;
			highScoreOffset++;
		}
	}
	
	public int getScore() {
		return score;
	}
	
	public int getHighScore() {
		return highScore;
	}
	
	public void writeHighScore(int newScore) {
		try {
			FileWriter myWriter;
			myWriter = new FileWriter(LoadSave.getUserData());
			myWriter.write(Integer.toString(newScore));
	        myWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void retryGame() {
		game.getPlaying().resetGame();
		game.stopMusic();
		game.playMusic(1);
		setGameState(PLAYING);
	}

	@Override
	public void mouseClicked(int x, int y) {
		if (retryButton.getBounds().contains(x, y)) {
			retryGame();
		} else if (menuButton.getBounds().contains(x, y)) {
			game.getPlaying().resetGame();
			game.stopMusic();
			game.playMusic(0);
			game.getMenu().refreshHighestScore();
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
