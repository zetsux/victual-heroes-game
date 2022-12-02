package vh.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;

import vh.main.GameMain;
import vh.main.GameStates;
import static vh.main.GameStates.*;

public class KeyboardInput implements KeyListener {
	
	private GameMain gameMain;
	
	public KeyboardInput (GameMain gameMain) {
		this.gameMain = gameMain;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		int keyCode = e.getKeyCode();
		char keyChar = e.getKeyChar();
		
		if(keyChar >= '1' && keyChar <= '7'){
			
		switch(GameStates.gameState) {
		
		case MENU :
//			gameMain.getMenu().mouseClicked(e.getX(), e.getY());
			break;
			
		case SETTINGS :
			//game.getSettings().render(g);
			break;
			
		case PLAYING :
			gameMain.getPlaying().keyTyped(keyChar - 49);
			break;
	
		}
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		char keyChar = e.getKeyChar();
		
		if (Character.isAlphabetic(keyChar) || Character.isDigit(keyChar)) {
			System.out.print(keyChar);
		}
		
		else {
			if (keyCode == KeyEvent.VK_UP) {
				System.out.println("Go Up");
			}
			
			else if (keyCode == KeyEvent.VK_DOWN) {
				System.out.println("Go Down");
			}
			
			else if (keyCode == KeyEvent.VK_LEFT) {
				if (GameStates.gameState == MENU) {
					GameStates.gameState = SETTINGS;
				}
				
				else if (GameStates.gameState == PLAYING) {
					GameStates.gameState = MENU;
				}
				
				else if (GameStates.gameState == SETTINGS) {
					GameStates.gameState = PLAYING;
				}
			}
			
			else if (keyCode == KeyEvent.VK_RIGHT) {
				if (GameStates.gameState == MENU) {
					GameStates.gameState = PLAYING;
				}
				
				else if (GameStates.gameState == PLAYING) {
					GameStates.gameState = SETTINGS;
				}
				
				else if (GameStates.gameState == SETTINGS) {
					GameStates.gameState = MENU;
				}
			}
			
			else if (keyCode == KeyEvent.VK_SPACE) {
				System.out.println("Jump");
			}
			
			else if (keyCode == KeyEvent.VK_F1) {
				GameStates.gameState = MENU;
			}
			
			else if (keyCode == KeyEvent.VK_F2) {
				GameStates.gameState = PLAYING;
			}
			
			else if (keyCode == KeyEvent.VK_F3) {
				GameStates.gameState = SETTINGS;
			}
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
