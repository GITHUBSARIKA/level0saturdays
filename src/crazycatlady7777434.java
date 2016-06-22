import java.net.URI;

import javax.swing.JOptionPane;

public class crazycatlady7777434 {

	public static void main(String[] args) {
		String cats = JOptionPane.showInputDialog("How many cats do you have?");
		int gtr = Integer.parseInt(cats);
		if (gtr > 3) {
			JOptionPane.showMessageDialog(null, "You are a crazy cat lady. ");
		}
		else if(gtr==0){
		playVideo("https://youtu.be/SKRgktzRvZ0");
	}
		else if (gtr <= 3) {
			playVideo("https://youtu.be/6hif1gj_Ln8");
		}
		
	}
	// 4. If they have 3 or less, call the method below to show them a cat video

	// 5. If they say 0, show them a video of A Frog Sitting on a Bench Like a
	// Human

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}}


