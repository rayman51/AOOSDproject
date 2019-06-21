package ie.gmit.sw;

import ie.gmit.sw.SpriteFactory.Type;

/**
 * 
 * This class is used to load the tiles we need for playing the game. It matches
 * the tile positions in the original demo provided. The ground and objects can
 * be moved by placing the tiles in different positions on the 10 x 10 grid
 * 
 * @author Ray
 */
public class OriginalGrid {

	private static int VERTCIALCELLS;
	private static int HORIZONTINALCELLS;

	private static GroundBuilder rockBuilder = new GroundBuilder();
	private static GroundBuilder weedBuilder = new GroundBuilder();
	private static GroundBuilder sandBuilder = new GroundBuilder();
	private static GroundBuilder waterBuilder = new GroundBuilder();// builds the ground
	private static GroundBuilder shoreBuilder = new GroundBuilder();
	private static GroundBuilder muckBuilder = new GroundBuilder();
	private static GroundBuilder gravelBuilder = new GroundBuilder();

	private static ItemBuilder treeBuilder = new ItemBuilder();
	private static ItemBuilder signBuilder = new ItemBuilder();
	private static ItemBuilder ladderBuilder = new ItemBuilder();
	private static ItemBuilder chestBuilder = new ItemBuilder();// adds the items
	// private static ItemBuilder coinBuilder = new ItemBuilder();
	private static ItemBuilder logBuilder = new ItemBuilder();

	private static Tile tile = null;

	public static void addGroundTiles(int v, int h, Grid grid) {

		HORIZONTINALCELLS = h;
		VERTCIALCELLS = v;

		rocks(grid);
		weeds(grid);
		sand(grid);
		water(grid);
		shore(grid);// set the different ground tiles
		muck(grid);
		gravel(grid);
		grass(grid);

	}

	public static void addObjects(int v, int h, Grid grid) {
		HORIZONTINALCELLS = h;
		VERTCIALCELLS = v;

		addTrees(grid);
		addLadder(grid);
		addSigns(grid);
		addChests(grid);
		addLog(grid);
		// addGold(grid);

	}

	// ===================================================================
	// methods to build the ground tiles on grid 1
	private static void gravel(Grid grid1) {
		// adds gravel at set positions
		tile = gravelBuilder.setType(GroundType.gravel).setPosition(grid1.position(9, 7)).setIndex(9, 7).build();
		grid1.addTile(tile);
		tile = gravelBuilder.setType(GroundType.gravel).setPosition(grid1.position(9, 8)).setIndex(9, 8).build();
		grid1.addTile(tile);
		tile = gravelBuilder.setType(GroundType.gravel).setPosition(grid1.position(9, 9)).setIndex(9, 9).build();
		grid1.addTile(tile);
	}

	// ===================================================================
	private static void muck(Grid grid1) {
		// adds muck at set positions
		tile = muckBuilder.setType(GroundType.muck).setPosition(grid1.position(8, 7)).setIndex(8, 7).build();
		grid1.addTile(tile);
		tile = muckBuilder.setType(GroundType.muck).setPosition(grid1.position(8, 8)).setIndex(8, 8).build();
		grid1.addTile(tile);
		tile = muckBuilder.setType(GroundType.muck).setPosition(grid1.position(8, 9)).setIndex(8, 9).build();
		grid1.addTile(tile);
	}

	// ===================================================================
	private static void shore(Grid grid1) {
		// adds shore at set positions
		tile = shoreBuilder.setType(GroundType.shore).setPosition(grid1.position(6, 0)).setIndex(6, 0).build();
		grid1.addTile(tile);
		tile = shoreBuilder.setType(GroundType.shore).setPosition(grid1.position(6, 1)).setIndex(6, 1).build();
		grid1.addTile(tile);
		tile = shoreBuilder.setType(GroundType.shore).setPosition(grid1.position(6, 2)).setIndex(6, 2).build();
		grid1.addTile(tile);
		tile = shoreBuilder.setType(GroundType.shore).setPosition(grid1.position(6, 3)).setIndex(6, 3).build();
		grid1.addTile(tile);
		tile = shoreBuilder.setType(GroundType.shore).setPosition(grid1.position(7, 3)).setIndex(7, 3).build();
		grid1.addTile(tile);
		tile = shoreBuilder.setType(GroundType.shore).setPosition(grid1.position(8, 4)).setIndex(8, 4).build();
		grid1.addTile(tile);
	}

