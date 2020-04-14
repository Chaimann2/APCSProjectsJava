package triangle2;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;


public class main {
	public static void main (String [] args) {
		JFrame GUI = new JFrame();
		GUI.setSize(400, 300);
		GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		colorpanel panel = new colorpanel(Color.white);
		Container pane = GUI.getContentPane();
		pane.add(panel);
		GUI.setVisible(true);
	}
}
