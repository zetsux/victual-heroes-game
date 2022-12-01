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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {			
		switch(GameStates.gameState) {
			
			case MENU :
				gameMain.getMenu().mouseMoved(e.getX(), e.getY());
				break;
				
			case SETTINGS :
				//game.getSettings().render(g);
				break;
				
			case PLAYING :
				gameMain.getPlaying().mouseMoved(e.getX(), e.getY());
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
				
			case SETTINGS :
				//game.getSettings().render(g);
				break;
				
			case PLAYING :
				gameMain.getPlaying().mouseClicked(e.getX(), e.getY());
				break;
		
			}
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getButton()== MouseEvent.BUTTON1) {
			switch(GameStates.gameState) {
			
			case MENU :
				gameMain.getMenu().mousePressed(e.getX(), e.getY());
				break;
				
			case SETTINGS :
				//game.getSettings().render(g);
				break;
				
			case PLAYING :
				gameMain.getPlaying().mousePressed(e.getX(), e.getY());
				break;
			}
		}
//		int buttonCode = e.getButton();
//		if (buttonCode == MouseEvent.BUTTON1) {
//			System.out.println("Left Button Clicked");
//		}
//		
//		else if (buttonCode == MouseEvent.BUTTON2) {
//			System.out.println("Middle Button Clicked");
//		}
//		
//		else if (buttonCode == MouseEvent.BUTTON3) {
//			System.out.println("Right Button Clicked");
//		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {

		switch(GameStates.gameState) {
		
		case MENU :
			gameMain.getMenu().mouseReleased(e.getX(), e.getY());
			break;
			
		case SETTINGS :
			//game.getSettings().render(g);
			break;
			
		case PLAYING :
			gameMain.getPlaying().mouseReleased(e.getX(), e.getY());
			break;
	}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}