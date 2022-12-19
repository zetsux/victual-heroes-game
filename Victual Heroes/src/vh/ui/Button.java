package vh.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Button {

	public int x, y, width, height, id;
	private String name;
	private Rectangle buttonBound;
	
	private boolean mouseOverButton = false;
	private boolean mousePressedButton = false;
	
	private boolean paused = false, muted = false;
	
	public Button (String name, int x, int y, int width, int height, int id) {
		
		this.name = name;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.id = id;
		
		initializeBound();
	}
	
	private void initializeBound() {
		this.buttonBound = new Rectangle(x, y, width, height);
	}
	
	public void draw(Graphics g) {
		
		// Draw button's body
		drawButton(g);
		
		// Draw button's border
		drawBorder(g);
		
		// Draw button's name
		drawName(g);
		
	}
	
	private void drawName(Graphics g) {

		g.setColor(Color.BLACK);
		g.setFont(new Font("Helvetica", Font.BOLD, 12)); 
		if (name == "Upgrade") g.drawString(name, x + (2*(width/11)), y + (2*(height/3)));
		else if (name == "Sell") g.drawString(name, x + (2*(width/6)), y + (2*(height/3)));
		else if (name == "Pause") {
			if (paused) g.drawString("▶", x + (2*(width/4) - 2), y + (3*(height/5)));
			else g.drawString("| |", x + (2*(width/4) - 2), y + (3*(height/5) - 1));
		}
		else if (name == "Back") g.drawString("⬅ Back", x + (2*(width/10) + 1), y + (2*(height/3) - 2));
		else if (name == "Retry") g.drawString(name, x + (2*(width/5) - 1), y + (2*(height/3)));
		else if (name == "Menu") g.drawString("Back to Menu", x + (2*(width/10) + 2), y + (2*(height/3)));
		else if (name == "About") g.drawString(name, x + (2*(width/5) - 5), y + (2*(height/3)));
		else if (name == "← Back") g.drawString(name, x + (2*(width/6)), y + (2*(height/3)));
		else if (name == "Settings") g.drawString(name, x + (2*(width/7)), y + (2*(height/3)));
		else if (name == "Mute") {
			if (muted) g.drawString("Unmute", x + (2*(width/7) + 2), y + (3*(height/5) + 1));
			else g.drawString("Mute", x + (2*(width/5) - 2), y + (3*(height/5) + 1));
		}
		else g.drawString(name, x + (2*width/5), y + (2 * (height/3)));	
	}

	private void drawBorder(Graphics g) {

		g.setColor(Color.BLACK);
		g.drawRect(x, y, width, height);
		if(mousePressedButton) {
			g.drawRect(x + 1, y + 1, width - 2, height - 2);
			g.drawRect(x + 2, y + 2, width - 4, height - 4);
		} 
	}

	private void drawButton(Graphics g) {
		if (mouseOverButton) {
			g.setColor(Color.BLACK);
			g.fillRect(x, y, width, height);
			
			if (name == "Pause") {
				if (paused) g.setColor(new Color(61, 183, 228));
				else g.setColor(new Color(255, 76, 48));
			} 
			else if (name == "Quit" || name == "← Back") g.setColor(new Color(255, 76, 48));
			else if (name == "Retry" || name == "About") g.setColor(new Color(133, 255, 0));
			else if (name == "Settings") g.setColor(new Color(61, 183, 228));
			else if (name == "Mute") {
				if (muted) g.setColor(new Color(61, 183, 228));
				else g.setColor(new Color(255, 76, 48));
			} 
			else g.setColor(new Color(255, 235, 3));
			
			g.fillRect(x , y , width, height-3);
		} else {
			
			g.setColor(Color.WHITE);
			g.fillRect(x, y, width, height);
		}
	}

	public Rectangle getBounds() {
		return buttonBound;
	}
	
	public void setMouseOverButton (boolean mouseOverButton) {
		this.mouseOverButton = mouseOverButton;
	}
	
	public void setMousePressedButton (boolean mousePressedButton) {
		this.mousePressedButton = mousePressedButton;
	}
	
	public void resetMouseState () {
		this.mouseOverButton = false;
		this.mousePressedButton = false;
	}
	
	public Boolean isOver() {
		return mouseOverButton;
	}
	
	public Boolean isPressed() {
		return mousePressedButton;
	}
	
	public int getId() {
		return id;
	}
	
	public void changePaused() {
		paused = !(paused);
	}
	
	public void changeMuted() {
		muted = !(muted);
	}
	
	public boolean isMuted() {
		return muted;
	}
}