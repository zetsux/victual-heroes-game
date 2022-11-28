package vh.main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JPanel;

public class GameScreen extends JPanel{
	private GameMain game;
	private Dimension size;
	
	public GameScreen(GameMain game) {
		this.game = game;

		setPanelSize();
	}
	
	private void setPanelSize() {
		size = new Dimension(700, 400);
		setMinimumSize(size);
		setPreferredSize(size);
		setMaximumSize(size);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		game.getRenderer().render(g);
	}
}
