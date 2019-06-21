package ie.gmit.sw;

/**
 * Creates a position for an object, ground or sprite to be placed. Without a
 * position for the tile nothing can be painted
 * 
 * @author Ray
 *
 */
public class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}