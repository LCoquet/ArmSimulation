package process;

import data.Arm;
import data.ArmRepresentation;

/**
 * This class is used to calculate all the kinematic stuff
 * 
 * @author Léo COQUET
 *
 */
public class Kinematic {

	public static void placePoints(Arm arm, ArmRepresentation armRepresentation) {
		//First arm's placement
		int x1 = (int) (arm.getHumerusLength() * Math.cos(arm.getShoulderAngle()));
		int y1 = (int) (arm.getHumerusLength() * Math.sin(arm.getShoulderAngle()));
		armRepresentation.setX1(x1);
		armRepresentation.setY1(y1);
		
		//Second arm's placement
		int x2 = (int) (armRepresentation.getX1() + 
				arm.getForearmLength() * Math.cos(arm.getShoulderAngle() + arm.getElbowAngle()));
		int y2 = (int) (armRepresentation.getY1() +
				arm.getForearmLength() * Math.sin(arm.getShoulderAngle() + arm.getElbowAngle()));
		armRepresentation.setX2(x2);
		armRepresentation.setY2(y2);
	}
	
	public static void inverse(Arm arm, int x, int y) {
		
		double r2 = Math.acos((Math.pow(x, 2) + Math.pow(y, 2) -
				Math.pow(arm.getHumerusLength(), 2) - Math.pow(arm.getForearmLength(), 2)) /
				(2 * arm.getHumerusLength() * arm.getForearmLength()));
		
		double r1 = Math.atan(y/x) - Math.atan((arm.getForearmLength() * Math.sin(r2))/
				(arm.getHumerusLength() + arm.getForearmLength() * Math.cos(r2)));
		System.out.println("R1 : " + r1 + "R2 : " + r2);
		arm.setShoulderAngle(r2);
		arm.setElbowAngle(r1);
	}
	
}
