package ie.gmit.sw;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.Timer;

/**
 * This sets up 2 grid to be painted, one grid for the ground, and the second
 * for the objects and player sprites. It also set up the player movement using
 * the arrow keys. The class calls what tile and it position on the ground grid
 * and paints it, it then calls in the object and player images and their
 * positions and paint them in a second grid. it also set up the win condition
 * and game over settings.
 * 
 * @author Ray
 *
 */
public class GameView extends JPanel implements ActionListener, KeyListener {

	private static final long serialVersionUID = 777L;

	private boolean gameOver = false;
	private Timer timer; // timer for repainting the panel
	private Grid grid1; // grid for ground
	private Grid grid2; // grid for object
	private int coinsLeft = 4; // the number of coin/treasure to be collected
	private static SpriteTile player; // type of sprite to play/ only one in enum but more can be added

	public GameView() {

		setBackground(Color.WHITE);
		setDoubleBuffered(true);

		JOptionPane.showMessageDialog(null, "Control the player using Arrow keys\nCollect 4 chests ", "Treasure Hunt",
				JOptionPane.DEFAULT_OPTION); // message that tells the user the controls and aim of game

		timer = new Timer(100, this);// set the timer to a 1/10 of a second
		timer.start();// start the timer

	}

	public void actionPerformed(ActionEvent e) {

		if (coinsLeft == 0) // condition for game to end
			gameOver = true;

		if (gameOver) {// when game is over message to screen
			JOptionPane.showMessageDialog(null, "Well Done", "Game Over", JOptionPane.DEFAULT_OPTION);

			System.exit(0); // exit the game
		}
		this.repaint();
	}

	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;// set our graphics to 2D
		paint(g2, grid1);// Paints ground grid
		paint(g2, grid2);// Paints objects grid

	}

	public void paint(Graphics2D g2, Grid grid) {

		for (Tile t : grid.getTiles()) {// runs through the tiles

			g2.drawImage(t.getImage(), t.getPos().getX(), t.getPos().getY(), null);// Draws the tile using the tile
																					// image and position in the grid
		}
	}

	public Grid getGrid1() {
		return grid1;
	}

	public void setGrid1(Grid g1) {
		this.grid1 = g1;
	}

	public Grid getGrid2() {
		return grid2;
	}

	public void setGrid2(Grid g2) {
		this.grid2 = g2;
	}

	public SpriteTile getPlayer() {
		return player;
	}

	public void setPlayer(SpriteTile p) {

		p.setDirection(Direction.DOWN);
		player = p;
	}

	public boolean isGameOver() {
		return gameOver;
	}

	public void setGameOver(boolean gameOver) {
		this.gameOver = gameOver;
	}

	public int getCoinsLeft() {
		return coinsLeft;
	}

	public void setCoinsLeft(int coinsLeft) {
		this.coinsLeft += coinsLeft;// removes coins as collected
	}

	@Override
	public void keyPressed(KeyEvent e) {
		//
		try {
			if (e.getKeyCode() == KeyEvent.VK_RIGHT) { // right Arrow
				player.setDirection(Direction.RIGHT); // move player to the right
				PlayerMovement.move(grid2.getPositions()[player.getX()][player.getY() + 1], player, grid1, grid2, this);
			} else if (e.getKeyCode() == KeyEvent.VK_LEFT) { // left arrow
				player.setDirection(Direction.LEFT); // move player to the left
				PlayerMovement.move(grid2.getPositions()[player.getX()][player.getY() - 1], player, grid1, grid2, this);
			} else if (e.getKeyCode() == KeyEvent.VK_UP) {// up arrow
				player.setDirection(Direction.UP); // move the player up
				PlayerMovement.move(grid2.getPositions()[player.getX() - 1][player.getY()], player, grid1, grid2, this);
			} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {// down arrow
				player.setDirection(Direction.DOWN); // move player down
				PlayerMovement.move(grid2.getPositions()[player.getX() + 1][player.getY()], player, grid1, grid2, this);
			} else {
				return;
			}
		} catch (Exception ex) {

		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

}