	// ===================================================================
	private static void water(Grid grid1) {
		// adds water at set positions
		tile = waterBuilder.setType(GroundType.water).setPosition(grid1.position(9, 4)).setIndex(9, 4).build();
		grid1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPosition(grid1.position(9, 3)).setIndex(9, 3).build();
		grid1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPosition(grid1.position(9, 2)).setIndex(9, 2).build();
		grid1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPosition(grid1.position(9, 1)).setIndex(9, 1).build();
		grid1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPosition(grid1.position(9, 0)).setIndex(9, 0).build();
		grid1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPosition(grid1.position(8, 3)).setIndex(8, 3).build();
		grid1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPosition(grid1.position(8, 2)).setIndex(8, 2).build();
		grid1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPosition(grid1.position(8, 1)).setIndex(8, 1).build();
		grid1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPosition(grid1.position(8, 0)).setIndex(8, 0).build();
		grid1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPosition(grid1.position(7, 2)).setIndex(7, 2).build();
		grid1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPosition(grid1.position(7, 1)).setIndex(7, 1).build();
		grid1.addTile(tile);
		tile = waterBuilder.setType(GroundType.water).setPosition(grid1.position(7, 0)).setIndex(7, 0).build();
		grid1.addTile(tile);
	}

	// ===================================================================
	private static void sand(Grid grid1) {
		// adds sand at set positions
		tile = sandBuilder.setType(GroundType.sand).setPosition(grid1.position(6, 4)).setIndex(6, 4).build();
		grid1.addTile(tile);
		tile = sandBuilder.setType(GroundType.sand).setPosition(grid1.position(7, 4)).setIndex(7, 4).build();
		grid1.addTile(tile);
		tile = sandBuilder.setType(GroundType.sand).setPosition(grid1.position(6, 5)).setIndex(8, 4).build();
		grid1.addTile(tile);
		tile = sandBuilder.setType(GroundType.sand).setPosition(grid1.position(7, 5)).setIndex(7, 5).build();
		grid1.addTile(tile);
		tile = sandBuilder.setType(GroundType.sand).setPosition(grid1.position(8, 5)).setIndex(8, 5).build();
		grid1.addTile(tile);
		tile = sandBuilder.setType(GroundType.sand).setPosition(grid1.position(9, 5)).setIndex(9, 5).build();
		grid1.addTile(tile);
		tile = sandBuilder.setType(GroundType.weeds).setPosition(grid1.position(5, 0)).setIndex(5, 0).build();
		grid1.addTile(tile);
		tile = sandBuilder.setType(GroundType.weeds).setPosition(grid1.position(5, 1)).setIndex(5, 1).build();
		grid1.addTile(tile);
		tile = sandBuilder.setType(GroundType.weeds).setPosition(grid1.position(5, 2)).setIndex(5, 2).build();
		grid1.addTile(tile);
		tile = sandBuilder.setType(GroundType.weeds).setPosition(grid1.position(5, 3)).setIndex(5, 3).build();
		grid1.addTile(tile);
	}

