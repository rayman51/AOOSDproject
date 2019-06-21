package ie.gmit.sw;

import java.awt.image.BufferedImage;

/**
 * This is for item tiles objects, used for anything that is not a character or
 * ground. It extends tile because all images are placed on tiles.
 * 
 * @author Ray
 *
 */
public class ItemTile extends Tile {

	private boolean isCollectable;// variables for tile
	private ItemType type;

	public ItemTile() {
		super();
	}

	public ItemTile(Point p, int x, int y, BufferedImage i, Boolean c, ItemType type) {
		super(p, i, x, y);
		this.isCollectable = c;
		this.type = type;
	}

	public boolean isCollectable() {
		return isCollectable;
	}

	public void setCollectable(boolean isCollectable) {
		this.isCollectable = isCollectable;
	}

	public ItemType getType() {
		return type;
	}

	public void setType(ItemType type) {
		this.type = type;
	}

}