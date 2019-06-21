package ie.gmit.sw;

import java.awt.image.BufferedImage;
import java.util.List;

/**
 * This class set the direction of the object on start of the program. It change
 * the image used depending on what direction the the sprite is moved
 * 
 * @author Ray
 *
 */
public class SpriteTile extends Tile {

	private Direction direction = Direction.DOWN;// the direction the character is facing
	private SpriteType type;// the type of character
	private List<BufferedImage> images;// list of images movement
	private int index = 3;// index for positioning
	private int dirIndex = 3;
	private boolean canMove;// can the object move

	public SpriteTile() {
		super();
	}

	public SpriteTile(Point p, int x, int y, List<BufferedImage> images, SpriteType t) {
		super(p, images.get(3), x, y);
		this.type = t;
	}

	public SpriteType getType() {
		return type;
	}

	public void setType(SpriteType type) {
		this.type = type;
	}

	public Direction getDirection() {
		return this.direction;
	}

	public void setDirection(Direction d) {
		direction = d;

		switch (direction.getOrientation()) {// used to change the orientation of the sprite as it moves
		case 1:// down

			if (index > 3 && index < 6) {
				return;
			}
			changeImage(3);// changes the image as the character moves
			break;
		case 2:// left

			if (index > 6 && index < 9) {
				return;
			}
			changeImage(6);
			break;
		case 3:// right

			if (index > 9 && index < 11) {
				return;
			}
			changeImage(9);
			break;
		default:// up
			if (index > 0 && index < 3) {
				return;
			}
			changeImage(0);

			break;
		}

	}

	public BufferedImage step() {

		index++;

		if (index == dirIndex + 3) {
			index = dirIndex;
		}

		BufferedImage image = type.getImg().get(index);
		this.setImage(image);

		return image;
	}

	public BufferedImage getImage(int i) {
		return images.get(i);
	}

	public void setImage(List<BufferedImage> images) {
		this.images = images;
	}

	private void changeImage(int i) {
		index = i;
		dirIndex = index;
		this.setImage(type.getImg().get(index));
	}

	public boolean moveable() {

		return canMove;
	}

}