	// ===================================================================
	private static void weeds(Grid grid1) {
		// adds weeds at set positions
		tile = weedBuilder.setType(GroundType.weeds).setPosition(grid1.position(2, 2)).setIndex(2, 2).build();
		grid1.addTile(tile);
		tile = weedBuilder.setType(GroundType.weeds).setPosition(grid1.position(4, 0)).setIndex(4, 0).build();
		grid1.addTile(tile);
		tile = weedBuilder.setType(GroundType.weeds).setPosition(grid1.position(4, 1)).setIndex(4, 1).build();
		grid1.addTile(tile);
		tile = weedBuilder.setType(GroundType.weeds).setPosition(grid1.position(4, 2)).setIndex(4, 2).build();
		grid1.addTile(tile);
		tile = weedBuilder.setType(GroundType.weeds).setPosition(grid1.position(4, 3)).setIndex(4, 3).build();
		grid1.addTile(tile);
		tile = weedBuilder.setType(GroundType.weeds).setPosition(grid1.position(0, 9)).setIndex(0, 9).build();
		grid1.addTile(tile);
		tile = weedBuilder.setType(GroundType.weeds).setPosition(grid1.position(1, 9)).setIndex(1, 9).build();
		grid1.addTile(tile);
		tile = weedBuilder.setType(GroundType.weeds).setPosition(grid1.position(2, 9)).setIndex(2, 9).build();
		grid1.addTile(tile);
		tile = weedBuilder.setType(GroundType.weeds).setPosition(grid1.position(3, 9)).setIndex(3, 9).build();
		grid1.addTile(tile);
		tile = weedBuilder.setType(GroundType.weeds).setPosition(grid1.position(4, 9)).setIndex(4, 9).build();
		grid1.addTile(tile);
	}

	// ===================================================================
	private static void rocks(Grid grid1) {
		// adds rocks at set positions
		tile = rockBuilder.setType(GroundType.rocks).setPosition(grid1.position(0, 0)).setIndex(0, 0).build();
		grid1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPosition(grid1.position(1, 1)).setIndex(1, 1).build();
		grid1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPosition(grid1.position(3, 3)).setIndex(3, 3).build();
		grid1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPosition(grid1.position(4, 4)).setIndex(4, 4).build();
		grid1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPosition(grid1.position(5, 5)).setIndex(5, 5).build();
		grid1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPosition(grid1.position(5, 4)).setIndex(5, 4).build();
		grid1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPosition(grid1.position(5, 6)).setIndex(5, 6).build();
		grid1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPosition(grid1.position(6, 6)).setIndex(6, 6).build();
		grid1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPosition(grid1.position(7, 6)).setIndex(7, 6).build();
		grid1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPosition(grid1.position(8, 6)).setIndex(8, 6).build();
		grid1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPosition(grid1.position(9, 6)).setIndex(9, 6).build();
		grid1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPosition(grid1.position(5, 9)).setIndex(5, 9).build();
		grid1.addTile(tile);
		tile = rockBuilder.setType(GroundType.rocks).setPosition(grid1.position(6, 9)).setIndex(6, 9).build();
		grid1.addTile(tile);
	}

	// ===================================================================
	// fills the remaining tiles with grass
	private static void grass(Grid grid1) {

		GroundBuilder tBuilder = new GroundBuilder();
		GroundTile tile;

		for (int i = 0; i < VERTCIALCELLS; i++) {

			for (int j = 0; j < HORIZONTINALCELLS; j++) {

				if (!grid1.ocupied(i, j)) {
					tile = tBuilder.setType(GroundType.grass).setPosition(grid1.position(i, j)).setIndex(i, j).build();
					grid1.addTile(tile);
				}
			}
		}
	}

	// ==============================================================
	// methods to build the object tiles on grid 2
	private static void addLog(Grid grid2) {
		// adds logs at set positions
		tile = logBuilder.setType(ItemType.log).setPosition(grid2.position(3, 4)).setIndex(3, 4).build();
		grid2.addTile(tile);
		tile = logBuilder.setType(ItemType.log).setPosition(grid2.position(8, 7)).setIndex(8, 7).build();
		grid2.addTile(tile);

	}

	// ===================================================================
	/*
	 * private static void addGold(Grid g2) { // TODO Auto-generated method stub
	 * 
	 * }
	 */
	// ===================================================================
	private static void addChests(Grid grid2) {
		// adds trees at set positions
		tile = chestBuilder.setType(ItemType.chest).setPosition(grid2.position(4, 3)).setIndex(4, 3).build();
		grid2.addTile(tile);
		tile = chestBuilder.setType(ItemType.chest).setPosition(grid2.position(4, 9)).setIndex(4, 9).build();
		grid2.addTile(tile);
		tile = chestBuilder.setType(ItemType.chest).setPosition(grid2.position(9, 7)).setIndex(9, 7).build();
		grid2.addTile(tile);
		tile = chestBuilder.setType(ItemType.chest).setPosition(grid2.position(5, 0)).setIndex(5, 0).build();
		grid2.addTile(tile);

	}

