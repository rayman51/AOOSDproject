package ie.gmit.sw;

import java.awt.image.BufferedImage;

/**
 * This class set the ground for the game. It sets the type of ground, its
 * position on the map and if the player can walk on the tile or not.
 * 
 * @author Ray
 *
 */
public class GroundBuilder {

	private Point position;
	private BufferedImage image;
	private boolean isWalkable;// variables for each tile
	private GroundType type;
	private int x;
	private int y;

	public GroundBuilder() {

	}

	public GroundBuilder setPosition(Point pos) {
		this.position = pos;
		return this;
	}

	public GroundBuilder setImage(BufferedImage image) {
		this.image = image;
		return this;
	}

	public GroundBuilder setWalkable(boolean isWalkable) {
		this.isWalkable = isWalkable; // tells us what tiles the player can walk on
		return this;
	}

	public GroundBuilder setType(GroundType type) {
		this.type = type;// set the type of ground tile using an enum of types
		return this;
	}

	public GroundBuilder setIndex(int x, int y) {
		this.x = x;
		this.y = y;// set the position of the object
		return this;
	}

	public GroundTile build() {

		if (this.image == null)
			this.image = this.type.getImg();

		this.isWalkable = this.type.isWalkable();

		return new GroundTile(position, x, y, image, isWalkable, type);// builds the ground tile
	}

}
