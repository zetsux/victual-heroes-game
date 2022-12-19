package vh.sound;

import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

public class Sound {
	
	Clip clip;
	URL sound[] = new URL[5];
	
	private float minusVolume;
	private boolean muted = false;
	
	public Sound() {
		
		sound[0] = getClass().getResource("/sound/mainmenuMusic.wav");
		sound[1] = getClass().getResource("/sound/playingMusic.wav");
		sound[2] = getClass().getResource("/sound/highMusic.wav");
		sound[3] = getClass().getResource("/sound/lowMusic.wav");
		
		this.minusVolume = 30.0f;
	}
	
	public void setMusic (int i) {
		
		try {
			AudioInputStream ais = AudioSystem.getAudioInputStream(sound[i]);
			clip = AudioSystem.getClip();
			clip.open(ais);
			refreshVolume();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void play() {
		
		clip.start();
	}
	
	public void loop() {
		
		clip.loop(Clip.LOOP_CONTINUOUSLY);
	}
	
	public void stop() {
		
		clip.stop();
	}
	
	private void refreshVolume() {
		FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
		if (!muted) gainControl.setValue(-minusVolume);
		else gainControl.setValue(-80.0f);
	}
	
	public void setMinusVolume(float fl) {
		minusVolume = fl;
		refreshVolume();
	}
	
	public void changeMuted() {
		muted = !(muted);
		refreshVolume();
	}
}
