package data;

import java.awt.Color;

/**
 * This class contains the information about the arm, but only to represent it graphically
 * 
 * @author Léo COQUET
 *
 */
public class ArmRepresentation {
	
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private final static Color forearmColor = Color.BLUE;
	private final static Color humerusColor = Color.CYAN;
	private final static Color handColor = Color.RED;
	
	/**
	 * Empty constructor
	 */
	public ArmRepresentation() {
		
	}
	
	/**
	 * Constructor
	 * 
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 */
	public ArmRepresentation(int x1, int y1, int x2, int y2) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	/**
	 * Forearm's color getter
	 * @return Forearm's color
	 */
	public static Color getForearmcolor() {
		return forearmColor;
	}

	/**
	 * Humerus' color getter
	 * @return Humerus' color
	 */
	public static Color getHumeruscolor() {
		return humerusColor;
	}

	/**
	 * Hand's color getter
	 * @return Hand's color
	 */
	public static Color getHandcolor() {
		return handColor;
	}

	/**
	 * x1 getter
	 * @return x1
	 */
	public int getX1() {
		return x1;
	}

	/**
	 * x1 setter
	 * @param x1 New x1
	 */
	public void setX1(int x1) {
		this.x1 = x1;
	}

	/**
	 * y1 getter
	 * @return y1
	 */
	public int getY1() {
		return y1;
	}

	/**
	 * y1 setter
	 * @param y1 new y1
	 */
	public void setY1(int y1) {
		this.y1 = y1;
	}

	/**
	 * x2 getter
	 * @return x2
	 */
	public int getX2() {
		return x2;
	}

	/**
	 * x2 setter
	 * @param x2 New x2
	 */
	public void setX2(int x2) {
		this.x2 = x2;
	}

	/**
	 * y2 getter
	 * @return y2
	 */
	public int getY2() {
		return y2;
	}

	/**
	 * y2 setter
	 * @param y2 New y2
	 */
	public void setY2(int y2) {
		this.y2 = y2;
	}
	/**
	 * To string
	 * @return the arm representation string with the position of the articulations
	 */
	public String toString() {
		String res = "";
		res += "X1 : " + x1 + "\nY1 : " + y1 + "\nX2 : " + x2 + "\nY2 : " + y2;
		return res;
	}

}
