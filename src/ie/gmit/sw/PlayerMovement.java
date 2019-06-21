package ie.gmit.sw;

/**
 * 
 * This class determines if there is an item on the tile in front of the player,
 * if the player can walk on the tile and if the object in the tile can be
 * collected
 * 
 * @author Ray
 */
public class PlayerMovement {

	public static void move(Point pos, SpriteTile sprite, Grid grid1, Grid grid2, GameView gameView) {

		int[] index = grid2.getIndex(pos);// gets the position
		ItemTile itemThere = grid2.getItemTile(index[0], index[1]);// checks if there is an item on the tile

		if (!grid1.getGroundTile(index[0], index[1]).walkable() || itemThere != null) {// determines if tile can be
																						// walked on, by ground type

			if (itemThere.isCollectable()) {// collects item

				grid2.getTiles().remove(itemThere);// removes item

				gameView.setCoinsLeft(-1);// decreases coins by 1
			}

			return;
		}

		sprite.step();
		sprite.setPos(pos);
		sprite.setX(index[0]);// lets the player move
		sprite.setY(index[1]);

	}

}
