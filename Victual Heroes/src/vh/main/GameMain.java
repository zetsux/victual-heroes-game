package vh.main;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import vh.input.KeyboardInput;
import vh.input.MouseInput;
import vh.scene.GameOver;
import vh.scene.MainMenu;
import vh.scene.Playing;
import vh.sound.Sound;
import vh.scene.About;

public class GameMain extends JFrame implements Runnable {
	private GameScreen screen;
	
	private Thread gameThread;
	
	private final double SET_FPS = 120.0;
	private final double SET_UPS = 60.0;
	
	//Classes
	private GameRenders gameRenderer;
	private MainMenu menu;
	private Playing playing;
	private About settings;
	private GameOver gameOver;
	
	private Sound sound;
	
	public GameMain() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int choose = JOptionPane.showConfirmDialog(null,
				"Do you really want to exit Victual Heroes?", "Closing Victual Heroes", 
				JOptionPane.YES_NO_OPTION,
				JOptionPane.INFORMATION_MESSAGE);
				if (choose == JOptionPane.YES_OPTION) {
					e.getWindow().dispose();
					System.exit(1);
				} else {
					setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				}
			 }
		 });
		
		sound = new Sound();
		playMusic(0);
		initializeClasses();

		add(screen);
		pack();
		
		setTitle("Victual Heroes");
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/iconimg.png")));
		
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}

	private void initializeClasses() {
		gameRenderer = new GameRenders(this);
		screen = new GameScreen(this);
		menu = new MainMenu(this);
		playing = new Playing(this);
		settings = new About(this);
		gameOver = new GameOver(this);
	}
	
	public void stopMusic() {
		sound.stop();
	}

	public void playMusic(int playMusic) {
		sound.setMusic(playMusic);
		sound.play();
		sound.loop();
	}
	
	private void updateGame()
	{
		switch (GameStates.gameState) {
		case MENU :
			break;
		case PLAYING :
			playing.update();
		case ABOUT :
			break;
		default :
			break;
		}
	}
	
	private void startGame()
	{
		gameThread = new Thread(this) {
		};
		
		gameThread.start();
	}

	public static void main(String[] args) {
		GameMain game = new GameMain();
		game.screen.initializeInput();
		game.startGame();
	}

	@Override
	public void run() 
	{
		double timePerFrame = 1000000000.0 / SET_FPS;
		double timePerUpdate = 1000000000.0 / SET_UPS;
		
		long lastUpdate = System.nanoTime();
		long lastFrame = System.nanoTime();
		
		int frames = 0;
		int updates = 0;
		
		long lastTimeCheck = System.currentTimeMillis();
		long curNano;
		
		while(true)
		{
			curNano = System.nanoTime();
			//Render
			if (curNano - lastFrame >= timePerFrame)
			{
				lastFrame = curNano;
				repaint();
				frames++;
			}
			
			//Update
			if (curNano - lastUpdate >= timePerUpdate)
			{
				updateGame();
				lastUpdate = curNano;
				updates++;
			}
			
			//Check FPS & UPS
			if (System.currentTimeMillis() - lastTimeCheck >= 1000)
			{
				System.out.println("FPS : " + frames + ", UPS : " + updates);
				frames = 0;
				updates = 0;
				lastTimeCheck = System.currentTimeMillis();
			}
		}
	}
	
	public int readHighScore() {
		int highScore = 0;
		try {
		      File myObj = new File("userData.txt");
		      
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		        FileWriter myWriter = new FileWriter("userData.txt");
		        myWriter.write("0");
		        myWriter.close();
		      } else {
		        Scanner myReader = new Scanner(myObj);
		        
		        String data = myReader.nextLine();
		        
		        try{
		            highScore = Integer.parseInt(data);
		        }
		        catch (NumberFormatException ex){
		            ex.printStackTrace();
		        }
		        
		        myReader.close();
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
		return highScore;
	}
	
	//Getters & Setters
	public GameRenders getRenderer() {
		return gameRenderer;
	}
	
	public MainMenu getMenu() {
		return menu;
	}
	
	public Playing getPlaying() {
		return playing;
	}

	public About getSettings() {
		return settings;
	}
	
	public GameOver getGameOver() {
		return gameOver;
	}
}