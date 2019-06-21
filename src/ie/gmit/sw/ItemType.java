package ie.gmit.sw;

import java.awt.image.BufferedImage;

/**
 *
 * This enum is used to identify each type of item available in the game to add
 * more item, you only need to add here and add the images to resources, true
 * allows the item to be collectable
 * 
 * @author Ray
 */
public enum ItemType {
	blank(null, false), fountain(null, false), signPost(null, false), chest(null, true), log(null, false),
	tree(null, false), plant(null, false), chair(null, false), cover(null, false), ladder(null, false),
	fire(null, false), coins(null, true);// correspond to images in resource file

	private BufferedImage img;
	private final boolean isCollectable;

	private ItemType(BufferedImage img, boolean collectable) {
		this.img = img;
		this.isCollectable = collectable;
	}

	public void setImg(BufferedImage img) {
		this.img = img;
	}

	public BufferedImage getImg() {
		return img;
	}

	public boolean isCollectable() {
		return isCollectable;
	}

}
