//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class DontForgetTheLyrics {
	/*
	 * For this game, we'll play the start of a song, and the player has to guess the rest of the lyrics.
	 * 
	 * 1. To record a sound clip, open Audacity and record your song.
	 * 
	 * 2. Click File -> Export Audio, and save your file on the Desktop.
	 * 
	 * 3. Drag your file from the Desktop into the "default package" under "src".
	 */
	
	public static void main(String[] args) {
		// 4. Make a pop-up to explain the game.
JOptionPane.showMessageDialog(null, "So, the rules of this game are to finish the next few lyrics of a certin song."
		+ "use correct spelling, punctuation, and ");
		// 5. Use the playSound method to play your song.
playSound("The Baddest Girl.wav");
		// 6. Make a pop-up for the player to type their answer.
String song = JOptionPane.showInputDialog("Type the next 17 lyrics here.");
		// 7. If they answered correctly, tell them that they were right.
if (song.equals("and ran, but your bodies got me thinking twice, your reputation does not matter in those eyes.")) {
	JOptionPane.showMessageDialog(null, "Great jod you person! Yha!");
}
		// 8. Otherwise, tell them they are wrong, and give them the answer.
else {
	JOptionPane.showMessageDialog(null, "Sorry, better luck next time. "
			+ "The crect lyrics are: and ran, but your bodies got me thinking twice, your reputation does not matter in those eyes. ");
}
		// 9. Record another sound and repeat steps 5-8.
playSound("Water.wav");
String water = JOptionPane.showInputDialog("Type the next");
		// 10. [optional] Add a points variable that will calculate their final score.
	}

	public static void playSound(String fileName) {
		AudioClip audioClip = JApplet.newAudioClip(new DontForgetTheLyrics().getClass().getResource(fileName));
		audioClip.play();
	}
}


