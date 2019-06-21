package ie.gmit.sw;

import java.util.ArrayList;

/**
 * 
 * This is used to access methods for creating the grids It can also be used to
 * set and retrieve info from the grid
 * 
 * @author Ray
 *
 */
public interface Grid {

	ArrayList<Tile> getTiles();

	void setTiles(ArrayList<Tile> t);

	void addTile(Tile t);

	Point[][] getPositions();

	void setPositions(Point[][] p);

	Point position(int down, int across);

	boolean ocupied(int a, int b);

	int[] getIndex(Point p);

	GroundTile getGroundTile(int a, int b);

	ItemTile getItemTile(int a, int b);

}
