package vh.object;

import java.awt.image.BufferedImage;

public class MapTile {

	private BufferedImage map;
	private int tileType;
	
	public MapTile(BufferedImage map, int tileType) {
		this.map = map;
		this.tileType = tileType;
	}

	public BufferedImage getMap() {
		return map;
	}

	public int getTileType() {
		return tileType;
	}
	
}