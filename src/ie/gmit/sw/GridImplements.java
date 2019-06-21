package ie.gmit.sw;

import java.util.ArrayList;

import ie.gmit.sw.Point;

/**
 * This class creates an array of grid position and tells us if the tile is or
 * not. It then retrieves a ground or object tile and for each position on the
 * grid
 * 
 * @author Ray
 *
 */
public class GridImplements implements Grid {

	private static int DEFAULT_SIZE;// sets the default size of the grid
	private int offset;
	private int TILE_HEIGHT;// the height of individual tiles
	private int TILE_WIDTH;// the width of tiles
	private Point positions[][];// array of positions available in the grid
	private ArrayList<Tile> tiles = new ArrayList<>();// list of tiles used in the grid
	private Point pos = new Point(DEFAULT_SIZE / 2, 0);

	public GridImplements(int size, int down, int across, int tileH, int tileW, int offset) {

		positions = new Point[down][across];// set the array size
		DEFAULT_SIZE = size;
		TILE_HEIGHT = tileH;
		TILE_WIDTH = tileW;
		this.offset = offset;
		createStartingPositions(down, across);

	}

	private void createStartingPositions(int down, int across) {

		for (int i = 0; i < down; i++) {

			offsetPositions(i, this.offset);// creates starting positions

			for (int j = 0; j < across; j++) {
				this.positions[i][j] = new Point(this.pos.getX(), this.pos.getY());
				nextPosition();
			}
		}
	}

	public Point position(int down, int across) {
		return positions[down][across];// get a specific position
	}

	public void offsetPositions(int i, int offset) {
		pos.setX(((DEFAULT_SIZE - TILE_WIDTH) / 2) - (TILE_WIDTH / 2) * i + offset);
		pos.setY((TILE_HEIGHT * i) / 2 - offset);
	}

	public void nextPosition() {
		pos.setX(pos.getX() + TILE_WIDTH / 2);// set the next position in the array
		pos.setY(pos.getY() + TILE_HEIGHT / 2);
	}

	public ArrayList<Tile> getTiles() {
		return tiles;// calls tiles used in grid
	}

	public void setTiles(ArrayList<Tile> t) {
		tiles = t;// sets the list of tiles
	}

	public void addTile(Tile t) {
		tiles.add(t);// adds each tile to the list
	}

	public boolean ocupied(int a, int b) {
		return tiles.stream().filter(o -> o.getPos().equals(positions[a][b])).findFirst().isPresent();// tells if a tile
																										// is occupied
	}

	public GroundTile getGroundTile(int a, int b) {

		return (GroundTile) tiles.stream().filter(o -> o.getPos().equals(positions[a][b])).findFirst().get();// retrieves
																												// a
																												// ground
																												// tile
	}

	public ItemTile getItemTile(int a, int b) {

		if (tiles.stream().filter(o -> o.getPos().equals(positions[a][b])).findFirst().isPresent()) {

			return (ItemTile) tiles.stream().filter(o -> o.getPos().equals(positions[a][b])).findFirst().get();// retrieves
																												// an
																												// item
																												// tile

		}

		return null;
	}

	public Point[][] getPositions() {
		return this.positions;
	}

	public void setPositions(Point[][] p) {
		this.positions = p;
	}

	public int[] getIndex(Point p) {

		int[] index = { 0, 0 };

		for (int i = 0; i < positions.length; i++) {

			index[0] = i;

			for (int j = 0; j < positions[0].length; j++) {

				index[1] = j;

				if (p.getX() == positions[i][j].getX() && p.getY() == positions[i][j].getY()) {
					return index;
				}
			}

		}

		return index;
	}
}
