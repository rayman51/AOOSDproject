package ie.gmit.sw;

import java.awt.image.BufferedImage;

/*
 * this enum is used to identify the type of character created
 * adding more types here will make them available in the game
 * */
import java.util.List;

/**
 * 
 * 
 * This enum is used to identify each type of character available in the game to
 * add more character, you only need to add the type here and in the factory and
 * add the images to resources.
 * 
 * @author Ray
 *
 */
public enum SpriteType {

	standard, green, knight, person;

	private List<BufferedImage> img;

	SpriteType() {

	}

	private SpriteType(List<BufferedImage> img) {
		this.img = img;
	}

	public void setImg(List<BufferedImage> images) {
		this.img = images;
	}

	public List<BufferedImage> getImg() {
		return img;
	}

}
