package vh.objectManagers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import vh.events.GameWave;
import vh.scene.Playing;

public class WaveManager {
	
	private Playing playing;
	private ArrayList<GameWave> gWave = new ArrayList<>();
	private int hSpawnTime = 1; // in second
	private int hSpawnLimit = 60 * hSpawnTime;  
	private int hSpawnTick = hSpawnLimit;
	private int hIndex = 0, wIndex;
	private int wTime = 10; // in second
	private int wTimeLimit = 60 * wTime;
	private int wTimeTick = 0;
	private boolean wTimer = false;
	private boolean wIntervalOver = false;
	private Random rand;
	
	public WaveManager(Playing playing) {
		this.playing = playing;
		this.rand = new Random();
		createWave();
	}
	
	public void update() {
		if(hSpawnTick < hSpawnLimit)
			hSpawnTick++;
		
		if (wTimer == true) {
			wTimeTick++;
			if (wTimeTick >= wTimeLimit) {
				wIntervalOver = true;
			}
		}
	}
	
	public void isNextWave() {
		wIndex++;
		hIndex = 0;
		wTimeTick = 0;
		wTimer = false;
		wIntervalOver = false;
	}
	
	public void setWaveTimer() {
		wTimer = true;		
	}
	
	public int getNextHungry() {
		this.hSpawnTick = 0;
		return gWave.get(wIndex).gethList().get(hIndex++);
	}
	
	private void createWave() {
		for (int i = 0 ; i < 1000 ; i++) {
			ArrayList<Integer> wave = new ArrayList<Integer>();
			
			int count = 0, upperBound, lowerBound;
			
			if (i > 7) upperBound = 7;
			else if (i > 6) upperBound = 6;
			else if (i > 5) upperBound = 5;
			else if (i > 4) upperBound = 4;
			else if (i > 1) upperBound = 3;
			else upperBound = 2;
			
			if (i <= 9) lowerBound = 0;
			else lowerBound = 3;
			
			while (count <= (6 + (i*4))) {
				if (i == 0) wave.add(0);
				else wave.add(rand.nextInt(lowerBound, upperBound));
				count++;
			}
			
			gWave.add(new GameWave(wave));
		}
	}

	public ArrayList<GameWave> getWave(){
		return this.gWave;
	}

	public boolean isTimeForSpawn() {
		
		return hSpawnTick >= hSpawnLimit;
	}

	public boolean isWaveEnd() {
		return hIndex >= gWave.get(wIndex).gethList().size();
	}

	public boolean isItEnd() {
		return wIndex >= gWave.size()-1;
	}

	public boolean isWaveIntervalOver() {		
		return wIntervalOver;
	}
	
	public int gethIndex() {
		return hIndex;
	}

	public int getwIndex() {
		return wIndex;
	}
	
	public void resetWaves() {
		gWave.clear();
		createWave();
		hIndex = 0;
		wIndex = 0;
		wTimer = false;
		wIntervalOver = false;
		wTimeTick = 0;
		hSpawnTick = hSpawnLimit;
	}
}
