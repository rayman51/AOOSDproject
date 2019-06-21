package ie.gmit.sw;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * This loads the game, it is called in the runner It load all resources from
 * the images in the resource folder
 * 
 * @author Ray
 *
 */
public class LoadGame {
	public static void loadResources() {

		ImageLoader g = new ImageLoaderImplements();
		Iterator<BufferedImage> itr = g.loadImages("./resources/images/ground");// load images for the ground
		EnumSet.allOf(GroundType.class).forEach(type -> (type).setImg(itr.next()));
		Iterator<BufferedImage> itr2 = g.loadImages("./resources/images/objects");// load images for the objects
		EnumSet.allOf(ItemType.class).forEach(type -> (type).setImg(itr2.next()));

		Iterator<BufferedImage> playerImages = g.loadImages("./resources/images/sprites/default");// adds image for the
																									// player
		List<BufferedImage> images = new ArrayList<>();
		playerImages.forEachRemaining(images::add);
		SpriteType.standard.setImg(images);

	}
}
