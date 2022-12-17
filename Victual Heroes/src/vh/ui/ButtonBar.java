package vh.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Currency;

import vh.helper.Constants.Towers;
import vh.helper.LoadSave;
import vh.hungries.Hungries;
import vh.object.Stall;
import vh.scene.Playing;

public class ButtonBar {
	
	private int x, y, width, height;
	private Playing playing;
	
	private Button[] stallButtons;
	private Stall curStall, dispStall;
	private Button stallSell, stallUp;
	private BufferedImage miniCoin;
	
	private int money = 100;
	private boolean showStallPrice = false;
	private int stallCostType;
	
	public ButtonBar(int x, int y, int w, int h, Playing playing) {
		this.x = x;
		this.y = y;
		this.width = w;
		this.height = h;
		this.playing = playing;
		this.miniCoin = LoadSave.getMiniCoin();
		
		initializeButtons();
	}
	
	private void initializeButtons() {
		stallButtons = new Button[4];
		int width = 60;
		int height = 60;
		int xStart = 120;
		int yStart = 596;
		int xDiff = (int) (width * 1.5f);
		
		for (int i = 0 ; i < stallButtons.length ; i++) {
			stallButtons[i] = new Button("", xStart + (xDiff * i), yStart, width, height, i);
		}
		
		stallUp = new Button("Upgrade", 800, 645, 70, 21, 0);
		stallSell = new Button("Sell", 950, 645, 50, 21, 0);
	}

	public void draw(Graphics g) {
		g.setColor(new Color(192, 192, 222));
		g.fillRect(x, y, width, height);
		
		drawButtons(g);
		
		drawDispStall(g);
		
		drawWaveInfo(g);
		
		if (showStallPrice)
			drawStallCost(g);
		
		drawMoneyInfo(g);
	}
	
	private void drawStallCost(Graphics g) {
		if (isMoneyEnough()) 
			g.setColor(new Color(26, 208, 28));
		else 
			g.setColor(new Color(255, 76, 48));
		
			g.fillRect(620, 602, 150, 47);
		
			g.setFont(new Font("LucidaSans", Font.PLAIN, 15));
			g.setColor(Color.BLACK);
			g.drawRect(620, 602, 150, 47);
			
			g.drawString(getStallName(), 625, 620);
			g.drawString("Price : " + getStallPrice(), 625, 640);
			
			g.drawImage(miniCoin, 693, 627, null);
	}

	private boolean isMoneyEnough() {
		return money >= getStallPrice();
	}

	private String getStallName() {
		return vh.helper.Constants.Towers.getName(stallCostType);
	}

	private int getStallPrice() {
		return vh.helper.Constants.Towers.getStallPrice(stallCostType);	}

	private void drawMoneyInfo(Graphics g) {
		g.setColor(new Color(180, 175, 170));
		g.fillRect(7, 602, 90, 47);
		g.setColor(Color.BLACK);
		g.drawRect(7, 602, 90, 47);
		
		BufferedImage coinSprite = LoadSave.getCoinSprite();
		g.drawImage(coinSprite, 12, 609, null);
		
		g.setColor(Color.WHITE);
		if (money < 10) {
			g.setFont(new Font("LucidaSans", Font.BOLD, 26));
			g.drawString(" " + money, 52, 634);
		} else if (money < 100) {
			g.setFont(new Font("LucidaSans", Font.BOLD, 24));
			g.drawString(" " + money, 48, 633);
		} else if (money < 1000) {
			g.setFont(new Font("LucidaSans", Font.BOLD, 24));
			g.drawString(" " + money, 44, 633);
		} else if (money < 10000) {
			g.setFont(new Font("LucidaSans", Font.BOLD, 20));
			g.drawString(" " + money, 42, 632);
		} else if (money < 100000) {
			g.setFont(new Font("LucidaSans", Font.BOLD, 16));
			g.drawString(" " + money, 45, 631);
		} else {
			g.setFont(new Font("LucidaSans", Font.BOLD, 20));
			g.drawString(" MAX", 43, 632);
		}		
	}

	private void drawWaveInfo(Graphics g) {
		int xWInfo = 860;
		int yWInfo = 20;
		g.setColor(Color.ORANGE);
		g.fillRect(xWInfo, yWInfo, 150, 80);
		g.setColor(Color.BLACK);
		g.drawRect(xWInfo, yWInfo, 150, 80);
		g.setFont(new Font("LucidaSans", Font.BOLD, 15));
		drawHInfo(g, xWInfo, yWInfo);
		drawWInfo(g, xWInfo, yWInfo);
		
	}

	private void drawHInfo(Graphics g, int x, int y) {
		int remaining = playing.getHungriesManager().getRemainingHungry();
		g.drawString("Hungries Left : " + remaining , x+10, y+30);
	}

	private void drawWInfo(Graphics g, int x, int y) {
		int currWave = playing.getWaveManager().getwIndex() + 1;
		g.drawString("Wave : " + currWave, x+10, y+60);
	}

