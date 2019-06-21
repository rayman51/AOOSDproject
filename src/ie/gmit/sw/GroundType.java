package ie.gmit.sw;

import java.awt.image.BufferedImage;

/**
 *
 * These are the type of ground tiles available when loaded, they store an image
 * for each type. They also tells if the type of ground can be walked on
 * 
 * @author Ray
 */

public enum GroundType {

	grass(null, true), rocks(null, true), weeds(null, true), sand(null, true), water(null, false), shore(null, false),
	muck(null, true), gravel(null, true);// images in resource file

	private BufferedImage img;// an image for the tile
	private final boolean isWalkable;// if the tile can be walked on

	private GroundType(BufferedImage img, boolean isWalkable) {
		this.isWalkable = isWalkable;
		this.img = img;
	}

	public void setImg(BufferedImage img) {
		this.img = img;
	}

	public BufferedImage getImg() {
		return img;
	}

	public boolean isWalkable() {
		return isWalkable;
	}

}
