package ie.gmit.sw;

/**
 * Runner class is like the key in the ignition. Program can not start without a
 * main method. Loads the images and starts an instance of the game.
 * 
 * @author Ray
 *
 */
public class Runner {

	public static void main(String[] args) throws Exception {

		javax.swing.SwingUtilities.invokeLater(new Runnable() {

			public void run() {

				try {

					LoadGame.loadResources();// loads the images

					GameWindow.getInstance();// calls an instance of the gamewindow

				} catch (Exception e) {

					e.printStackTrace();
				}

			}
		});
	}

}