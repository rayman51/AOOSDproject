package ie.gmit.sw;

/**
 *
 * This is a factory which will tell which type of character to create, it only
 * uses one sprite now but other sprites can be added using the switch statement
 * and calling it in the spritebuilder.
 * 
 * @author Ray
 */
public class SpriteFactory {

	public enum Type {
		player, green, knight, person;
	}

	public static Tile create(Type type, int x, int y) {

		switch (type) {
		case player:

			return new SpriteBuilder().setType(SpriteType.standard).setIndex(x, y).build();

		default:
			throw new RuntimeException("No such character");
		}

	}
}