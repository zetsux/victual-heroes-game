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
//		int keyCode = e.getKeyCode();
//		char keyChar = e.getKeyChar();
//		
//		if(keyChar >= '1' && keyChar <= '7'){
//			
//		switch(GameStates.gameState) {
//		
//		case MENU :
////			gameMain.getMenu().mouseClicked(e.getX(), e.getY());
//			break;
//			
//		case ABOUT :
//			//game.getSettings().render(g);
//			break;
//			
//		case PLAYING :
//			gameMain.getPlaying().keyTyped(keyChar - 49);
//			break;
//	
//		}
//		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
