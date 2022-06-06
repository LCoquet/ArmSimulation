package test;

import data.Arm;
import process.ArmBuilder;
import process.Interpreter;

/**
 * Unit test for the interpreter
 * 
 * tested with isntruction :
 * E120S35W0
 * 
 * We know that :
 * 120° = 2.09rad, 35° = 0.61rad
 * 
 * result given : 
 * 2.0943951023931953
 * 0.6108652381980153
 * false
 * 
 * @author Léo COQUET
 *
 */
public class InterpreterTest {

	public static void main(String[] args) {
		
		Arm arm = ArmBuilder.build();
		//120° = 2.09rad, 35° = 0.61rad
		String instruction = "E120S35W0";
		Interpreter.instructionInterpretation(arm, instruction);
		System.out.println(arm.getElbowAngle());
		System.out.println(arm.getShoulderAngle());
		System.out.println(arm.isWriting());
				
	}

}
