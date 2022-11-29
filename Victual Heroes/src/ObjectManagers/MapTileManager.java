package ObjectManagers;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import helper.LoadSave;
import vh.object.MapTile;

public class MapTileManager {
	
	// Pavement to be inserted later
	public MapTile Block, Road;
	//public MapTile Pavement;
	public BufferedImage mapAtlas;
	public ArrayList<MapTile> tiles = new ArrayList<>();
	
	public BufferedImage img = null;
	
	
	public MapTileManager() {
		
		loadAtlas();
		createTiles();
	}
	
	private void createTiles() {
		
		tiles.add(Road = new MapTile(getMap(23, 2)));
		tiles.add(Block = new MapTile(getMap(27, 0)));
		//tiles.add(Pavement = new MapTile(getMap(0, 0)));
	}
	
	private void loadAtlas() {

		InputStream is = getClass().getResourceAsStream("/outdoors.png");
		try {
			img = ImageIO.read(is);
		} catch (Exception e) {
			System.out.println("Error");
		}
		
		this.mapAtlas = img;
	}
	
	public BufferedImage getMap(int id) {
		return tiles.get(id).getMap();
	}
	
	private BufferedImage getMap(int X, int Y) {
		return mapAtlas.getSubimage(X * 16, Y * 16, 16, 16);
	}
}
