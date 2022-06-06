package process;

import data.ArmRepresentation;
import data.Paper;

public class Drawing {

	public static void draw(ArmRepresentation ar, Paper paper) {
		int x = ar.getX2();
		int y = ar.getY2();
		paper.draw(x, y);
		
		paper.draw(x-1, y);
		paper.draw(x+1, y);
		paper.draw(x, y-1);
		paper.draw(x, y+1);
		
		paper.draw(x-1, y-1);
		paper.draw(x-1, y+1);
		paper.draw(x+1, y-1);
		paper.draw(x+1, y+1);

		paper.draw(x-2, y);
		paper.draw(x+2, y);
		paper.draw(x, y-2);
		paper.draw(x, y+2);
	}
	
}
