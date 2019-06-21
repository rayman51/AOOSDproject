package ie.gmit.sw;

import java.awt.image.BufferedImage;

/**
 * This class is used for the tile types, all sprites, ground and objects are
 * tiles
 * 
 * @author Ray
 *
 */
public class Tile {

	private Point position;
	private BufferedImage image;
	private int x;
	private int y;

	public Tile() {

	}

	public Tile(Point p, BufferedImage i, int x, int y) {
		this.position = p;
		this.image = i;
		this.x = x;
		this.y = y;
	}

	public Point getPos() {
		return position;
	}

	public BufferedImage getImage() {
		return image;
	}

	public void setPos(Point pos) {
		this.position = pos;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
