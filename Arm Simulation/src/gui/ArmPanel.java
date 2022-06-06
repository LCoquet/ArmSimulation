package gui;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import data.ArmRepresentation;
import data.Paper;

/**
 * 
 * @author Léo COQUET
 *
 */
@SuppressWarnings("serial")
public class ArmPanel extends JPanel {

	private ArmRepresentation ar;
	private Paper paper;
	
	public ArmPanel(ArmRepresentation ar, Paper paper) {
		this.ar = ar;
		this.paper = paper;
	}
	
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		super.paintComponent(g);
		g.setColor(ArmRepresentation.getHandcolor());
		for(int x = 0; x < Paper.getHeight(); x ++) {
			for(int y = 0; y < Paper.getLength(); y ++) {
				if(paper.getPixel(x, y))
					g.fillRect(x, y, 1, 1);
			}
		}
		g2.setStroke(new BasicStroke(5));
		g2.setColor(ArmRepresentation.getHumeruscolor());
		g2.drawLine(0, 0, ar.getX1(), ar.getY1());
		g2.setColor(ArmRepresentation.getForearmcolor());
		g2.drawLine(ar.getX1(), ar.getY1(), ar.getX2(), ar.getY2());
	}
	
}
