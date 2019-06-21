package ie.gmit.sw;

import java.awt.image.BufferedImage;

/**
 * This is used to build items objects, it also states if the object is
 * collectable or not. This can be any object that is not a character or a
 * ground tile
 * 
 * @author Ray
 *
 */
public class ItemBuilder {

	private Point position;
	private BufferedImage image;
	private boolean isCollectable;// variables for each item
	private ItemType type;
	private int x;
	private int y;

	public ItemBuilder() {

	}

	public ItemBuilder setPosition(Point pos) {
		this.position = pos;
		return this;
	}

	public ItemBuilder setCollectable(boolean isCollectable) {
		this.isCollectable = isCollectable;// if the item can be collected
		return this;
	}

	public ItemBuilder setType(ItemType type) {
		this.type = type;// sets type of item
		return this;
	}

	public ItemBuilder setIndex(int x, int y) {
		this.x = x;
		this.y = y;// set the position of item on grid
		return this;
	}

	public ItemTile build() {

		if (this.image == null)
			this.image = this.type.getImg();

		this.isCollectable = this.type.isCollectable();

		return new ItemTile(position, x, y, image, isCollectable, type);// builds the item tile using image
	}

}
