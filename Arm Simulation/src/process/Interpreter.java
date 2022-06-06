package process;

import data.Arm;

/**
 * Interprets a single instruction and gives the angles to the arm
 * E = Elbow
 * S = Shoulder
 * W = Writing or not (1 for true, 0 for false)
 * If it is not given, it remains the same
 * 
 * @author Léo COQUET
 *
 */
public class Interpreter {

	public static void instructionInterpretation(Arm arm, String instruction) {
		boolean elbowInstruction = false;
		boolean shoulderInstruction = false;
		boolean writingInstruction = false;
		String elbowString = "";
		String shoulderString = "";
		
		for(int i = 0; i < instruction.length(); i ++) {
			char character = instruction.charAt(i);
			if(character == 'E') {
				elbowInstruction = true;
				shoulderInstruction = false;
				writingInstruction = false;
			} else if(character == 'S') {
				elbowInstruction = false;
				shoulderInstruction = true;
				writingInstruction = false;
			} else if(character == 'W') {
				elbowInstruction = false;
				shoulderInstruction = false;
				writingInstruction = true;
			} else {
				if(elbowInstruction) {
					if((character >= '0' && character <= '9') || character == '-') {
						elbowString += character;
					} 
				} else if(shoulderInstruction) {
					if((character >= '0' && character <= '9') || character == '-') {
						shoulderString += character;
					}
				} else if(writingInstruction) {
					if(character == '0') arm.setWriting(false);
					else if(character == '1') arm.setWriting(true);
				}
			}
		}
		
		if(!elbowString.equals("")) {
			int elbowAngle = Integer.parseInt(elbowString);
			arm.setElbowAngle(Math.toRadians(elbowAngle));
		}
		if(!shoulderString.equals("")) {
			int shoulderAngle = Integer.parseInt(shoulderString);
			arm.setShoulderAngle(Math.toRadians(shoulderAngle));
		}
	}
	
}
