package vh.input;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import vh.main.GameMain;
import vh.main.GameStates;

public class MouseInput implements MouseListener, MouseMotionListener {
	
	private GameMain gameMain;
	
	public MouseInput (GameMain gameMain) {
		this.gameMain = gameMain;
	}

	@Override
	public void mouseDragged(MouseEvent e) {	
		switch(GameStates.gameState) {
			case SETTINGS :
				gameMain.getSettings().mouseDragged(e.getX(), e.getY());
				break;
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {			
		switch(GameStates.gameState) {
			
			case MENU :
				gameMain.getMenu().mouseMoved(e.getX(), e.getY());
				break;
				
			case ABOUT :
				gameMain.getAbout().mouseMoved(e.getX(), e.getY());
				break;
				
			case PLAYING :
				gameMain.getPlaying().mouseMoved(e.getX(), e.getY());
				break;
				
			case OVER :
				gameMain.getGameOver().mouseMoved(e.getX(), e.getY());
				break;
				
			case SETTINGS :
				gameMain.getSettings().mouseMoved(e.getX(), e.getY());
				break;
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		if(e.getButton() == MouseEvent.BUTTON1){
			
			switch(GameStates.gameState) {
			
			case MENU :
				gameMain.getMenu().mouseClicked(e.getX(), e.getY());
				break;
				
			case ABOUT :
				gameMain.getAbout().mouseClicked(e.getX(), e.getY());
				break;
				
			case PLAYING :
				gameMain.getPlaying().mouseClicked(e.getX(), e.getY());
				break;
				
			case OVER :
				gameMain.getGameOver().mouseClicked(e.getX(), e.getY());
				break;
				
			case SETTINGS :
				gameMain.getSettings().mouseClicked(e.getX(), e.getY());
				break;
		
			}
		}else if (GameStates.gameState == GameStates.PLAYING) {
			gameMain.getPlaying().mouseClicked(e);
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getButton()== MouseEvent.BUTTON1) {
			switch(GameStates.gameState) {
			
			case MENU :
				gameMain.getMenu().mousePressed(e.getX(), e.getY());
				break;
				
			case ABOUT :
				gameMain.getAbout().mousePressed(e.getX(), e.getY());
				break;
				
			case PLAYING :
				gameMain.getPlaying().mousePressed(e.getX(), e.getY());
				break;
				
			case OVER :
				gameMain.getGameOver().mousePressed(e.getX(), e.getY());
				break;
				
			case SETTINGS :
				gameMain.getSettings().mousePressed(e.getX(), e.getY());
				break;
			}
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {

		switch(GameStates.gameState) {
		
		case MENU :
			gameMain.getMenu().mouseReleased(e.getX(), e.getY());
			break;
			
		case ABOUT :
			gameMain.getAbout().mouseReleased(e.getX(), e.getY());
			break;
			
		case PLAYING :
			gameMain.getPlaying().mouseReleased(e.getX(), e.getY());
			break;
			
		case OVER :
			gameMain.getGameOver().mouseReleased(e.getX(), e.getY());
			break;
		
		case SETTINGS :
			gameMain.getSettings().mouseReleased(e.getX(), e.getY());
			break;
	}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

}
