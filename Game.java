import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class Game {
  private static int level;
  private static int numPrey;
  private final static int MAX_NUM_PREY = 80;
  private static OceanGrid grid;

  public Game() {
    level = 1;
    numPrey = (level * 5);
  }

  public static void main(String[] args) {
    grid = new OceanGrid(10, 10, numPrey);
    grid.draw();
  }

  // public static void resetGrid() {
  //   for (int i = 0; i < grid.length; ++i) {
  //     for (int j = 0; j < grid[0].length; ++j) {
  //       grid[i][j] = 0;
  //     }
  //   }
  // }
}
