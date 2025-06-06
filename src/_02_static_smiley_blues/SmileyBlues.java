package _02_static_smiley_blues;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class SmileyBlues {
	void start() {
		// 1. Make a new JFrame and set it to be visible

		// 2. Set your frame's default close operation to JFrame.EXIT_ON_CLOSE

		// 3. Make a new JPanel

		// 4. Add your panel to your frame

		// 8. DO THIS LAST: 
		// Set the Smiley class's color variable to Smiley.YELLOW (NOT a specific smiley object's!)
		// Using a specific object for a static variable works, but is not usually recommended.
		// Run it again; are your Smileys all yellow now? Also try changing them to red or green!

		// 5. Make three Smiley objects and add them to your panel

		// 6. Pack your frame

		// 7. RUN THE PROGRAM and make sure you see three blue Smileys!
		JFrame frame = new JFrame("i am a frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		frame.add(panel);
		Smiley smiley1 = new Smiley();
		Smiley smiley2 = new Smiley();
		Smiley smiley3 = new Smiley();
		frame.add(smiley1);
		frame.add(smiley2);
		frame.add(smiley3);
		frame.pack();
	}
}
