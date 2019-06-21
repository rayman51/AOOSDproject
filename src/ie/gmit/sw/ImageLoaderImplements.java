package ie.gmit.sw;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 * Class used to load images from a given directory and return them as an
 * iterated list
 * 
 * @author Ray
 *
 */
public class ImageLoaderImplements implements ImageLoader {

	public Iterator<BufferedImage> loadImages(String directory) {

		File dir = new File(directory);// directory to where the files are
		File[] files = dir.listFiles();// list of all files
		List<BufferedImage> images = new ArrayList<>();// list of images

		for (File f : files) {

			try {
				BufferedImage img = ImageIO.read(f);// read in the file as an image
				images.add(img);// adds image to list

			} catch (IOException e) {
				JOptionPane.showMessageDialog(null, "Images failed to load", "Error", JOptionPane.ERROR_MESSAGE);

			}

		}
		return images.iterator();// return the images
	}

}
