package ie.gmit.sw;

import java.awt.image.BufferedImage;
import java.util.Iterator;

/**
 * 
 * Used for loading images, follows the path to the resources folder using the
 * string directory
 * 
 * @author Ray
 */
public interface ImageLoader {

	public Iterator<BufferedImage> loadImages(String directory);

}
