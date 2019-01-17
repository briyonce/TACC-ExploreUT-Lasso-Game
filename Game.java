import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class Game {
  private static int level;
  private static int numPrey;
  private final static int MAX_NUM_PREY = 80;
  private static int[][] grid = new int[10][10];;

  public Game() {
    level = 1;
    numPrey = (level * 5);
  }

  public static void main(String[] args) {
    drawGrid();
  }

  public static void drawGrid() {
    for (int i = 0; i < grid.length; ++i) {
      System.out.print("|");
      for (int j = 0; j < grid[0].length; ++j) {
        System.out.print(" " + grid[i][j] + " |");
      }
      System.out.println("\n");
    }
  }

  public static void resetGrid() {
    for (int i = 0; i < grid.length; ++i) {
      for (int j = 0; j < grid[0].length; ++j) {
        grid[i][j] = 0;
      }
    }
  }
}
