package process;

import data.Arm;

//Generates a basic arm
public class ArmBuilder {

	public static Arm build() {
		double forearmLength = 500.0;
		double humerusLength = 500.0;
		double elbowAngle = Math.PI;
		double shoulderAngle = Math.PI;
		boolean writing = true;
		return new Arm(forearmLength, humerusLength, elbowAngle, shoulderAngle, writing);
	}
	
}
