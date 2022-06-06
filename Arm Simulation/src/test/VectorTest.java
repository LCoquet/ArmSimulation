package test;

import process.InstructionGenerator;

public class VectorTest {

	public static void main(String[] args) {
		
		int x1 = 50;
		int y1 = 50;
		int x2 = 100;
		int y2 = 200;
		String input = InstructionGenerator.generateVector(x1, y1, x2, y2);
		System.out.println(input);
		
	}
	
}
