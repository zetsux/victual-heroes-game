package vh.sound;

import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sound {
	
	Clip clip;
	URL sound[] = new URL[5];
	
	public Sound() {
		
		sound[0] = getClass().getResource("/sound/mainmenuMusic.wav");
		sound[1] = getClass().getResource("/sound/playingMusic.wav");
	}
	
	public void setMusic (int i) {
		
		try {
			AudioInputStream ais = AudioSystem.getAudioInputStream(sound[i]);
			clip = AudioSystem.getClip();
			clip.open(ais);
			
		}catch (Exception e) {
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
	
}
