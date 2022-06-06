package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import data.ArmRepresentation;
import data.Paper;

@SuppressWarnings("serial")
public class Window extends JFrame {

	ArmRepresentation ar;
	Paper paper;
	JPanel panel = new JPanel();
	ArmPanel ap;
	
	public Window(ArmRepresentation ar, Paper paper) {
		this.ar = ar;
		this.paper = paper;
		
		setPreferredSize(new Dimension(1000, 1000));
		setTitle("Arm Simulator");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		pack();
		setContentPane(panel);
		panel.setLayout(new BorderLayout());
		
		update();
		requestFocusInWindow();
	}
	
	public void update() {
		ap = new ArmPanel(ar, paper);
		panel.add(BorderLayout.CENTER, ap);
		setVisible(true);
	}
	
}
