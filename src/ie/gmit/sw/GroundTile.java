package ie.gmit.sw;

import java.awt.image.BufferedImage;

/**
 * This sets the condition for any ground tile, its type and if is walkable. It
 * extends tile because all images are placed on tiles.
 * 
 * @author Ray
 *
 */
public class GroundTile extends Tile {

	private boolean walkable;// can the tile be walked on
	private GroundType type;// the type of ground

	public GroundTile() {
		super();
	}

	public GroundTile(Point p, int x, int y, BufferedImage i, boolean w, GroundType type) {
		super(p, i, x, y);
		this.walkable = w;
		this.type = type;
	}

	// getters and setters

	public boolean walkable() {
		return walkable;
	}

	public void setWalkable(boolean walkable) {
		this.walkable = walkable;
	}

	public GroundType getType() {
		return type;
	}

	public void setType(GroundType type) {
		this.type = type;
	}

}