package data;

/**
 * This class is the main class containing all the information about the arm
 * 
 * @author Léo COQUET
 *
 */
public class Arm {

	private double forearmLength;
	private double humerusLength;
	private double elbowAngle;
	private double shoulderAngle;
	private boolean writing;
	
	/**
	 * Constructor 
	 * 
	 * @param forearmLength The forearm's length
	 * @param humerusLength The humerus' length
	 * @param elbowAngle The elbow's angle
	 * @param shoulderAngle The shoulder's angle
	 * @param writing Tells if the pen is writing or not
	 */
	public Arm(double forearmLength, double humerusLength, double elbowAngle, double shoulderAngle, boolean writing) {
		super();
		this.forearmLength = forearmLength;
		this.humerusLength = humerusLength;
		this.elbowAngle = elbowAngle;
		this.shoulderAngle = shoulderAngle;
		this.writing = writing;
	}

	/**
	 * Forearm's length getter
	 * @return Forearm's lenth
	 */
	public double getForearmLength() {
		return forearmLength;
	}

	/**
	 * Forearm's length setter
	 * @param forearmLength New forearm's lenth
	 */
	public void setForearmLength(double forearmLength) {
		this.forearmLength = forearmLength;
	}

	/**
	 * Humerus' length getter
	 * @return Humerus' length
	 */
	public double getHumerusLength() {
		return humerusLength;
	}

	/**
	 * Humerus' length setter
	 * @param humerusLength New humerus' length
	 */
	public void setHumerusLength(double humerusLength) {
		this.humerusLength = humerusLength;
	}

	/**
	 * Elbow's angle getter
	 * @return Elbow's angle
	 */
	public double getElbowAngle() {
		return elbowAngle;
	}

	/**
	 * Elbow's angle setter
	 * @param elbowAngle New elbow's angle
	 */
	public void setElbowAngle(double elbowAngle) {
		this.elbowAngle = elbowAngle;
	}

	/**
	 * Shoulder's angle getter
	 * @return Shoulder's angle
	 */
	public double getShoulderAngle() {
		return shoulderAngle;
	}

	/**
	 * Shoulder's angle setter
	 * @param shoulderAngle New shoulder's angle
	 */
	public void setShoulderAngle(double shoulderAngle) {
		this.shoulderAngle = shoulderAngle;
	}
	
	/**
	 * Writing getter
	 * @return True if the arm is writing, false else
	 */
	public boolean isWriting() {
		return writing;
	}
	
	/**
	 * Writing setter
	 * @param writing New writing boolean
	 */
	public void setWriting(boolean writing) {
		this.writing = writing;
	}
	
}
