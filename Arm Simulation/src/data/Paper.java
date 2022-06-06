package data;

/**
 * This class contains information about the paper we are drawing on
 * Especially contains a 2D-Array telling which pixels are drawn
 *  
 * @author Léo COQUET
 *
 */
public class Paper {

	private final static int LENGTH = 1000;
	private final static int HEIGHT = 1000;
	private boolean paper[][];
	
	public Paper() {
		this.paper = new boolean[LENGTH][HEIGHT];
	}

	/**
	 * Paper's array getter
	 * @return Paper's array
	 */
	public boolean[][] getPaper() {
		return paper;
	}

	/**
	 * Paper's array setter
	 * @param paper New paper's array
	 */
	public void setPaper(boolean[][] paper) {
		this.paper = paper;
	}

	/**
	 * Length getter
	 * @return Length
	 */
	public static int getLength() {
		return LENGTH;
	}

	/**
	 * Height getter
	 * @return Height
	 */
	public static int getHeight() {
		return HEIGHT;
	}

	public void draw(int x, int y) {
		if(x <= Paper.getHeight() - 1 && y <= Paper.getLength() - 1 && x >= 0 && y >= 0)
			paper[x][y] = true;
	}

	public boolean getPixel(int x, int y) {
		return paper[x][y];
	}
	
}
