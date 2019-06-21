package ie.gmit.sw;

import java.awt.*;
import javax.swing.*;

/**
 *
 * This class creates the game panel. It sets the size, position and layout of
 * the grid, which is 10x10. It also sets the size of each tile on the grid. It
 * then renders the panel and paint the grids
 * 
 * @author Ray
 */
public class GameWindow {

	private static GameWindow window_instance = null;

	private static final int DEFAULT_SIZE = 1280;// sets size of the scene
	private static final int VERTCIALCELLS = 10;// sets the number of tiles across and down
	private static final int HORIZONTINALCELLS = 10;
	private static final int TILEHEIGHT = 128;// sets the width and height of each tile
	private static final int TILEWIDTH = 64;

	private Grid grid1 = new GridImplements(DEFAULT_SIZE, VERTCIALCELLS, HORIZONTINALCELLS, TILEWIDTH, TILEHEIGHT, 0);// ground
																														// grid
	private Grid grid2 = new GridImplements(DEFAULT_SIZE, VERTCIALCELLS, HORIZONTINALCELLS, TILEWIDTH, TILEHEIGHT, 10);// object
																														// grid

	private GameView view;

	public GameWindow() {

		try {

			view = new GameView();

			view.setGrid1(grid1);
			view.setGrid2(grid2);// sets up the grids for the game

			Dimension d = new Dimension(DEFAULT_SIZE, DEFAULT_SIZE / 2);// sets the panel dimensions
			view.setPreferredSize(d);
			view.setMinimumSize(d);// sets the size of the panel
			view.setMaximumSize(d);
			JFrame f = new JFrame("GMIT - B.Sc. in Computing (Software Development)");// creates the frame
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// set the default action if window closed, to end the
																// frame
			f.getContentPane().setLayout(new FlowLayout());// set the layout for frame
			f.add(view);// adds the game panel to the frame
			f.addKeyListener(view);// adds a listener to the game view
			f.setSize(1000, 1000);// sets the size of the frame
			f.setLocation(100, 100);// sets the location of the window
			f.pack();
			f.setVisible(true);// make the frame visible on screen

			OriginalGrid.addGroundTiles(VERTCIALCELLS, HORIZONTINALCELLS, grid1);// adds ground to grid 1
			OriginalGrid.addObjects(VERTCIALCELLS, HORIZONTINALCELLS, grid2);// adds objects to grid 2
			view.setPlayer(OriginalGrid.addPlayer(VERTCIALCELLS, HORIZONTINALCELLS, grid2));// adds the player to grid 2

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static GameWindow getInstance() {
		if (window_instance == null)
			window_instance = new GameWindow();// creates a singleton/ once instance of the game running

		return window_instance;
	}

}