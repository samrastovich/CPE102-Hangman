import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
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
		Graphics2D g2 = (Graphics2D) g;
		g2.setBackground(Color.BLUE);
		g2.setColor(Color.BLACK);
		Color brown = new Color(156, 93, 82);
		
		// base
		if(guesses > 0) {
			g2.setColor(brown);
			g2.fillRect(1, 290, 299, 10);

		}
		
		// right wall
		if(guesses > 1) {
			g2.fillRect(290, 1, 10, 299);
		}
		
		// top line
		if(guesses > 2) {
			int[] xPoints = {280, 299, 299, 260};
			int[] yPoints = {1, 20, 40, 1};
			g2.fillRect(145, 1, 149, 10);
			g2.fillPolygon(xPoints, yPoints, 4); //angle in the right corner
		}
		
		// hanging line
		if(guesses > 3) {
			g2.drawLine(150, 1, 150, 70);
			int y = 10;
			while(y < 70) {
				g2.setColor(Color.BLACK);  //this is the noose, rope texture
				g2.drawRect(147, y, 5, 2);
				g2.setColor(brown);
				g2.fillRect(147, y, 5, 2);
				y += 3;
			}
		}
		
		// face
		if(guesses > 4) {
			int y = 120;
			g2.setColor(Color.BLACK);
			g2.drawOval(125, 70, 50, 50);
			while(y < 129) {
				g2.setColor(Color.BLACK); //noose at the base of his neck(loop)
				g2.drawRect(147, y, 5, 2);
				g2.setColor(brown);
				g2.fillRect(147, y, 5, 2);
				y += 3;
			}
			g2.setColor(Color.BLACK);
			g2.fillOval(140, 85, 5, 5);//face
			g2.fillOval(160, 85, 5, 5);
			g2.drawArc(140, 105, 10, 5, 20, 160);
		}
		
		// body
		if(guesses > 5) {
			g2.setColor(Color.BLACK);
			g2.drawLine(150, 120, 150, 200);
		}
		
		// left hand
		if(guesses > 6) {
			g2.drawLine(150, 150, 110, 140);
		}
		
		// right hand
		if(guesses > 7) {
			g2.drawLine(150, 150, 190, 140);
		}
		
		// left leg
		if(guesses > 8) {
			g2.drawLine(150, 200, 120, 250);
		}
		
		// right leg
		if(guesses > 9) {
			g2.drawLine(150, 200, 180, 250);
		}
	}
	
	public void set() {
		guesses++;
		paintComponent(getGraphics());
	}
	
}