	// ===================================================================
	private static void addSigns(Grid grid2) {
		// adds the sign post
		tile = signBuilder.setType(ItemType.signPost).setPosition(grid2.position(3, 2)).setIndex(3, 2).build();
		grid2.addTile(tile);
	}

	// ===================================================================
	private static void addLadder(Grid g2) {
		// adds the ladder
		tile = ladderBuilder.setType(ItemType.ladder).setPosition(g2.position(2, 9)).setIndex(2, 9).build();
		g2.addTile(tile);
	}

	// ===================================================================
	private static void addTrees(Grid grid2) {
		// adds trees at set positions
		tile = treeBuilder.setType(ItemType.tree).setPosition(grid2.position(1, 0)).setIndex(1, 0).build();
		grid2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPosition(grid2.position(2, 0)).setIndex(2, 0).build();
		grid2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPosition(grid2.position(3, 0)).setIndex(3, 0).build();
		grid2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPosition(grid2.position(2, 1)).setIndex(2, 1).build();
		grid2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPosition(grid2.position(3, 1)).setIndex(3, 1).build();
		grid2.addTile(tile);

		tile = treeBuilder.setType(ItemType.tree).setPosition(grid2.position(0, 3)).setIndex(0, 3).build();
		grid2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPosition(grid2.position(0, 4)).setIndex(0, 4).build();
		grid2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPosition(grid2.position(0, 5)).setIndex(0, 5).build();
		grid2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPosition(grid2.position(0, 6)).setIndex(0, 6).build();
		grid2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPosition(grid2.position(0, 7)).setIndex(0, 7).build();
		grid2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPosition(grid2.position(0, 8)).setIndex(0, 8).build();
		grid2.addTile(tile);

		tile = treeBuilder.setType(ItemType.tree).setPosition(grid2.position(1, 4)).setIndex(1, 4).build();
		grid2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPosition(grid2.position(1, 5)).setIndex(1, 5).build();
		grid2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPosition(grid2.position(1, 6)).setIndex(1, 6).build();
		grid2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPosition(grid2.position(1, 7)).setIndex(1, 7).build();
		grid2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPosition(grid2.position(1, 8)).setIndex(1, 8).build();
		grid2.addTile(tile);

		tile = treeBuilder.setType(ItemType.tree).setPosition(grid2.position(2, 5)).setIndex(2, 5).build();
		grid2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPosition(grid2.position(2, 6)).setIndex(2, 6).build();
		grid2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPosition(grid2.position(2, 7)).setIndex(2, 7).build();
		grid2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPosition(grid2.position(2, 8)).setIndex(2, 8).build();
		grid2.addTile(tile);

		tile = treeBuilder.setType(ItemType.tree).setPosition(grid2.position(3, 6)).setIndex(3, 6).build();
		grid2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPosition(grid2.position(3, 7)).setIndex(3, 7).build();
		grid2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPosition(grid2.position(3, 8)).setIndex(3, 8).build();
		grid2.addTile(tile);

		tile = treeBuilder.setType(ItemType.tree).setPosition(grid2.position(4, 7)).setIndex(4, 7).build();
		grid2.addTile(tile);
		tile = treeBuilder.setType(ItemType.tree).setPosition(grid2.position(4, 8)).setIndex(4, 8).build();
		grid2.addTile(tile);

		tile = treeBuilder.setType(ItemType.tree).setPosition(grid2.position(5, 8)).setIndex(5, 8).build();
		grid2.addTile(tile);

	}

	// ===================================================================
	// methods to add the player on grid 2
	public static SpriteTile addPlayer(int v, int h, Grid g) {
		HORIZONTINALCELLS = h;
		VERTCIALCELLS = v;
		// sets player position to 0,0 on grid
		Tile player = SpriteFactory.create(Type.player, 0, 0);
		player.setPos(g.position(0, 0));
		g.addTile(player);

		return (SpriteTile) player;
	}

}
