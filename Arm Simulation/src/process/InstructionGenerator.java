package process;

import data.Arm;

public class InstructionGenerator {
	
	public static String generatePoint(int x, int y) {
		Arm arm = ArmBuilder.build();
		Kinematic.inverse(arm, x, y);
		int shoulderAngle = (int) Math.toDegrees(arm.getShoulderAngle());
		int elbowAngle = (int) Math.toDegrees(arm.getElbowAngle());

		String res = "S" + String.valueOf(shoulderAngle) + "E" + String.valueOf(elbowAngle) + " ";
		return res;
	}

	public static String generateVector(int x1, int y1, int x2, int y2) {
		String res = "W1 ";
		int vectorLength = (int) (Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)));
		int vx = x2 - x1;
		int vy = y2 - y1;
		res+= generatePoint(x1, y1);
		System.out.println("vl : " + vectorLength);
		for(int i = 1; i <= vectorLength; i ++) {
			int x = (int) (x1 + (((float) i / vectorLength) * vx));
			int y = (int) (y1 + (((float) i / vectorLength) * vy));
			System.out.println("x : " + x + "\ny : " + y);
			res += generatePoint(x, y);
		}
		return res;
	}
	
}
