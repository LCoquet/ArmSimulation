package process;

import data.Paper;

public class PaperBuilder {

	public static Paper build() {
		int height = Paper.getHeight();
		int length = Paper.getLength();
		boolean[][] array = new boolean[height][length];
		for(int i = 0; i < height; i ++)
			for(int j = 0; j < length; j ++)
				array[i][j] = false;
		
		Paper paper = new Paper();
		paper.setPaper(array);
		return paper;
	}
	
}
