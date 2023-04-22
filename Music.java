package main;

import java.io.File;

import java.util.ArrayList;

import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

public class Music {

	String loadingMusic;
	String characterMusic;
	String itemMusic;

	/**
	 * THIS IS A TEST MAIN METHOD TO TEST ALL OF THE OTHER METHODS BEING CREATED
	 * 
	 * @param args
	 */
	public static void main(String args[]) {

		playMusic(loadItemMusic().get(0));

	}

	/**
	 * Creating an arraylist for the loadingMusic
	 * 
	 * @param l
	 * @return
	 */
	public static ArrayList<String> loadLoadingMusic() {
		ArrayList<String> loadingSounds = new ArrayList<String>();
		loadingSounds.add("C:\\Users\\Admin\\Documents\\CSIS 2450\\Grand Text Auto\\music\\LoadingScreenMusic.wav");

		return loadingSounds;
	}

	/**
	 * Creating an arraylist for the characterMusic
	 * 
	 * @param c
	 * @return
	 */
	public static ArrayList<String> loadCharacterMusic() {
		ArrayList<String> characterSounds = new ArrayList<String>();
		characterSounds.add("C:\\Users\\Admin\\Documents\\CSIS 2450\\Grand Text Auto\\music\\ThemeSong.wav");

		return characterSounds;
	}

	/**
	 * Creating an arraylist for the itemMusic
	 * 
	 * @param i
	 * @return
	 */
	public static ArrayList<String> loadItemMusic() {
		ArrayList<String> itemSounds = new ArrayList<String>();
		itemSounds.add("C:\\Users\\Admin\\Documents\\CSIS 2450\\Grand Text Auto\\music\\ItemSound.wav");

		return itemSounds;
	}

	/**
	 * Method to play any given sound thrown into the parameters
	 * 
	 * @param arrayList
	 */
	public static void playMusic(String arrayList) {
		Scanner scanner = new Scanner(System.in);

		try {
			File file = new File(arrayList);
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
			Clip clip = AudioSystem.getClip();
			clip.open(audioStream);

			FloatControl fc = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			float volume = 0;// initializing the volume
			volume += -20.0f; // setting the volume lower
			fc.setValue(volume);

			clip.start();// starting the music
			Thread.sleep(10000); // creating the clip to last a maximum of 10 seconds before stopping (this can
									// be changed to what we need e.g. background music)
			clip.stop();

			String response = scanner.next();

		} catch (Exception e)// an exception if there is a failure
		{
			System.out.println("Error Cannot Play");
		}
	}

}