package ie.gmit.sw;

/**
 * 
 * This allows the player to move in 4 direction.
 * It can be used for any character sprite.
 * @author Ray
 */
public enum Direction {

	UP(0), DOWN(1), LEFT(2), RIGHT(3);

	private final int orientation;

	private Direction(int orientation) {
		this.orientation = orientation;
	}

	public int getOrientation() {
		return this.orientation;
	}
}