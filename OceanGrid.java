public class OceanGrid {
  private Creature[][] grid;

  public OceanGrid (int x, int y, int numPrey) {
    grid = new Creature[x][y];
    initGrid();
    if ((x * y) < numPrey - 1) {
      fillGrid();
    } else {

    }
  }

  public void initGrid() {
    for (int i = 0; i < grid.length; ++i) {
      for (int j = 0; j < grid[0].length; ++j) {
        grid[i][j] = new Creature();
      }
    }
  };

  public void fillGrid () {
    for (int i = 0; i < grid.length; ++i) {
      for (int j = 0; j < grid[0].length; ++j) {
        grid[i][j] = new Prey();
      }
    }
    grid[0][0] = new Predator();
  }

  public void draw() {
    for (int i = 0; i < grid.length; ++i) {
      System.out.print("|");
      for (int j = 0; j < grid[0].length; ++j) {
        if (grid[i][j] == null ){
          System.out.print(" X |");
        } else {
          System.out.print(" " + grid[i][j].toString() + " |");
        }
      }
      System.out.println("\n");
    }
  }
}
