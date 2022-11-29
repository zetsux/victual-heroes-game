package vh.object;

import java.awt.image.BufferedImage;

public class MapTile {

	private BufferedImage map;
	
	public MapTile(BufferedImage map) {
		this.map = map;
	}

	public BufferedImage getMap() {
		return map;
	}
	
}