	private void drawDispStall(Graphics g) {
		if (dispStall != null) {
			g.setColor(new Color(212, 175, 55));
			g.fillRect(790, 582, 220, 88);
			g.setColor(Color.BLACK);
			g.drawRect(790, 582, 220, 88);
			g.drawRect(800, 589, 51, 51);
			g.drawImage(playing.getStallManager().getStallImages()[dispStall.getStallType()], 802, 591, 48, 48, null);
			g.setFont(new Font("LucidaSans", Font.PLAIN, 15));
			g.drawString(Towers.getName(dispStall.getStallType()), 865, 609);
			g.drawString("( Grade " + dispStall.getGrade() + " )", 865, 629);
			
			drawDispStallAtr(g);
			
			if (dispStall.getGrade() < 3) {
				stallUp.draw(g);
				drawButtonFb(g, stallUp);
			}
			
			stallSell.draw(g);
			drawButtonFb(g, stallSell);
			
			if (stallUp.isOver()) {
				if (money >= getUpPrice(dispStall)) g.setColor(Color.GREEN);
				else g.setColor(Color.RED);
				g.drawString("Cost :\n " + getUpPrice(dispStall), 877, 660);
				g.drawImage(miniCoin, 928, 647, null);
			} else if (stallSell.isOver()) {
				g.setColor(Color.CYAN);
				g.drawString("Gain :\n " + getSellPrice(dispStall), 877, 660);
				g.drawImage(miniCoin, 928, 647, null);
			}
		}
	}
	
	private int getUpPrice(Stall dispStall) {
		return (int) (vh.helper.Constants.Towers.getStallPrice(dispStall.getStallType())*dispStall.getGrade()*0.4f);
	}

	private int getSellPrice(Stall dispStall) {
		int upCost = 0;
		for (int i = 1 ; i < dispStall.getGrade() ; i++) {
			upCost += (getUpPrice(dispStall)*i);
		}
		
		return ((vh.helper.Constants.Towers.getStallPrice(dispStall.getStallType()) + upCost)/2);
	}

	private void drawDispStallAtr(Graphics g) {
		g.setColor(Color.WHITE);
		g.drawOval((int)(dispStall.getX() + (dispStall.getStallSize()/2) - (dispStall.getStallRange()/2)),
				   (int)(dispStall.getY() + (dispStall.getStallSize()/2) - (dispStall.getStallRange()/2)),
				   (int)(dispStall.getStallRange()), (int)(dispStall.getStallRange()));
		
		g.setColor(Color.YELLOW);
		g.drawRect(dispStall.getX() - 1, dispStall.getY() - 1, 50, 50);
	}

	private void drawButtons(Graphics g) {
		for (Button b : stallButtons) {
			g.setColor(new Color(212, 175, 55));
			g.fillRect(b.x, b.y, b.width, b.height);
			g.drawImage(playing.getStallManager().getStallImages()[b.getId()], b.x, b.y + 3, b.width, b.height - 6, null);
			drawButtonFb(g, b);
		}
	}
	
	private void drawButtonFb(Graphics g, Button b) {
		if (b.isOver()) {
			g.setColor(Color.WHITE);
		} 
		
		else {
			g.setColor(Color.BLACK);
		}
		
		g.drawRect(b.x, b.y, b.width, b.height);
		
		if (b.isPressed()) {
			g.setColor(Color.WHITE);
			g.drawRect(b.x + 1, b.y + 1, b.width - 2, b.height - 2);
			g.drawRect(b.x + 2, b.y + 2, b.width - 4, b.height - 4);
		}
	}
	
	public void displayStall(Stall t) {
		dispStall = t;
	}
	
	private void upgradeStall() {
		if (money >= getUpPrice(dispStall)) {
			money -= getUpPrice(dispStall);
			playing.upgradeStall(dispStall);
		}
	}
	
	private void sellStall() {
		playing.removeStall(dispStall);
		money += getSellPrice(dispStall);
		displayStall(null);
	}

	public void mouseClicked(int x, int y) {
		
		if (dispStall != null) {
			if (stallUp.getBounds().contains(x, y) && dispStall.getGrade() < 3) {
				upgradeStall();
				return;
			} else if (stallSell.getBounds().contains(x, y)) {
				sellStall();
				return;
			}
		}
		
		displayStall(null);
		for (Button b : stallButtons) {
			if (b.getBounds().contains(x, y)) {
				if (!(isMoneyEnough(b.getId()))){
					return;
				}	
				else {
					curStall = new Stall(0, 0, -1, b.getId());
					playing.setCurStall(curStall);
					return;
				}
			}
		}
	}

	private boolean isMoneyEnough(int id) {
		return money >= vh.helper.Constants.Towers.getStallPrice(id);
	}

	public void mouseMoved(int x, int y) {
		showStallPrice = false;
		stallUp.setMouseOverButton(false);
		stallSell.setMouseOverButton(false);
		
		for (Button b : stallButtons) {
			b.setMouseOverButton(false);
		}
		
		if (dispStall != null) {
			if (stallUp.getBounds().contains(x, y) && dispStall.getGrade() < 3) {
				stallUp.setMouseOverButton(true);
				return;
			} else if (stallSell.getBounds().contains(x, y)) {
				stallSell.setMouseOverButton(true);
				return;
			}
		}
		
		for (Button b : stallButtons) {
			if (b.getBounds().contains(x, y)) {
				b.setMouseOverButton(true);
				showStallPrice = true;
				stallCostType = b.getId();
				return;
			}
		}
	}

	public void mousePressed(int x, int y) {
		
		if (dispStall != null) {
			if (stallUp.getBounds().contains(x, y) && dispStall.getGrade() < 3) {
				stallUp.setMousePressedButton(true);
				return;
			} else if (stallSell.getBounds().contains(x, y)) {
				stallSell.setMousePressedButton(true);
				return;
			}
		}
		
		for (Button b : stallButtons) {
			if (b.getBounds().contains(x, y)) {
				b.setMousePressedButton(true);
				return;
			}
		}
	}

	public void mouseReleased(int x, int y) {
		stallSell.resetMouseState();
		stallUp.resetMouseState();
		for (Button b : stallButtons) {
			b.resetMouseState();
		}
	}

	public void stallDeployed(int stallType) {
		this.money -= vh.helper.Constants.Towers.getStallPrice(stallType);
	}

	public void addGold(int hGold) {
		this.money += hGold;
	}
}
