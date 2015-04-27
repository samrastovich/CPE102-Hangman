
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import javax.swing.JPanel;

public class HangmanFigure extends JPanel {
	
	private int guesses;
	

	public HangmanFigure() {
		super();
		guesses = 0;
		setPreferredSize(new Dimension(300, 300));
		setOpaque(true);
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.ORANGE);
		
		// base
		if(guesses > 0) {
			g.drawRect(100, 285, 195, 10);
			g.fillRect(100, 285, 195, 10);
		}
		
		// right wall
		if(guesses > 1) {
			g.drawRect(285, 5, 5, 290);
			g.fillRect(285, 5, 5, 290);
		}
		
		// top line
		if(guesses > 2) {
			g.drawRect(145, 5, 140, 5);
			g.fillRect(145, 5, 140, 5);
		}
		
		g.setColor(Color.DARK_GRAY);
		// hanging line
		if(guesses > 3) {
			g.drawRect(149, 5, 3, 65);
			g.fillRect(149, 5, 3, 65);
		}
		
		g.setColor(Color.BLUE);
		
		// face
		if(guesses > 4) {
			g.drawOval(150-25, 70, 50, 50);
		}
		
		// body
		if(guesses > 5) {
			g.drawLine(150, 120, 150, 200);
		}
		
		// left hand
		if(guesses > 6) {
			g.drawLine(150, 150, 110, 140);
		}
		
		// right hand
		if(guesses > 7) {
			g.drawLine(150, 150, 190, 140);
		}
		
		// left leg
		if(guesses > 8) {
			g.drawLine(150, 200, 120, 250);
		}
		
		// right leg
		if(guesses > 9) {
			g.drawLine(150, 200, 180, 250);
		}
	}
	
	public void set() {
		guesses++;
		paintComponent(getGraphics());
	}
}
