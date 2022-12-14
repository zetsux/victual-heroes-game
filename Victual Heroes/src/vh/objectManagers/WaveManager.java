package vh.objectManagers;

import java.util.ArrayList;
import java.util.Arrays;

import vh.events.GameWave;
import vh.scene.Playing;

public class WaveManager {
	
	private Playing playing;
	private ArrayList<GameWave> gWave = new ArrayList<>();
	private int hSpawnTime = 1; // in second
	private int hSpawnLimit = 60 * hSpawnTime;  
	private int hSpawnTick = hSpawnLimit;
	private int hIndex = 0, waveIndex;
	
	public WaveManager(Playing playing) {
		this.playing = playing;
		createWave();
	}
	
	public void update() {
		if(hSpawnTick < hSpawnLimit)
			hSpawnTick++;
	}
	
	public int getNextHungry() {
		this.hSpawnTick = 0;
		return gWave.get(waveIndex).gethList().get(hIndex++);
	}
	
	private void createWave() {
		
		gWave.add(new GameWave(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0, 0, 1))));	
	}

	public ArrayList<GameWave> getWave(){
		return this.gWave;
	}

	public boolean isTimeForSpawn() {
		
		return hSpawnTick >= hSpawnLimit;
	}

	public boolean isWaveEnd() {
		return hIndex >= gWave.get(waveIndex).gethList().size();
	}
	
}
