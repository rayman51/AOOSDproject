package ie.gmit.sw;

import java.awt.image.BufferedImage;
import java.util.List;

/**
 * Used to build character sprites. To add more characters, they must be added
 * to the spritetype class, they may also be added to the sprite factory. Images
 * must also be added in resources.
 * 
 * @author Ray
 *
 */
public class SpriteBuilder {

	private Point position;
	private List<BufferedImage> images;
	private SpriteType type;// variables for sprites
	private int x;
	private int y;

	public SpriteBuilder() {

	}

	public SpriteBuilder setPosition(Point pos) {
		this.position = pos;
		return this;
	}

	public SpriteBuilder setImage(List<BufferedImage> images) {
		this.images = images;
		return this;
	}

	public SpriteBuilder setType(SpriteType type) {
		this.type = type;
		return this;
	}

	public SpriteBuilder setIndex(int x, int y) {
		this.x = x;
		this.y = y;
		return this;
	}

	public SpriteTile build() {

		if (this.images == null)
			this.images = this.type.getImg();

		// set ot enagegd by default

		return new SpriteTile(position, x, y, images, type);// build the character
	}

}
